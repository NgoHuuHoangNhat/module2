package case_study.model.impl_facility.impl_house;

import case_study.model.impl_facility.Facility;

public class House extends Facility {
    private String standardHouse;
    private int numberOfFloors;

    public House(String serviceCode, String serviceName, float area, float rentalCosts, int maxNumberOfPeople, String rentalType) {
        super(serviceCode, serviceName, area, rentalCosts, maxNumberOfPeople, rentalType);
    }

    public House(String serviceCode, String serviceName, float area, float rentalCosts,
                 int maxNumberOfPeople, String rentalType, String standardHouse, int numberOfFloors) {
        super(serviceCode, serviceName, area, rentalCosts, maxNumberOfPeople, rentalType);
        this.standardHouse = standardHouse;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
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
