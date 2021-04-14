package com.rcs.classwork.Day22;

public class Address {
    private String country;
    private String city;
    private String street;
    private int houseNr;

    public Address(String country, String city, String street, int houseNr) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNr = houseNr;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNr() {
        return houseNr;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNr(int houseNr) {
        this.houseNr = houseNr;
    }
}
