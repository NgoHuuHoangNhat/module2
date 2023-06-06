package case_study.service;

import case_study.model.impl_facility.Facility;

public interface IFacilityService  {

    void display();
    public void displayAllFacility();

    void addFacility();

    void removeFacilityList();

    void displayMaintenance();

    void clearMaintenance();
}
