package staticdemo;

public class Car {
    //accessed by the instance i.e object from this type/ class
    private String model;
    //accessed by the class, and it will be the same for all objects
    private static int counter;

    //setter and getters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getCounter() {
        return counter;
    }

    //constructor

    public Car(String model){
        setModel(model);
        counter++; //it will count all the objects that are created from this type (Class)
    }
}
