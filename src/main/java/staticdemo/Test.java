package staticdemo;

public class Test {
    public static void main(String[] args) {
        System.out.println(Car.getCounter());//0

        Car tesla = new Car("Model X");
        System.out.println(Car.getCounter()); //1

        Car tesla2 = new Car("Model Y");
        System.out.println(Car.getCounter()); //2

    }
}
