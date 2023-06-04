package case_study.service.impl;

import case_study.common.ChoiceException;
import case_study.common.Regex;
import case_study.model.impl_facility.Facility;
import case_study.model.impl_facility.impl_house.House;
import case_study.model.impl_facility.impl_house.Room;
import case_study.model.impl_facility.impl_house.Villa;
import case_study.repository.IFacilityRepository;
import case_study.repository.impl.FacilityRepository;
import case_study.service.IFacilityService;

import java.util.*;

public class FacilityService implements IFacilityService {

    private static Scanner scanner = new Scanner(System.in);
    private static IFacilityRepository facilityRepository = new FacilityRepository();
    private static int choice;

    @Override
    public void display() {
        while (true) {
            System.out.println("Which facility do you want to display?\n" +
                    "1. Villa\n" +
                    "2. House\n" +
                    "3. Rooom\n" +
                    "4. All\n" +
                    "5. Return Facility Management" +
                    "Option: ");
            List<Villa> villaList = facilityRepository.getVillaList();
            List<House> houseList = facilityRepository.getHouseList();
            List<Room> roomList = facilityRepository.getRooomList();
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
                        System.out.println("*****Room***** ");
                        if (roomList == null) {
                            System.out.println("Currently, there is no room!");
                        } else {
                            for (Room room : roomList) {
                                System.out.println(room);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("*****Villa***** ");
                        if (villaList == null) {
                            System.out.println("Currently, there is no villa!");
                        } else {
                            for (Villa villa : villaList) {
                                System.out.println(villa);
                            }
                        }
                        System.out.println("*****House***** ");
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
                        while (true) {
                            System.out.print("Enter villa service code: ");
                            String checkId = scanner.nextLine();
                            if (!Regex.checkIdVilla(checkId)) {
                                System.out.println("The villa code is wrong format, please re-input!");
                            } else {
                                Villa villa = facilityRepository.getVillaByCode(checkId);
                                if (villa != null) {
                                    System.out.println("The villa is already in list, please re-input!");
                                }else {
                                    String villaStr = enterInfo();
                                    facilityRepository.add(villaStr);
                                    System.out.println("This villa has been added to the list!");
                                }
                            }
                        }
                        break;
                    case 2: // house
                        break;
                    case 3://room
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

    private String enterInfo() {
        
    }


}
