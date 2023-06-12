package case_study.repository;

import case_study.model.impl_facility.booking.Booking;
import case_study.model.impl_person.impl.Customer;
import case_study.service.IBookingService;

import java.util.List;
import java.util.Set;
import java.util.Stack;

public interface IBookingRepository {
    Set<Booking> getAll();

    Booking getById(String checkId);

    void add(Booking newBooking);

    List<Customer> getCustomerBookingInYear(String year);

    Stack<Customer> getCustomerBookingInCurrentYear();
}
