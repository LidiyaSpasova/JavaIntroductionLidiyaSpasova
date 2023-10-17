package staticdemo;

public class Test //extends FinalClass // final class cannot be inherited
{
        public static void main(String[] args) {
        System.out.println(Car.getCounter());//0

        Car tesla = new Car("Model X",4);
        System.out.println(Car.getCounter()); //1

        Car tesla2 = new Car("Model Y",5);
        Car.fakeProductionOfACar();//increasing the counter
        System.out.println(Car.getCounter()); //2

        System.out.println(Car.FOUR_WHEEL_DRIVE);

        tesla2.flyTheCar();
        //DriverCar driveCar = new DriveCar(); //cannot have object from an abstract class

    }
}
