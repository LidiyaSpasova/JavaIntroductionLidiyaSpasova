package oop;

public class Cat extends Pet {

   public Cat(Breed breed){
       super(breed);
   }
   //actions/ methods

    public void meow(){
        System.out.println(getName() + ": Meow meow");
    }
}
