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
        theBiggestNumber();
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

    public static void triangleArea(){

    }

    public static void randomArrayValue(){

    }
}