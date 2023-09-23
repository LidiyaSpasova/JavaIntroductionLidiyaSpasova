/*
1. Напишете метод, който проверява дали въведен стринг може да бъде използван за парола.
Основни правила за парола:

: Паролата трябва да е поне 8 символа;
: Паролата трябва да съдържа символ, число и букви;

2.Напишете метод, който проверява дали въведените 3 числа са:

: Положителни
: Равни

3. Напишете метод, който на база въведени две числа връща средна стойност.
   Напишете друг метод, който приема два параметъра - числа, и връща сумата им.
   Извикайте втория метод с параметри първия.
*/

package homeworks;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {

        checkStringForPassword();
        System.out.println("_______________");

        checkNumberEqualPositive();
        System.out.println("_______________");

        System.out.println("The arithmetic mean of these numbers = " + averageNumber());
        System.out.println("________");

        System.out.println("Sum of these numbers = " + sumNumbers(3, 5));
        System.out.println("_______________");

        System.out.println("Sum of these numbers = " + sumNumbers(averageNumber(), averageNumber()));
    }

    // task 1

    public static void checkStringForPassword() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter text, must contain letter, digit and special char:");
        String pass = scanner.nextLine();

        if (pass.length() < 8) {
            System.out.println("Please enter min 8 symbols");
            return;
        }

        boolean haveNumber = false;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 48 && pass.charAt(i) <= 58) {
                haveNumber = true;
            }
        }

        if (!haveNumber) {
            System.out.println("Missing number");
        }

        boolean haveLetter = false;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.toUpperCase().charAt(i) >= 65 && pass.toUpperCase().charAt(i) <= 90) {
                haveLetter = true;
            }
        }

        if (!haveLetter) {
            System.out.println("Missing letter");
        }

        boolean haveSpecialSymbol = false;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 33 && pass.charAt(i) <= 47) {
                haveSpecialSymbol = true;
            }
        }

        if (!haveSpecialSymbol) {
            System.out.println("Missing symbol");
        }

        if (haveNumber && haveLetter && haveSpecialSymbol) {
            System.out.println("Super e");
        }
    }

    // task 2

    public static void checkNumberEqualPositive() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number1 = ");

        int number1 = scanner.nextInt();

        System.out.print("Please enter number2 = ");

        int number2 = scanner.nextInt();

        System.out.print("Please enter number3 = ");

        int number3 = scanner.nextInt();

        if (number1 > 0 && number2 > 0 && number3 > 0) {
            System.out.println("Numbers are positive!");
        } else {
            System.out.println("There is not positive number(s)");
        }

        if (( number1 == number2 && number1 == number3 ) && ( number2 == number3 )) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }
    }

    // task 3

    public static double averageNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter numbers a:");
        double a = scanner.nextDouble();
        System.out.print("Please enter numbers b:");
        double b = scanner.nextDouble();

        return ( a + b ) / 2;
    }

    public static double sumNumbers(double a, double b) {
        return a + b;
    }
}




