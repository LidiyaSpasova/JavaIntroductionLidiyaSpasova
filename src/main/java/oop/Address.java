package oop;

public class Address {
    private String country;
    private String city;
    private int postalCode;
    private String additionalData;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(!country.isEmpty()){
        this.country = country;
    }else {
            System.out.println("Error: Invalid breed name!");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (!city.isEmpty()){
        this.city = city;
    }else {
            System.out.println("Error: Invalid breed name!");
        }
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        if (postalCode > 0){
        this.postalCode = postalCode;
    }else {
            System.out.println("Error: Invalid breed name!");
        }
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        if(!additionalData.isEmpty()){
        this.additionalData = additionalData;
    }else {
            System.out.println("Error: Invalid breed name!");
        }
    }
    //constructor

    public Address(String country, String city, int postalCode, String additionalData){
        setCountry(country);
        setCity(city);
        setPostalCode(postalCode);
        setAdditionalData(additionalData);
    }

    //constructor overload

    public Address(String country){
        setCountry(country);
    }

    public Address(){
        setCountry("Bulgaria");
        setCity("Sofia");
        setPostalCode(1000);
        setAdditionalData("_");
    }

    //method override from the object class
    public String toString(){
        return String.format("Country is: %s, city is: %s, postal code is: %d, additional data: %s",
                country, city, postalCode, additionalData);
    }
}
