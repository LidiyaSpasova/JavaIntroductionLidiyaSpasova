package oop;

public class Pet implements PetActions {
    //states/ characteristics/ instance variable
    private Breed breed;//composition
    private float weight;
    private String sex;
    private byte age;
    private String name;
    private Address address;//aggregation


    //Setters and Getters

    public float getWeight() {
        return weight;
    }

    //gives us possibility to have data validation

    public void setWeight(float weight) {
        if (weight > 0) {
            this.weight = weight;
        }else {
            System.out.println("Error: Invalid entry for weight!");
        }
    }

    public String getSex() {
        return sex;
    }

    //gives us possibility to have data validation

    public void setSex(String sex) {
        if (sex.isEmpty()){
            this.sex = sex;
        }else {
            System.out.println("Error: Invalid entry for sex!");
        }
    }

    public byte getAge() {
        return age;
    }

    //gives us possibility to have data validation

    public void setAge(byte age) {
        if (age >= 0) {
            this.age = age;
        }else {
            System.out.println("Error: Invalid entry for age!");
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Error: Invalid entry for name!");
        } else {
            this.name = name;
        }
    }
    public Breed getBreed() {
        return breed;
    }
    //gives us possibility to have data validation

    private void setBreed(Breed breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        }else {
            System.out.println("Error: Invalid entry for breed!");
        }
    }

    public Pet(Breed breed){
        setBreed(breed);
    }


    //actions/methods:

    public void eat(){
        System.out.println(this.name + " is eating");
    }

    @Override
    public void walk() {
        System.out.println(this.name + " is walking");
    }

    public void sleep(){
        System.out.println(this.name + " is sleeping");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name + " is making noise");

    }

    @Override
    public void goingToTheVet() {
        System.out.println(this.name + " is going to the vet ...");
    }

}



