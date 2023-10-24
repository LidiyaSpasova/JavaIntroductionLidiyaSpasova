/*
Ъпдейтнете задачата с намирането на максималното измежду 3 числа да използва Math класа.

Напишете метод който намира лице на триъгълник(използвайки Math класа)

Напишете метод който има един входен параметър за дължина на масив и пълни масива със случайни числа
(да се използва клас Random).

 */

package homeworks;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        //theBiggestNumber();
        triangleArea();
        randomArrayValue();
    }

    public static void theBiggestNumber(){

        System.out.println("Please enter number1:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Please enter number2:");
        int number2 = scanner.nextInt();

        System.out.println("Please enter number3:");
        int number3 = scanner.nextInt();

        int maxNumber = Math.max(number1,Math.max(number2,number3));
        System.out.printf("The biggest number is %d", maxNumber);

    }

    public static void triangleArea() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sideA:");
        int sideA = scanner.nextInt();

        System.out.println("Please enter angleA:");
        double angleA = scanner.nextDouble();

        System.out.println("Please enter angleB:");
        double angleB = scanner.nextDouble();

        System.out.println("Please enter angleY:");
        double angleY = scanner.nextDouble();

        if (angleY + angleB + angleA > 180) {
            System.out.println("Error! Invalid triangle");

        } else {
            System.out.println((Math.round(( sideA * sideA ) * ( Math.sin(Math.toRadians(angleB) * ( Math.sin(Math.toRadians(angleY)
                               /( 2 * ( Math.sin(Math.toRadians(angleA)) ) )) )) ))));
        }
    }


    public static void randomArrayValue(){

    }
}