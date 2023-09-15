package oop;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args){
        Breed frenchBulldog = new Breed("French Bulldog",
                "Medium size, playfull,12-20kg", "sick stomach");
        Breed shepard = new Breed("Shepard", "34-50kg", ".....");
        Breed persian = new Breed("Persian", "fur is long", "-");
        Dog frenchie = new Dog(frenchBulldog);/*caling the constructor in order
        to create a new object from that type(Class)*/
        Dog sharo = new Dog(shepard);
        Cat fur = new Cat(persian);

        fur.setAge((byte) 5);
        fur.setName("Snowbowl");
        fur.setSex("Female");
        fur.setWeight(4.3f);

        //frenchie and sharo are an objects from type Dog - an instance
        frenchie.setName("Morti");
        frenchie.setAge((byte) 2);
        frenchie.setSex("Male");
        //frenchie.setBreed("Freench Bulldog");
        //frenchie.setBreed("Blah blah");
        frenchie.setWeight(15.0f);

        frenchie.bark();
        frenchie.bark("Blah blah");
        frenchie.eat();
        frenchie.sleep();

        sharo.sleep();
        sharo.eat();
        sharo.bark();
        System.out.println(sharo.getAge());
        System.out.println(frenchie.getAge());
        System.out.println(frenchie.getWeight());

        sharo.walk();
        sharo.sleep();
        sharo.makeNoise();

        frenchie.makeNoise();
        frenchie.sleep();
        frenchie.walk();

        fur.sleep();
        fur.makeNoise();
        fur.walk();
        fur.goingToTheVet();

    }


}
