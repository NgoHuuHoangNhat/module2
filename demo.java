import case_study.model.impl_facility.Facility;
import case_study.model.impl_facility.impl_house.Room;
import case_study.model.impl_facility.impl_house.Villa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        Map<Facility, Integer> map = new LinkedHashMap<>();
        map.put(new Villa("1", "1", 1, 1,
                1, "1", "1", 1, 1), 0);
        map.put(new Villa("2", "2", 2, 2,
                2, "2", "2", 2, 2), 0);

        map.put(new Room("1", "1", 1, 1,
                1, "1", "1"), 0);
        map.put(new Room("2", "2", 2, 2,
                2, "2", "2"), 0);


        Set<Facility> keyVilla = map.keySet();
        Set<Facility> keyRoom = map.keySet();

        for (Facility key : keyRoom) {
            if(key instanceof Villa)
            System.out.println(key + ",  " + map.get(key));
        }
//
//        for (Facility key : keyRoom) {
//            System.out.println(key + ",  " + map.get(key));
//        }


    }
}