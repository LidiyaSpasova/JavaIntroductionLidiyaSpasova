package oop;

public class Cat extends Pet {

   public Cat(String breed){
       super(breed);
   }
   //actions/ methods

    public void meow(){
        System.out.println(getName() + ": Meow meow");
    }
}
