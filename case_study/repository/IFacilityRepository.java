package case_study.repository;

import case_study.model.impl_facility.Facility;
import case_study.model.impl_facility.impl_house.House;
import case_study.model.impl_facility.impl_house.Room;
import case_study.model.impl_facility.impl_house.Villa;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    Facility getById(String id);

    List<Facility> getAll();

    List<Villa> getVillaList();

    List<House> getHouseList();

    List<Room> getRooomList();

    Villa getVillaByCode(String code);

    void addVilla(String villaStr);

    House getHouseByCode(String houseCode);

    void addHouse(String houseStr);

    Room getRoomById(String roomId);

    void addRoom(String roomStr);

    void removeVilla(Villa villa);

    void removeHouse(House house);

    void removeRoom(Room room);

    Map<Facility, Integer> getFacilityMap();

    void valueAddOne(Facility facility);

    List<Facility> getMaintenanceList();

    void clearMaintenanceAndPutMap();
}
