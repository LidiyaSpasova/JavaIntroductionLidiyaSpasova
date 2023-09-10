/*
1. Да се напише програма, която създава масив с 20 елемента от целочислен тип и инициализира
   всеки от елементите със стойност равна на индекса на елемента умножен по 5. Елементите на масива
   да се изведат на конзолата.
2. Напишете програма, която изчислява средната стойност от всички числа в масив
   (може да се използва горния масив).
3. Напишете програма, която приема масив от числа и изчислява сумата на
   всички четни и нечетни числа от поредицата, изписвайки подходящо съобщение с резултата.
4. Напишете програма (метод), която отпечатва на конзолата числата от 1 до N.
   Числото N се приема като параметър.
5. Напишете програма, която отпечатва на конзолата числата от 1 до N, които не се делят на 3 и 7.
6. Напишете програма, която отпечатва сумата на първите N члена от редицата на Фибоначи.
  Числата на Фибоначи започват от 0 и 1, като всяко следващо се получава като сума от предходните две.
*/
package homeworks;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[20];

        printValues(arrayNumbers);
        System.out.println("_________________");

        int[] newValueArrayNumbers;
        newValueArrayNumbers = new int[20];
        int sum = 0;

        for (int i = 0; i < newValueArrayNumbers.length; i++) {
            System.out.printf("At index: %d, is the value: %d\n", i, newValueArrayNumbers[i] = i * 5);//task 1

            sum += newValueArrayNumbers[i];

        }
        System.out.println("-----------------------");
        System.out.println("Average of numbers in array is:" + sum / newValueArrayNumbers.length);// task 2

        System.out.println("-----------------------");
        int[] typeOfNumbers = {2, 3, 4, 5, 6};//task 3
        SumOddOrEven(typeOfNumbers);
        System.out.println("-----------------------");

        printNumbers();
        System.out.println("-----------------------");//task 4

        printDivisionNumbers();
        System.out.println("-----------------------");//task 5

        printFibonacci();//task 6
    }

    public static void SumOddOrEven(int[] array) {

        int[] typeOfNumbers = array;

        //int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int odd = 0;
        int even = 0;
        for (int i = 0; i < typeOfNumbers.length; i++) {
            if (typeOfNumbers[i] % 2 == 0) {
                even += typeOfNumbers[i];
            } else {
                odd += typeOfNumbers[i];
            }

        }
        System.out.println(" Sum of odd numbers is:" + odd);
        System.out.println(" Sum of even numbers is:" + even);
    }


    public static void printValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("At index: %d, is the value: %d\n", i, array[i]);
        }

    }

    public static void printNumbers() {
        System.out.println("Please enter parameter N:");
        Scanner scanner = new Scanner(System.in);
        int parameterN = scanner.nextInt();

        for (int i = 0; i <= parameterN; ++i) {
            System.out.println(i);

        }

    }

    public static void printDivisionNumbers() {
        System.out.println("Please enter number N:");
        Scanner scanner = new Scanner(System.in);
        int numberN = scanner.nextInt();

        for (int i = 1; i <= numberN; i++) {
            if (((i % 3) == 0) == false) {
                if (((i % 7) == 0) == false) {
                    System.out.println("Numbers of i, that not divided to 3 and 7 are:" + i);
                }
            }
        }
    }

    public static void printFibonacci() {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        int n;

        System.out.println("Please enter n:");
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        for (int i = 0; i < n; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }
        System.out.println("Fibonacci sum is:" +num2);
    }
}




