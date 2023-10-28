package oop;

//abstract class - can have abstract and non-abstract methods
public abstract class AbsractDemo {
    //abstract method

    public abstract void saySomething();

    //non - abstract method in abstract class

    public void signSomething(){
        System.out.println("I am signing");
    }

    public static void printOne(){
        System.out.println(1);
    }

    public AbsractDemo(String whatToSay){
        System.out.println(whatToSay);
    }

}
