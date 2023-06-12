package case_study.model.impl_person.impl;

import case_study.model.impl_person.Person;
import ss10.bai_4.Palindrome;

import java.awt.event.PaintEvent;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;
    public Customer(String id, String name, String dateOfBirth, String gender,
                    String passport, String numberPhone, String email, String typeOfGuest, String address) {
        super(id, name, dateOfBirth, gender, passport, numberPhone, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "typeOfGuest= " + typeOfGuest  +
                ", address= " + address +
                '}';
    }
}
