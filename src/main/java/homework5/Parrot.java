package homework5;

public class Parrot extends Pet{
  public Parrot(String breed) {
      super(breed);
  }

public void fly(){
    System.out.println(getName() + " can fly faster");
}

public void canSpeak(){
    System.out.println(getName() + " can speak");
    }
}
