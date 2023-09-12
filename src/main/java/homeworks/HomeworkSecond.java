/*
Заместете даден под-string в даден string с друг текст:
Пример: “My name is <Test>” – заместете Test с нещо, което чете от конзолата.

Сравнете 2 стринга дали са еднакви - подадени от конзолата и изпишете резултата в нея.

Пребройте колко думи има в един стринг (разделете текста по space) - изпишете резултата в нея.

Обединете 2 и повече стринга в един и го изпишете в конзолата.
 */

package HomeworkSecond;


import java.util.Arrays;
import java.util.Scanner;

public class HomeworkSecond {

    public static void main(String[] args) {
        replacePartOfString();
        isTwoStringsAreEquals();
        countWords();
        concatenateString();
    }

    public static void replacePartOfString() {
        String firstString = "My name is Lidiya.";

        System.out.println(firstString);

        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);

        String secondString = scanner.nextLine();

        String resultString = firstString.replace("Lidiya", secondString);

        System.out.println(resultString);
    }

    public static void isTwoStringsAreEquals() {

        System.out.println("Please enter string #1");

        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();

        System.out.println("Please enter string #2");

        String secondString = scanner.nextLine();

        System.out.println("\nIs this strings are equals:" + firstString.equals(secondString));
    }

    public static void countWords() {

        System.out.println("Please enter sentences");

        Scanner scanner = new Scanner(System.in);

        String something = scanner.nextLine();

        String words = something;

        int countWords = something.split("\\s").length;

        System.out.println("\nTotal number of words = " + countWords);

        System.out.println(Arrays.toString(something.split("x",2)));

    }


    public static void concatenateString() {

        System.out.println("Please enter string #1");

        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();

        System.out.println("Please enter string #2");

        String secondString = scanner.nextLine();

        System.out.println("\nThe strings are concatenate:" + firstString.concat(secondString));

    }
}




