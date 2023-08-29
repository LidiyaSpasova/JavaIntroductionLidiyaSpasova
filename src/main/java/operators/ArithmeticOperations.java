package operators;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int number = 10;
        int num2 = 20;
        //how to determine if a number is even or odd
        System.out.println(5 % 2);

        System.out.println(number++); //first print data, after that increase with 1
        System.out.println(number); //after that print new value
        System.out.println(++num2); //increase data with 1, after that print new value

        System.out.println(number == num2);//false
        System.out.println(number!= num2); //true

        System.out.println((number != num2) && true); //true
        System.out.println((number != num2) && false); //false
        System.out.println((number != num2) || true); //true
        System.out.println((number != num2) && false); //false
        System.out.println((number != num2) || false); //true







    }

}
