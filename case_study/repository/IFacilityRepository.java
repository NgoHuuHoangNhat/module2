package case_study.repository;

import case_study.model.impl_facility.Facility;
import case_study.model.impl_facility.impl_house.House;
import case_study.model.impl_facility.impl_house.Room;
import case_study.model.impl_facility.impl_house.Villa;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository {

    List<Villa> getVillaList();

    List<House> getHouseList();

    List<Room> getRooomList();

    Villa getVillaByCode(String code);
}
