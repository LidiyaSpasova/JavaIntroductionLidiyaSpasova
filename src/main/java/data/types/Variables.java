package data.types;

public class Variables {
    //static variable
    static String staticString;
    //instance variables

    byte age;
    String name;

    //constructor with parameter(s)
    public Variables(String name){
        //some logic here
    }
    //default constructor
    public Variables(){
        
    }


    public static void main(String [] args) {
        //local variables
        //primitive data types

        byte age = 20;
        short workingDaysPerYear = 200;
        int secondInWorkingWeek = 345354;
        long secondInAnYear = 63454455;
        float accountBalance = 23423423.56f;
        double resultOfCalculation = 0.0;
        boolean amIRich = false;
        char specialSymbol = '&';

        //referent data types
        String firstName = "Ibro";
        String firstNAME = "Petar";
    }

    public void printAge(){
        System.out.println("Age is:" + age + ".");
    }

    public void printCanDrink(){
        if (age >=18) {
            System.out.printf("Yes! Because the age is: %d%n", age);
        }else {
            System.out.println("Sorry :(");
        }
        }
    }



