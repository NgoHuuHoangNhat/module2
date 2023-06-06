package case_study.service.impl;

import case_study.common.ChoiceException;
import case_study.common.InfoInputBooking;
import case_study.common.Regex;
import case_study.model.impl_facility.Facility;
import case_study.model.impl_facility.booking.Booking;
import case_study.model.impl_facility.contract.Contract;
import case_study.repository.IContractRepository;
import case_study.repository.IFacilityRepository;
import case_study.repository.impl.ContractRepository;
import case_study.repository.impl.FacilityRepository;
import case_study.service.IContractService;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ContractService implements IContractService {

    private static Scanner scanner = new Scanner(System.in);
    private static IContractRepository contractRepository = new ContractRepository();
    private static List<Contract> contractList = new ArrayList<>();
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void createContract() {
//        String contractId, String bookingId, long deposit, long payment
        while (true) {
            System.out.print("Enter contract id: ");
            String contractId = scanner.nextLine();
            if (!Regex.checkIDContract(contractId)) {
                System.out.println("Contract id is wrong format, please re-input!");
            } else {
                Contract contract = contractRepository.getContractById(contractId);
                if (contract != null) {
                    System.out.println("This contract is already in the list, please re-input!");
                } else {
                    String bookingId = contractRepository.getEarliestBooking();
                    if (bookingId == null) {
                        System.out.println("This booking list is empty!");
                        return;
                    } else {
                        long deposit = 0;
                        while (true) {
                            System.out.print("Enter deposit: ");
                            try {
                                deposit = Long.parseLong(scanner.nextLine());
                                if (deposit < 500000) {
                                    System.out.println("Deposit must be more than 500, please re-input!");
                                } else {
                                    break;
                                }
                            } catch (NumberFormatException numberFormatException) {
                                ChoiceException.choiceException();
                            }
                        }

                        long payment = 0;
                        while (true) {
                            System.out.print("Enter payment:");
                            try {
                                payment = Long.parseLong(scanner.nextLine());
                                if (payment < deposit) {
                                    System.out.println("Payment must be more than deposit, please re-input!");
                                } else {
                                    break;
                                }
                            } catch (NumberFormatException numberFormatException) {
                                ChoiceException.choiceException();
                            }
                        }
                        Contract newContract = new Contract(contractId, bookingId, deposit, payment);
                        contractRepository.add(newContract);
                        System.out.println("This contract has created!");
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void displayContractList() {
        List<Contract> contracts = contractRepository.getAll();
        if (contracts.size() == 0) {
            System.out.println("Contract list is empty!");
        } else {
            for (Contract contract : contracts) {
                System.out.println(contract);
            }
        }
    }

    @Override
    public void editContract() {
        while (true) {
            System.out.print("Enter contract id: ");
            String contractId = scanner.nextLine();
            if (!Regex.checkIDContract(contractId)) {
                System.out.println("Contract id is wrong format, please re-input!");
            } else {
                Contract contract = contractRepository.getContractById(contractId);
                if (contract == null) {
                    System.out.println("This contract is not already in list, please re-input!");
                } else {

                    long deposit = 0;
                    while (true) {
                        System.out.print("Enter deposit: ");
                        try {
                            deposit = Long.parseLong(scanner.nextLine());
                            if (deposit < 500000) {
                                System.out.println("Deposit must be more than 500, please re-input!");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            ChoiceException.choiceException();
                        }
                    }
                    long payment = 0;
                    while (true) {
                        System.out.print("Enter payment:");
                        try {
                            payment = Long.parseLong(scanner.nextLine());
                            if (payment < deposit) {
                                System.out.println("Payment must be more than deposit, please re-input!");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            ChoiceException.choiceException();
                        }
                    }

                    contractRepository.editContract(contract, deposit, payment);
                    System.out.println("This contract has been added!");
                    break;
                }
            }
        }
    }
//        String contractId, String bookingId, long deposit, long payment


}
