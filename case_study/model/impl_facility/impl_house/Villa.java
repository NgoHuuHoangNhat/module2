package case_study.model.impl_facility.impl_house;

import case_study.model.impl_facility.Facility;

public class Villa extends Facility {
    private String standardVilla;
    private float areaOfSwimmingPool;
    private int numberOfFloors;

    public Villa(String serviceCode, String serviceName, float area, float rentalCosts,
                 int maxNumberOfPeople, String rentalType, String standardVilla, float areaOfSwimmingPool, int numberOfFloors) {
        super(serviceCode, serviceName, area, rentalCosts, maxNumberOfPeople, rentalType);
        this.standardVilla = standardVilla;
        this.areaOfSwimmingPool = areaOfSwimmingPool;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "standardVilla= " + standardVilla +
                ", areaOfSwimmingPool= " + areaOfSwimmingPool +
                ", numberOfFloors= " + numberOfFloors +
                '}';
    }
}
