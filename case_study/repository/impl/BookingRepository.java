package case_study.repository.impl;

import case_study.common.CompareBooking;
import case_study.model.impl_facility.booking.Booking;
import case_study.model.impl_facility.impl_house.House;
import case_study.model.impl_facility.impl_house.Room;
import case_study.model.impl_facility.impl_house.Villa;
import case_study.model.impl_person.impl.Customer;
import case_study.repository.IBookingRepository;
import case_study.repository.ICustomerRepository;
import case_study.repository.IFacilityRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static Set<Booking> bookingSet = new TreeSet<>(new CompareBooking());
    private static ICustomerRepository customerRepository = new CustomerRepository();
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    static {
        List<Customer> customerList = customerRepository.getAll();
        List<Villa> villaList = facilityRepository.getVillaList();
        List<House> houseList = facilityRepository.getHouseList();
        List<Room> roomList = facilityRepository.getRooomList();
//        String bookingId, String bookingDay, String rentalStartDay,
//                String rentalEndDay, String customerId, String facilityId
        bookingSet.add(new Booking("BK-0001", "2021-12-12", "30-12-2021", "15-01-2022",
                customerList.get(0).getId(), villaList.get(0).getServiceCode()));

        bookingSet.add(new Booking("BK-0002", "2022-12-04", "05-12-2021", "30-12-2021",
                customerList.get(0).getId(), houseList.get(0).getServiceCode()));

        bookingSet.add(new Booking("BK-0003", "2021-12-24", "05-01-2022", "30-01-2022",
                customerList.get(0).getId(), roomList.get(0).getServiceCode()));

    }

    @Override
    public Set<Booking> getAll() {
        return bookingSet;
    }

    @Override
    public Booking getById(String checkId) {
        for (Booking booking : bookingSet) {
            if (booking.getBookingId().equals(checkId)) {
                return booking;
            }
        }
        return null;
    }

    @Override
    public void add(Booking newBooking) {
        bookingSet.add(newBooking);
    }

    @Override
    public List<Customer> getCustomerBookingInYear(String year) {
        List<Booking> bookingList = new ArrayList<>();
        for (Booking booking : bookingSet) {
            int bookingOfYear = LocalDate.parse(booking.getBookingDay()).getYear();
            if(bookingOfYear == Integer.parseInt(year)){
                bookingList.add(booking);
            }
        }

        for (Booking booking: bookingList) {

        }
        return null;
    }


}
