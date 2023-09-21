/*
1. Напишете метод, който проверява дали въведен стринг може да бъде използван за парола.
Основни правила за парола:

: Паролата трябва да е поне 8 символа;
: Паролата трябва да съдържа символ, число и букви;

2.Напишете метод, който проверява дали въведените 3 числа са:

: Положителни
: Равни

3. Напишете метод, който на база въведени две числа връща средна стойност.
 Напишете др метод, който приема два параметъра - числа, и връща сумата им.
 Извикайте втория метод с параметри първия.
*/

package homeworks;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        checkStringForPassword();
        //checkNumberEqualPositive();
        averageNumber();
    }

    public static void checkStringForPassword() {

    }

    public static void checkNumberEqualPositive() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number1 = ");

        int number1 = scanner.nextInt();

        System.out.print("Please enter number2 = ");

        int number2 = scanner.nextInt();

        System.out.print("Please enter number3 = ");

        int number3 = scanner.nextInt();

        if (number1 > 0 && number2 > 0 && number3 > 0 && number1 == number2 && number1 == number3) {

                System.out.println("Numbers are positive and equal");

            } else {
                System.out.println("There are not positive numbers or numbers not equal ");
            }
        }

    public static void averageNumber(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter numbers a and b:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //int c = scanner.nextInt();
        //int d = scanner.nextInt();
        double sum = (a+b)/2;
        // sumMethods(int c, int d);
        System.out.println(sum);
        //System.out.print(sumMethods,d);



    }

}

