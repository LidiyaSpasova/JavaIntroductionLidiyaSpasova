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

        int[] newValueArrayNumbers = new int[20];

        NewValueArray(newValueArrayNumbers); //task 1

        AverageArray(newValueArrayNumbers); //task 2

        InputArray(); //task 3

        printNumbers(); //task 4

        printDivisionNumbers();//task 5

        printFibonacci();//task 6


    }


    public static void NewValueArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
            System.out.printf("At index: %d, is the value: %d\n", i, array[i]);//task 1
        }
        System.out.println("-----------------------");
    }

    public static void AverageArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Average of numbers in array is:" + sum / array.length);
        System.out.println("-----------------------");
    }

    public static void InputArray(){
        int[] typeOfNumbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array:");
        for (int i = 0; i < typeOfNumbers.length; i++) {
            typeOfNumbers[i] = scanner.nextInt();
        }
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
        System.out.println("-----------------------");
    }


    public static void printNumbers() {
        System.out.print("Please enter parameter N=");
        Scanner scanner = new Scanner(System.in);
        int parameterN = scanner.nextInt();

        for (int i = 1; i <= parameterN; i++) {
            System.out.println(i);

        }
        System.out.println("-----------------------");
    }

    public static void printDivisionNumbers() {
        System.out.print("Please enter number N=");
        Scanner scanner = new Scanner(System.in);
        int numberN = scanner.nextInt();

        for (int i = 1; i <= numberN; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.println("Numbers of i, that not divided to 3 and 7 are:" + i);
            }
        }

        System.out.println("-----------------------");
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
        System.out.println("Fibonacci sum is:" + num2);
    }
}