package data.types;

public class Test {
    public static void main(String[] args) {
        //object - o1 and o2 from type Variables
        Variables o1 = new Variables();
        Variables o2 = new Variables();

        System.out.println(o1 instanceof Object); //

        //instance variables from the type (Class - in this Variables)
        o1.age = 20;
        //o2.age = 17;
        o2.printAge();

        o1.printCanDrink();
        o2.printCanDrink();

        //accessing class variable/ static variable
        //Variables.staticString = "some \"random\" text";

        Variables.staticString = "some random text";

        System.out.println(Variables.staticString);
        // System.out.println(Variables.staticString.charAt(5));

        System.out.println(o1); //print reference to heap
        System.out.println(o1.age); //print variable value
        System.out.println(o1.name);

        /*var myCalculation = calculateWeeklyBonus();type Inference variables that take value of a result, work after Java 10 */

    }
}
