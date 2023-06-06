package case_study.repository.impl;

import case_study.common.FileData;
import case_study.model.impl_facility.Facility;
import case_study.model.impl_facility.impl_house.House;
import case_study.model.impl_facility.impl_house.Room;
import case_study.model.impl_facility.impl_house.Villa;
import case_study.repository.IFacilityRepository;

import java.io.File;
import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private static final String VILLA_PATH = "case_study\\file\\villa.csv";
    private static final String HOUSE_PATH = "case_study\\file\\house.csv";
    private static final String ROOM_PATH = "case_study\\file\\room.csv";

    private static List<Villa> villaList = new ArrayList<>();
    private static List<House> houseList = new ArrayList<>();
    private static List<Room> roomList = new ArrayList<>();
    private static List<Facility> facilityList = new ArrayList<>();

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static List<Facility> maintenanceList = new ArrayList<>();
    private static List<String> stringList = new ArrayList<>();

    {
//        facilityIntegerMap.put(new Villa("SVVL-0001", "Villa rental",
//                500, 10000000, 20, "Day", "Vip", 50, 7), 0);
//
//
//        facilityIntegerMap.put(new House("SVHO-0001", "House rental", 200, 3000000, 10,
//                "Month", "Vip", 2), 0);
//
//        facilityIntegerMap.put(new Room("SVRO-0001", "Room rental",
//                50, 500000, 3, "hour", "voucher-1"), 0);
        villaList = getVillaList();
        for (Villa villa : villaList) {
            facilityIntegerMap.put(villa, 0);
        }
        houseList = getHouseList();
        for (House house : houseList) {
            facilityIntegerMap.put(house, 4);
        }
        roomList = getRooomList();
        for (Room room : roomList) {
            facilityIntegerMap.put(room, 0);
        }
    }


    @Override
    public Facility getById(String id) {
//        List<Facility> facilityList = getAll();
//        for (Facility facility : facilityList) {
//            if (facility.getServiceCode().equals(id)) {
//                return facility;
//            }
//        }
//        return null;
        Set<Facility> keySet = facilityIntegerMap.keySet();
        for (Facility facility : keySet) {
            if (facility.getServiceCode().equals(id)) {
                return facility;
            }
        }
        return null;
    }

    @Override
    public List<Facility> getAll() {
        villaList = getVillaList();
        houseList = getHouseList();
        roomList = getRooomList();
        facilityList.addAll(villaList);
        facilityList.addAll(houseList);
        facilityList.addAll(roomList);
        return facilityList;
    }

    @Override
    public List<Villa> getVillaList() {
        stringList.clear();
        stringList = FileData.readFromFile(VILLA_PATH);
        villaList.clear();
        for (String e : stringList) {
            String[] info = e.split(",");
            villaList.add(new Villa(info[0], info[1], Float.parseFloat(info[2]), Float.parseFloat(info[3]),
                    Integer.parseInt(info[4]), info[5], info[6],
                    Float.parseFloat(info[7]), Integer.parseInt(info[8])));
        }
        if (villaList.size() == 0) {
            return null;
        } else {
            return villaList;
        }
    }

    @Override
    public List<House> getHouseList() {
        stringList.clear();
        stringList = FileData.readFromFile(HOUSE_PATH);
        houseList.clear();
        String[] info;
///        (String serviceCode, String serviceName, float area, float rentalCosts,
//        int maxNumberOfPeople, String rentalType, String standardHouse, int numberOfFloors)

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
        stringList.clear();
        stringList = FileData.readFromFile(ROOM_PATH);
        roomList.clear();
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
        villaList = getVillaList();
        try {
            for (Villa villa : villaList) {
                if (villa.getServiceCode().equals(code)) {
                    return villa;
                }
            }
        } catch (NullPointerException nullPointerException) {

        }
        return null;
    }

    @Override
    public void addVilla(String villaStr) {
        stringList.clear();
        stringList.add(villaStr);
        FileData.writeToFile(stringList, VILLA_PATH, true);
        String[] info = villaStr.split(",");
        facilityIntegerMap.put(new Villa(info[0], info[1], Float.parseFloat(info[2]), Float.parseFloat(info[3]),
                Integer.parseInt(info[4]), info[5], info[6],
                Float.parseFloat(info[7]), Integer.parseInt(info[8])), 0);
    }

    @Override
    public House getHouseByCode(String houseCode) {
        houseList = getHouseList();
        try {
            for (House house : houseList) {
                if (house.getServiceCode().equals(houseCode)) {
                    return house;
                }
            }
        } catch (NullPointerException nullPointerException) {

        }
        return null;
    }

    @Override
    public void addHouse(String houseStr) {
        stringList.clear();
        stringList.add(houseStr);
        FileData.writeToFile(stringList, HOUSE_PATH, true);
        String[] info = houseStr.split(",");
        facilityIntegerMap.put(new House(info[0], info[1], Float.parseFloat(info[2]), Float.parseFloat(info[3])
                , Integer.parseInt(info[4]), info[5], info[6], Integer.parseInt(info[7])), 0);
    }

    @Override
    public Room getRoomById(String roomId) {
        roomList = getRooomList();

        try {
            for (Room room : roomList) {
                if (room.getServiceCode().equals(roomId)) {
                    return room;
                }
            }
        } catch (NullPointerException nullPointerException) {

        }
        return null;
    }

    @Override
    public void addRoom(String roomStr) {
        stringList.clear();
        stringList.add(roomStr);
        FileData.writeToFile(stringList, ROOM_PATH, true);
        String[] info = roomStr.split(",");
        facilityIntegerMap.put(new Room(info[0], info[1], Float.parseFloat(info[2]), Float.parseFloat(info[3]),
                Integer.parseInt(info[4]), info[5], info[6]), 0);
    }

    //    String serviceCode, String serviceName, float area, float rentalCosts,
//    int maxNumberOfPeople, String rentalType, String standardVilla, float areaOfSwimmingPool, int numberOfFloors)
    @Override
    public void removeVilla(Villa villa) {
        villaList = getVillaList();
        stringList.clear();
        for (Villa v : villaList) {
            if (!v.equals(villa)) {
                stringList.add(v.getServiceCode() + "," + v.getServiceName() + "," + v.getArea() + "," + v.getRentalCosts()
                        + "," + v.getMaxNumberOfPeople() + "," + v.getRentalType() + "," + v.getStandardVilla() + "," +
                        v.getAreaOfSwimmingPool() + "," + v.getNumberOfFloors());
            }
        }
        FileData.writeToFile(stringList, VILLA_PATH, false);
        facilityIntegerMap.remove(villa);
    }

    //        (String serviceCode, String serviceName, float area, float rentalCosts,
//        int maxNumberOfPeople, String rentalType, String standardHouse, int numberOfFloors)
    @Override
    public void removeHouse(House house) {
        houseList = getHouseList();
        stringList.clear();
        for (House h : houseList) {
            if (!h.equals(house)) {
                stringList.add(h.getServiceCode() + "," + h.getServiceName() + "," + h.getArea() + "," + h.getRentalCosts() + "," +
                        h.getMaxNumberOfPeople() + "," + h.getRentalType() + "," + h.getStandardHouse() + "," + h.getNumberOfFloors());
            }
        }
        FileData.writeToFile(stringList, HOUSE_PATH, false);
        facilityIntegerMap.remove(house);
    }

    //    String serviceCode, String serviceName, float area, float rentalCosts,
//            int maxNumberOfPeople, String rentalType, String voucher)
    @Override
    public void removeRoom(Room room) {
        roomList = getRooomList();
        stringList.clear();
        for (Room r : roomList) {
            if (!r.equals(room)) {
                stringList.add(r.getServiceCode() + "," + r.getServiceName() + "," + r.getArea() + "," + r.getRentalCosts() + "," +
                        r.getMaxNumberOfPeople() + "," + r.getRentalType() + "," + r.getVoucher());
            }
        }
        FileData.writeToFile(stringList, HOUSE_PATH, false);
        facilityIntegerMap.remove(room);
    }

    @Override
    public Map<Facility, Integer> getFacilityMap() {
        return facilityIntegerMap;
    }

    @Override
    public void valueAddOne(Facility facility) {
        Set<Facility> keySet = facilityIntegerMap.keySet();
        int count = 0;
        for (Facility key : keySet) {
            if (key.equals(facility)) {
                count = facilityIntegerMap.get(key);
                break;
            }
        }
        count++;
        facilityIntegerMap.replace(facility, count);
        if (count == 5) {
            facilityIntegerMap.remove(facility);
            maintenanceList.add(facility);
        }
    }

    @Override
    public List<Facility> getMaintenanceList() {
        return maintenanceList;
    }

    @Override
    public void clearMaintenanceAndPutMap() {
        if (maintenanceList.size() == 0) {
            System.out.println("Maintenance list is empty!");
        } else {
            for (Facility facility : maintenanceList) {
                facilityIntegerMap.put(facility, 0);
            }
            maintenanceList.clear();
        }
    }

}



























