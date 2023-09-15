package homework5;

import oop.Breed;

public class TestPet {
    public static void main(String[] args) {
        Pet corella = new Parrot("Corella");
        Pet jaco = new Parrot("Jaco");


        corella.setBreed("Nymphicus hollandicus");
        corella.setFamilies("Cacatuidae");
        corella.setName("Kiko");
        corella.setPassportNumber((byte) 123);
        corella.setAddress("Sofia");
        corella.setSex("Male");

        jaco.setBreed("Psittacus erithaus");
        jaco.setFamilies("Psittacus");
        jaco.setName("Alex");
        jaco.setPassportNumber((byte) 2356);
        jaco.setAddress("Blagoevgrad");
        jaco.setSex("Female");

        corella.eat();
        corella.getSick();
        corella.goingToTheVet();
        corella.fly();


        jaco.eat();
        jaco.getSick();
        jaco.goingToTheVet();
        jaco.canSpeak();



    }
}
