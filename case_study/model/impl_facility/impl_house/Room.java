package case_study.model.impl_facility.impl_house;

import case_study.model.impl_facility.Facility;

public class Room extends Facility {
    private String voucher;

    public Room(String serviceCode, String serviceName, float area, float rentalCosts, int maxNumberOfPeople, String rentalType, String voucher) {
        super(serviceCode, serviceName, area, rentalCosts, maxNumberOfPeople, rentalType);
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "voucher= " + voucher +
                '}';
    }
}
