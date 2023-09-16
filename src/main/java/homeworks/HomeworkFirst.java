/*Напишете програма, която:
Чете за име на потребител
Чете за любимо хоби на потребителя
Изписва в конзолата подходящо съобщение за потребителя и хобито
*/

package homeworks;

import java.util.Scanner;

public class HomeworkFirst {

        public static void main(String [] args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter your name:");

            String name = scanner.nextLine();

            System.out.println("What is your hobby?");

            String hobby = scanner.nextLine();

            System.out.println("Nice to meet you," + name + ". Your hobby is:" + hobby);
        }
    }

