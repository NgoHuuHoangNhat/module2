package case_study.service;

import case_study.model.impl_facility.booking.Booking;
import case_study.model.impl_facility.contract.Contract;

public interface IBookingService extends IService<Booking> {
    void displayListCustomerUseService();

    void displayListCustomerGetVoucher();
}
