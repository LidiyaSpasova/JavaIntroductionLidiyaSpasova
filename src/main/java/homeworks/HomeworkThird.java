/* 1. Напишете програма/ метод, която приема от конзолата 3 подадени числа
      определя кое е най-голямотo.
   2. Напишете програма/ метод, която за подадени дължина и височина на правоъгълник,
      изкарват на конзолата неговият периметър и лице.
   3. Напишете програма/ метод, която чете число и изписва в конзолата
      дали числото е четно или не?
   4. Напишете програма/ метод, която чете число от 1 до 7 в конзолата
      и на базата на това изписва в конзолата деня от седмицата във формат:
      You have selected 1. Day of the week is Monday.
*/

package homeworks;

import java.util.Scanner;

public class HomeworkThird {

    public static void main(String[] args) {

        theBiggestNumberIs();
        perimeterAreaRectangle();
        evenNumberOrNot();
        weekDaysName();

    }

    public static void theBiggestNumberIs() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number1");
        int number1 = scanner.nextInt();

        System.out.println("Please enter number2");
        int number2 = scanner.nextInt();

        System.out.println("Please enter number3");
        int number3 = scanner.nextInt();


        if (number1 == number2 && number1 == number3) {
            System.out.println("The numbers are equals");
        } else if (number1 > number2 && number1 > number3) {
            System.out.println("Number1 is the biggest one.");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Number2 is the biggest one.");
        } else {
            System.out.println("Number3 is the biggest one.");
        }
    }

    public static void perimeterAreaRectangle() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter length of rectangle");
        int length = scanner.nextInt();

        System.out.println("Please enter height of rectangle");
        int height = scanner.nextInt();

        int area = length * height;
        int perimeter = 2 * (length + height);

        System.out.println("The area of rectangle is " + area);

        System.out.println("The perimeter of rectangle is " + perimeter);

    }

    public static void evenNumberOrNot() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number");
        int number = scanner.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }

    public static void weekDaysName() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number between 1 and 7:");
        int weekday = scanner.nextInt();

            switch (weekday){
                case 1:
                    System.out.println("You have selected 1. Day of the week is Monday.");
                    break;
                case 2:
                    System.out.println("You have selected 2. Day of the week is Tuesday.");
                    break;
                case 3:
                    System.out.println("You have selected 3. Day of the week is Wednesday.");
                    break;
                case 4:
                    System.out.println("You have selected 4. Day of the week is Thursday.");
                    break;
                case 5:
                    System.out.println("You have selected 5. Day of the week is Friday.");
                    break;
                case 6:
                    System.out.println("You have selected 6. Day of the week is Saturday.");
                    break;
                case 7:
                    System.out.print("You have selected 7. Day of the week is Sunday.");
                    break;

                default:
                    System.out.println("Error: Invalid entry.");
            }

    }
}






