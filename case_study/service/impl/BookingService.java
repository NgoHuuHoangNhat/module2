package case_study.service.impl;

import case_study.common.InfoInputBooking;
import case_study.common.Regex;
import case_study.model.impl_facility.Facility;
import case_study.model.impl_facility.booking.Booking;
import case_study.model.impl_person.impl.Customer;
import case_study.repository.IBookingRepository;
import case_study.repository.ICustomerRepository;
import case_study.repository.IFacilityRepository;
import case_study.repository.impl.BookingRepository;
import case_study.repository.impl.CustomerRepository;
import case_study.repository.impl.FacilityRepository;
import case_study.service.IBookingService;
import case_study.service.ICustomerService;
import case_study.service.IFacilityService;
import com.sun.scenario.effect.impl.prism.ps.PPSBlend_ADDPeer;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookingService implements IBookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static IBookingRepository bookingRepository = new BookingRepository();
    private static ICustomerRepository customerRepository = new CustomerRepository();
    private static ICustomerService customerService = new CustomerService();
    private static IFacilityService facilityService = new FacilityService();
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        Set<Booking> bookingSet = bookingRepository.getAll();

        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }

    @Override
    public void create() {
        System.out.println("*****Booking List*****");
        Map<Facility, Integer> map = facilityRepository.getFacilityMap();
        Set<Facility> keySet = map.keySet();
        for (Facility facility : keySet) {
            System.out.println(facility);
        }
        while (true) {
            System.out.print("Enter booking id: ");
            String checkId = scanner.nextLine();
            if (!Regex.checkIDBooking(checkId)) {
                System.out.println("Booking id is wrong format, please re-input!");
            } else {
                Booking booking = bookingRepository.getById(checkId);
                if (booking != null) {
                    System.out.println("This booking id is already in list, please re-input!");
                } else {
                    String bookingDay = InfoInputBooking.enterBookingDay();
                    String rentalStartDay = InfoInputBooking.enterRentalStartDay(bookingDay);
                    String rentalEndDay = InfoInputBooking.enterRentalEndDay(rentalStartDay);

                    String customerId = "";

                    while (true) {
                        System.out.print("Enter customer id: ");
                        customerId = scanner.nextLine();
                        if (!Regex.checkIdCustomer(customerId)) {
                            System.out.println("Customer id is wrong format, please re-Input!");
                        } else {
                            Customer customer = customerRepository.getById(customerId);
                            if (customer == null) {
                                System.out.println("**Add new customer!**");
                                String customerStr = customerService.enterInfo(customerId);
                                customerRepository.add(customerStr);
                            }
                            break;
                        }
                    }
                    String facilityId = "";
                    Facility facility = null;
                    while (true) {
                        System.out.print("Enter facility id: ");
                        facilityId = scanner.nextLine();
                        if (!Regex.checkIdVilla(facilityId) && !Regex.checkIdHouse(facilityId) && !Regex.checkIdRoom(facilityId)) {
                            System.out.println("Facility id is wrong format, please re-input!");
                        } else {
                            facility = facilityRepository.getById(facilityId);
                            if (facility == null) {
                                System.out.println("The facility is not already in list, please re-input!");
                            } else {
                                break;
                            }
                        }
                    }
                    Booking newBooking = new Booking(checkId, bookingDay, rentalStartDay, rentalEndDay, customerId, facilityId);
                    bookingRepository.add(newBooking);
                    System.out.println("Booking has been created!");
                    facilityRepository.valueAddOne(facility);
                    break;
                }
            }
        }
    }

    @Override
    public void displayListCustomerUseService() {
        while (true) {
            System.out.print("Enter year: ");
            String year = scanner.nextLine();
            if (!Regex.checkYear(year)) {
                System.out.println("Year is wrong format, please re-input!");
            } else if (Integer.parseInt(year) < 2010 || Integer.parseInt(year) > LocalDate.now().getYear()) {
                System.out.println("Furama was born in 2010 and has been active until now, please enter the year in this time period!");
            } else {
                List<Customer> bookingList = bookingRepository.getCustomerBookingInYear(year);

                }
            }
        }
    }


