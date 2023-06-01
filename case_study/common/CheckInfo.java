package case_study.common;

import ss1.thuc_hanh.Date;

import java.time.LocalDate;
import java.time.Period;

public class CheckInfo {
    public static boolean checkAgeOlderThanEighteen(String dateOfBirth){
        LocalDate current = LocalDate.now();
        LocalDate dOB = LocalDate.parse(dateOfBirth);
        int age = Period.between(dOB,current).getYears();
        if(age>=18){
        return true;
        }
        return false;
    }
}
