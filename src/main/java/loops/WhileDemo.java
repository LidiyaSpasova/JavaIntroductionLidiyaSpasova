package loops;

import java.util.Scanner;

public class WhileDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n:");
        int n = scanner.nextInt();
        printFactorial(n);
        printFactorialUsingDoWnile(n);
    }

    public static void printFactorial(int number) {

            //local variables
            int result = 1;
            int inputValue = number;

            while (inputValue > 0) {
                result *= inputValue;
                inputValue--;
            }
            System.out.printf("You have entered: %d. Factorial is: %d.\n", number, result);
        }

        public static void printFactorialUsingDoWnile(int number){
        int result = 1;
        int inputValue = number;

        do{
            result *= inputValue;
            inputValue--;
        }while (inputValue > 0);

        System.out.printf("You have entered: %d. Factorial is: %d.\n", number, result);
        }
    }


