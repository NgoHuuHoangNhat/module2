package case_study.repository.impl;

import case_study.model.impl_facility.booking.Booking;
import case_study.model.impl_facility.contract.Contract;
import case_study.repository.IBookingRepository;
import case_study.repository.IContractRepository;

import java.util.*;

public class ContractRepository implements IContractRepository {
    private static IBookingRepository bookingRepository = new BookingRepository();
    private static Queue<Booking> bookingQueue = new LinkedList<>();
    private static List<Contract> contractList = new ArrayList<>();

    static {
        Set<Booking> bookingSet = bookingRepository.getAll();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
//        String numberOfContract, String contractId, long deposit, long payment
//        contractList.add(new Contract("CT-0001",bookingQueue.poll().getBookingId(),1000000,5000000));
//        contractList.add(new Contract("CT-0001",bookingQueue.poll().getBookingId(),1000000,5000000));
//        contractList.add(new Contract("CT-0001",bookingQueue.poll().getBookingId(),1000000,5000000));
    }


    @Override
    public List<Contract> getContractList() {
        return contractList;
    }

    @Override
    public Contract getContractById(String contractId) {
        for (Contract contract : contractList) {
            if (contract.getContractId().equals(contractId)) {
                return contract;
            }
        }
        return null;
    }

    @Override
    public String getEarliestBooking() {
        if (bookingQueue.size() != 0) {
            return bookingQueue.poll().getBookingId();
        }else {
            return null;
        }
    }

    @Override
    public void add(Contract newContract) {
        contractList.add(newContract);
    }

    @Override
    public List<Contract> getAll() {
        return contractList;
    }

    @Override
    public void editContract(Contract contract, long deposit, long payment) {
        for (Contract e : contractList) {
            if(e.equals(contract)){
                e.setDeposit(deposit);
                e.setPayment(payment);
            }
        }
    }

}
