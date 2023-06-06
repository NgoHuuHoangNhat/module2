import case_study.model.impl_facility.Facility;
import case_study.model.impl_facility.impl_house.Room;
import case_study.model.impl_facility.impl_house.Villa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        String a = "2022-12-12";
        LocalDate b = LocalDate.parse(a);
        System.out.println(b.getYear());
    }
}