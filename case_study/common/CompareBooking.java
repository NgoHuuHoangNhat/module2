package case_study.common;

import case_study.model.impl_facility.booking.Booking;

import java.util.Comparator;

public class CompareBooking implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        if(o1.getRentalStartDay().equals(o2.getRentalStartDay())){
            return o1.getRentalEndDay().compareTo(o2.getRentalEndDay());
        }else{
            return o1.getRentalStartDay().compareTo(o2.getRentalStartDay());
        }
    }
}
