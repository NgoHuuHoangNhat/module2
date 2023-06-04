package case_study.repository.impl;

import case_study.common.FileData;
import case_study.model.impl_facility.Facility;
import case_study.model.impl_facility.impl_house.House;
import case_study.model.impl_facility.impl_house.Room;
import case_study.model.impl_facility.impl_house.Villa;
import case_study.repository.IFacilityRepository;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private static final String VILLA_PATH = "case_study\\file\\villa.csv";
    private static final String HOUSE_PATH = "case_study\\file\\house.csv";
    private static final String ROOM_PATH = "case_study\\file\\room.csv";


    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
//    String serviceCode, String serviceName, float area, float rentalCosts,
//    int maxNumberOfPeople, String rentalType, String standardVilla, float areaOfSwimmingPool, int numberOfFloors)
        facilityIntegerMap.put(new Villa("VL-0001", "Villa rental",
                500, 10000000, 20, "Day", "Vip", 50, 7), 0);


        //        (String serviceCode, String serviceName, float area, float rentalCosts,
//        int maxNumberOfPeople, String rentalType, String standardHouse, int numberOfFloors)
        facilityIntegerMap.put(new House("HO-0001", "House rental", 200, 3000000, 10,
                "Month", "Vip", 2), 0);

//        String serviceCode, String serviceName, float area, float rentalCosts,
//        int maxNumberOfPeople, String rentalType, String voucher)
        facilityIntegerMap.put(new Room("RO-0001", "Room rental",
                50, 500000, 3, "hour", "voucher-1"), 0);

    }


    @Override
    public List<Villa> getVillaList() {
        List<String> villaList = FileData.readFromFile(VILLA_PATH);
        List<Villa> villas = new ArrayList<>();
        for (String e : villaList) {
            String[] info = e.split(",");
            villas.add(new Villa(info[0], info[1], Float.parseFloat(info[2]), Float.parseFloat(info[3]),
                    Integer.parseInt(info[4]), info[5], info[6],
                    Float.parseFloat(info[7]), Integer.parseInt(info[8])));
        }
        if (villas.size() == 0) {
            return null;
        } else {
            return villas;
        }
    }

    @Override
    public List<House> getHouseList() {
        List<String> stringList = FileData.readFromFile(HOUSE_PATH);
        List<House> houseList = new ArrayList<>();
        String[] info;

        for (String s : stringList) {
            info = s.split(",");
            houseList.add(new House(info[0], info[1], Float.parseFloat(info[2]), Float.parseFloat(info[3])
                    , Integer.parseInt(info[4]), info[5], info[6], Integer.parseInt(info[7])));
        }
        if (houseList.size() == 0) {
            return null;
        } else {
            return houseList;
        }
    }

    @Override
    public List<Room> getRooomList() {
        List<String> stringList = FileData.readFromFile(ROOM_PATH);
        List<Room> roomList = new ArrayList<>();
        String[] info;
        for (String room : stringList) {
            info = room.split(",");
            roomList.add(new Room(info[0], info[1], Float.parseFloat(info[2]), Float.parseFloat(info[3]),
                    Integer.parseInt(info[4]), info[5], info[6]));
        }
        if (roomList.size() == 0) {
            return null;
        } else {
            return roomList;
        }
    }

    @Override
    public Villa getVillaByCode(String code) {
        List<Villa> villaList = getVillaList();
        for (Villa villa : villaList) {
            if (villa.getServiceCode().equals(code)) {
                return villa;
            }
        }
        return null;
    }
}
