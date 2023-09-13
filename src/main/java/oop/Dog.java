package oop;

public class Dog extends Pet {

    //constructor
    public Dog(String breed){
        super (breed); //calling the constructor of the super/ parent class
    }

    //actions/methods:

    public void bark(){
        System.out.println(getName() + ": Bau bau");
    }


}


