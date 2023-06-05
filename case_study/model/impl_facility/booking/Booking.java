package case_study.model.impl_facility.booking;

import java.util.Objects;

public class Booking {
    //    mã booking, ngày booking, ngày bắt đầu thuê, ngày kết thúc thuê, mã khách hàng, mã dịch vụ.
    private String bookingId;
    private String bookingDay;
    private String rentalStartDay;
    private String rentalEndDay;
    private String customerId;
    private String facilityId;

    public Booking(String bookingId, String bookingDay, String rentalStartDay,
                   String rentalEndDay, String customerId, String facilityId) {
        this.bookingId = bookingId;
        this.bookingDay = bookingDay;
        this.rentalStartDay = rentalStartDay;
        this.rentalEndDay = rentalEndDay;
        this.customerId = customerId;
        this.facilityId = facilityId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(String bookingDay) {
        this.bookingDay = bookingDay;
    }

    public String getRentalStartDay() {
        return rentalStartDay;
    }

    public void setRentalStartDay(String rentalStartDay) {
        this.rentalStartDay = rentalStartDay;
    }

    public String getRentalEndDay() {
        return rentalEndDay;
    }

    public void setRentalEndDay(String rentalEndDay) {
        this.rentalEndDay = rentalEndDay;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId= " + bookingId +
                ", bookingDay= " + bookingDay +
                ", rentalStartDay= " + rentalStartDay +
                ", rentalEndDay= " + rentalEndDay +
                ", customerId= " + customerId +
                ", facilityId= " + facilityId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingId, booking.bookingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId);
    }


}
