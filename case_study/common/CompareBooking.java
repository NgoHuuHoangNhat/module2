package case_study.common;

import case_study.model.impl_facility.booking.Booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class CompareBooking implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date oFirstBookingDay = simpleDateFormat.parse(o1.getBookingDay());
            Date oSecondBookingDay = simpleDateFormat.parse(o2.getBookingDay());
            Date oFirstEndDay = simpleDateFormat.parse(o1.getRentalEndDay());
            Date oSecondEndDay = simpleDateFormat.parse(o2.getRentalEndDay());
            if (oFirstBookingDay.equals(oSecondBookingDay)) {
                return oSecondEndDay.compareTo(oFirstEndDay);
            } else {
                return oSecondBookingDay.compareTo(oFirstBookingDay);

            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
