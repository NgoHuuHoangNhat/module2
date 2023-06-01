import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        System.out.println(current);
        LocalDate dOB = LocalDate.parse("2022-12-02");
        System.out.println(dOB);
//        int age = Period.between(dOB,current).getYears();
//        if(age>=18){
//
//        }

    }


}