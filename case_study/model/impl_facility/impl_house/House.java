package case_study.model.impl_facility.impl_house;

import case_study.model.impl_facility.Facility;

public class House extends Facility {
    private String standardHouse;
    private int numberOfFloors;

    public House(String serviceCode, String serviceName, float area, float rentalCosts, int maxNumberOfPeople, String rentalType, String standardHouse, int numberOfFloors) {
        super(serviceCode, serviceName, area, rentalCosts, maxNumberOfPeople, rentalType);
        this.standardHouse = standardHouse;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "standardHouse= " + standardHouse +
                ", numberOfFloors= " + numberOfFloors +
                '}';
    }
}
