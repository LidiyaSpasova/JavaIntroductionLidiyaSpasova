package access;

public class Product {

    public final String countryOfOrigin = "Bulgaria"; //or give value in a constructor

    //can be accessed from anywhere
    public String name;

    //can be accessed from the package or from a subclass in different package
    protected int price;

    //cab be accessed only from the current pasksge
    double weight;

    //can be accessed from the curent class only
    private String recipe;

    //the same is for all the methods as well!!!

    public final void finalMethod(){
        System.out.println("I cannot be changed");
    }
}
