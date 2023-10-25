package inheritance;

public class Test {
    public static void main(String[] args) {

        Developer dev1 = new Developer("Pesho", "2023 / 01 / 01", 2000.00, "JAVA");

        dev1.calculateBonus(true, 500);
        System.out.println(dev1.getSalary());
    }
}
