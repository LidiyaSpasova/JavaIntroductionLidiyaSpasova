/* 1. Напишете програма/ метод, която приема от конзолата 3 подадени числа определя кое е най-голямотo.
   2. Напишете програма/ метод, която за подадени дължина и височина на правоъгълник, изкарват на конзолата неговият периметър и лице.
   3. Напишете програма/ метод, която чете число и изписва в конзолата дали числото е четно или не?
   4. Напишете програма/ метод, която чете число от 1 до 7 в конзолата и на базата на това изписва в конзолата деня от седмицата във формат:
      You have selected 1. Day of the week is Monday.
*/

package Homeworks;

import java.util.Scanner;


public class HomeworkThird {

    public static void main(String[] args) {
        TheBiggestNumberIs();


    }

    static void TheBiggestNumberIs() {


        System.out.println("Please enter number1");

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        //System.out.println("Please enter number1");

        System.out.println("Please enter number2");
        int number2 = scanner.nextInt();

        System.out.println("Please enter number3");
        int number3 = scanner.nextInt();


            if (number1 == number2 && number1 == number3 && number2 == number3) {
                System.out.println("THe numbers are equals");
                return;


            }else if(number1 > number2 && number1 > number3) {
                System.out.println("Number1 is the biggest one.");
                return;
            } else if (number2 > number1 && number2 > number3) {
                System.out.println("Number2 is the biggest one.");
                return;
            } else if (number3 > number1 && number3 > number2) {
                System.out.println("Number3 is the biggest one.");
                return;


            }
        }
    }


