package case_study.repository;

import case_study.model.impl_facility.booking.Booking;

import java.util.Set;

public interface IBookingRepository{
    Set<Booking> getAll();

    Booking getById(String checkId);

    void add(Booking newBooking);
}
