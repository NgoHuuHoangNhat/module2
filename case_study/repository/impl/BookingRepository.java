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
import java.util.*;

public class BookingRepository implements IBookingRepository {
    private static Set<Booking> bookingTreeSet = new TreeSet<>(new CompareBooking());
    private static ICustomerRepository customerRepository = new CustomerRepository();
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    static {
        List<Customer> customerList = customerRepository.getAll();
        List<Villa> villaList = facilityRepository.getVillaList();
        List<House> houseList = facilityRepository.getHouseList();
        List<Room> roomList = facilityRepository.getRooomList();
//        String bookingId, String bookingDay, String rentalStartDay,
//                String rentalEndDay, String customerId, String facilityId
        bookingTreeSet.add(new Booking("BK-0001", "2023-12-12", "30-12-2021", "15-01-2022",
                customerList.get(0).getId(), villaList.get(0).getServiceCode()));

        bookingTreeSet.add(new Booking("BK-0002", "2023-12-04", "05-12-2021", "30-12-2021",
                customerList.get(0).getId(), houseList.get(0).getServiceCode()));

        bookingTreeSet.add(new Booking("BK-0003", "2023-12-24", "05-01-2022", "30-01-2022",
                customerList.get(1).getId(), roomList.get(0).getServiceCode()));

    }

    @Override
    public Set<Booking> getAll() {
        return bookingTreeSet;
    }

    @Override
    public Booking getById(String checkId) {
        for (Booking booking : bookingTreeSet) {
            if (booking.getBookingId().equals(checkId)) {
                return booking;
            }
        }
        return null;
    }

    @Override
    public void add(Booking newBooking) {
        bookingTreeSet.add(newBooking);
    }

    @Override
    public List<Customer> getCustomerBookingInYear(String year) {
        Queue<String> customerIdList = new LinkedList<>();
        for (Booking booking : bookingTreeSet) {
            int bookingOfYear = LocalDate.parse(booking.getBookingDay()).getYear();
            if (bookingOfYear == Integer.parseInt(year)) {
                customerIdList.add(booking.getCustomerId());
            }
        }
        List<Customer> customers = new ArrayList<>();
        List<Customer> customerList = customerRepository.getAll();
        for (Customer customer : customerList) {
            if (customerIdList.size() == 0) {
                break;
            }
            if (customer.getId().equals(customerIdList.poll())) {
                customers.add(customer);
            }
        }
        if (customers.size() != 0) {
            return customers;
        }
        return null;
    }

    @Override
    public Stack<Customer> getCustomerBookingInCurrentYear() {
        Stack<Customer> customerStack = new Stack<>();
        Queue<String> customerIdList = new LinkedList<>();
        for (Booking booking : bookingTreeSet) {
            int bookingYear = LocalDate.parse(booking.getBookingDay()).getYear();
            if(bookingYear == LocalDate.now().getYear()){
                customerIdList.add(booking.getCustomerId());
            }
        }

        for (Customer customer : customerRepository.getAll()) {
            if(customerIdList.size() ==0){
                break;
            }
            if (customer.getId().equals(customerIdList.poll())){
                customerStack.add(customer);
            }
        }
        if(customerStack.size() == 0){
            return null;
        }
        return customerStack;
    }


}
