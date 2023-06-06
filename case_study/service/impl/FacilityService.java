package case_study.service.impl;

import case_study.common.ChoiceException;
import case_study.common.InfoInputFacility;
import case_study.common.Regex;
import case_study.model.impl_facility.Facility;
import case_study.model.impl_facility.impl_house.House;
import case_study.model.impl_facility.impl_house.Room;
import case_study.model.impl_facility.impl_house.Villa;
import case_study.repository.IFacilityRepository;
import case_study.repository.impl.FacilityRepository;
import case_study.service.IFacilityService;
import com.sun.corba.se.impl.legacy.connection.USLPort;

import java.util.*;

public class FacilityService implements IFacilityService {

    private static Scanner scanner = new Scanner(System.in);
    private static IFacilityRepository facilityRepository = new FacilityRepository();
    private static List<Villa> villaList = facilityRepository.getVillaList();
    private static List<House> houseList = facilityRepository.getHouseList();
    private static List<Room> roomList = facilityRepository.getRooomList();
    private static int choice;

    @Override
    public void display() {
        while (true) {
            System.out.println("Which facility do you want to display?\n" +
                    "1. Villa\n" +
                    "2. House\n" +
                    "3. Room\n" +
                    "4. All\n" +
                    "5. Return Facility Management" +
                    "Option: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("*****Villa***** ");
                        if (villaList == null) {
                            System.out.println("Currently, there is no villa!");
                        } else {
                            for (Villa villa : villaList) {
                                System.out.println(villa);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("*****House***** ");
                        if (houseList == null) {
                            System.out.println("Currently, there is no house!");
                        } else {
                            for (House house : houseList) {
                                System.out.println(house);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("*****Room*****");
                        if (roomList == null) {
                            System.out.println("Currently, there is no room!");
                        } else {
                            for (Room room : roomList) {
                                System.out.println(room);
                            }
                        }
                        break;
                    case 4:
                        displayAllFacility();
                        break;
                    case 5:
                        return;
                    default:
                        ChoiceException.choiceIsNotAvailable();
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }
    }

    @Override
    public void displayAllFacility() {

        System.out.println("*****Villa*****");
        if (villaList == null) {
            System.out.println("Currently, there is no villa!");
        } else {
            for (Villa villa : villaList) {
                System.out.println(villa);
            }
        }
        System.out.println("*****House*****");
        if (houseList == null) {
            System.out.println("Currently, there is no house!");
        } else {
            for (House house : houseList) {
                System.out.println(house);
            }
        }
        System.out.println("*****Room***** ");
        if (roomList == null) {
            System.out.println("Currently, there is no room!");
        } else {
            for (Room room : roomList) {
                System.out.println(room);
            }
        }
    }

    @Override
    public void addFacility() {
        while (true) {
            System.out.print("Which facility would you like to add?\n" +
                    "1. Villa\n" +
                    "2. House\n" +
                    "3. Room\n" +
                    "4. Return Facility Management\n" +
                    "Option: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addVilla();
                        break;
                    case 2:
                        addHouse();
                        break;
                    case 3:
                        addRoom();
                        break;
                    case 4:
                        return;
                    default:
                        ChoiceException.choiceIsNotAvailable();
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }
    }

    @Override
    public void removeFacilityList() {
        while (true) {
            System.out.print("Which facility would you like to remove: \n" +
                    "1. Villa\n" +
                    "2. House\n" +
                    "3. Room\n" +
                    "4. Return Facility Management\n" +
                    "Option: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        removeVilla();
                        break;
                    case 2:
                        removeHouse();
                        break;
                    case 3:
                        removeRoom();
                        break;
                    case 4:
                        return;
                    default:
                        ChoiceException.choiceIsNotAvailable();
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                ChoiceException.choiceException();
            }
        }
    }

    @Override
    public void displayMaintenance() {
        System.out.println("Facilities need maintenance");
        List<Facility> facilityList = facilityRepository.getMaintenanceList();
        if (facilityList.size() == 0) {
            System.out.println("No facilities need maintenance!");
        } else {
            for (Facility facility : facilityList) {
                System.out.println(facility);
            }
        }
    }

    @Override
    public void clearMaintenance() {
        facilityRepository.clearMaintenanceAndPutMap();
        System.out.println("Maintenance list has been removed!");

    }

    private void removeRoom() {
        while (true) {
            System.out.print("Enter room service name: ");
            String roomId = scanner.nextLine();
            if (!Regex.checkIdRoom(roomId)) {
                System.out.println("Room service code is not wrong format, please re-input!");
            } else {
                Room room = facilityRepository.getRoomById(roomId);
                if (room == null) {
                    System.out.println("This room is not already in the list, please re-input!");
                } else {
                    System.out.print("Do you want to remove the room?\n" +
                            "Enter yes to agree remove: ");
                    String option = scanner.nextLine();
                    if (!option.toLowerCase().equals("yes")) {
                        return;
                    } else {
                        facilityRepository.removeRoom(room);
                        System.out.println("This house has been removed in the list!");
                        break;
                    }
                }
            }
        }
    }

    private void removeHouse() {
        while (true) {
            System.out.print("Enter house service name: ");
            String houseId = scanner.nextLine();
            if (!Regex.checkIdHouse(houseId)) {
                System.out.println("House service code is not wrong format, please re-input!");
            } else {
                House house = facilityRepository.getHouseByCode(houseId);
                if (house == null) {
                    System.out.println("This house is not already in the list, please re-input!");
                } else {
                    System.out.print("Do you want to remove the house?\n" +
                            "Enter yes to agree remove: ");
                    String option = scanner.nextLine();
                    if (!option.toLowerCase().equals("yes")) {
                        return;
                    } else {
                        facilityRepository.removeHouse(house);
                        System.out.println("This house has been removed in the list!");
                        break;
                    }
                }
            }

        }
    }

    private void removeVilla() {
        while (true) {
            System.out.print("Enter villa service code: ");
            String villaId = scanner.nextLine();
            if (!Regex.checkIdVilla(villaId)) {
                System.out.println("Villa service code is wrong format, please re-input!");
            } else {
                Villa villa = facilityRepository.getVillaByCode(villaId);
                if (villa == null) {
                    System.out.println("This villa is not already in the list, please re-input!");
                } else {
                    System.out.print("Do you want to remove this villa?\n" +
                            "Enter yes to agree remove: ");
                    String option = scanner.nextLine();
                    if (!option.toLowerCase().equals("yes")) {
                        return;
                    } else {
                        facilityRepository.removeVilla(villa);
                        System.out.println("This villa has been removed from the list!");
                        break;
                    }
                }
            }
        }
    }

    private void addRoom() {
        while (true) {
            System.out.print("Enter room service code: ");
            String roomId = scanner.nextLine();
            if (!Regex.checkIdRoom(roomId)) {
                System.out.println("Room service code is wrong format, please re-input!");
            } else {
                Room room = facilityRepository.getRoomById(roomId);
                if (room != null) {
                    System.out.println("This room is already in the list, please re-input!");
                } else {
                    String roomStr = enterInfo(roomId);
                    String voucher = InfoInputFacility.enterVoucher();
                    roomStr += "," + voucher;
                    facilityRepository.addRoom(roomStr);
                    System.out.println("This room has been added to the room list!");
                    break;
                }

            }
        }
    }

    private void addHouse() {

        while (true) {
            System.out.print("Enter house service code: ");
            String houseId = scanner.nextLine();
            if (!Regex.checkIdHouse(houseId)) {
                System.out.println("The house code is wrong format, please re-input!");
            } else {
                House house = facilityRepository.getHouseByCode(houseId);
                if (house != null) {
                    System.out.println("The house is already in the list, please re-input");
                } else {
                    String houseStr = enterInfo(houseId);
                    String standard = InfoInputFacility.enterStandard();
                    int numberOfFloor = InfoInputFacility.enterNumberFloor();
                    houseStr += "," + standard + "," + numberOfFloor;
                    facilityRepository.addHouse(houseStr);
                    System.out.println("The house has been added to the list!");
                    break;
                }
            }
        }
    }

    public void addVilla() {

        while (true) {
            System.out.print("Enter villa service code: ");
            String checkId = scanner.nextLine();
            if (!Regex.checkIdVilla(checkId)) {
                System.out.println("The villa code is wrong format, please re-input!");
            } else {
                Villa villa = facilityRepository.getVillaByCode(checkId);
                if (villa != null) {
                    System.out.println("The villa is already in list, please re-input!");
                } else {
                    String villaStr = enterInfo(checkId);
                    String standard = InfoInputFacility.enterStandard();
                    float areaOfSwimmingPool = InfoInputFacility.enterAreaOfSwimmingPool();
                    int numberFloor = InfoInputFacility.enterNumberFloor();
                    villaStr += "," + standard + "," + areaOfSwimmingPool + "," + numberFloor;
                    facilityRepository.addVilla(villaStr);
                    System.out.println("This villa has been added to the list!");
                    break;
                }
            }
        }
    }

    private String enterInfo(String id) {
        String serviceName = InfoInputFacility.enterServiceName();

        float area = InfoInputFacility.enterArea();

        float rentalCost = InfoInputFacility.enterRentalCost();

        int numberOfPeople = InfoInputFacility.enterNumberOfPeople();

        String rentalType = InfoInputFacility.enterRentalType();

        String info = id + "," + serviceName + "," + area + "," + rentalCost + "," + numberOfPeople + "," + rentalType;

        return info;
    }


}
























































