/*
Заместете даден под-string в даден string с друг текст:
Пример: “My name is <myName>” – заместете Test с нещо, което чете от конзолата.

Сравнете 2 стринга дали са еднакви - подадени от конзолата и изпишете резултата в нея.

Пребройте колко думи има в един стринг (разделете текста по space) - изпишете резултата в нея.

Обединете 2 и повече стринга в един и го изпишете в конзолата.
 */

package HomeworkSecond;


import java.util.Scanner;

public class HomeworkSecond {

    public static void main(String[] args) {
        replacePartOfString();
        isTwoStringsAreEquals();
        countWords();
        concatenateString();
    }

    static void replacePartOfString() {
        String firstString = "My name is Lidiya. I'm....";

        System.out.println(firstString);

        System.out.println("Please enter something");

        Scanner scanner = new Scanner(System.in);

        String secondString = scanner.nextLine();

        String resultString = firstString.replace("Lidiya", secondString);

        System.out.println(resultString);
    }

    static void isTwoStringsAreEquals() {

        System.out.println("Please enter string #1");

        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();

        System.out.println("Please enter string #2");

        String secondString = scanner.nextLine();

        System.out.println(firstString.equals(secondString));
    }

    static void countWords() {

        System.out.println("Please enter text");

        Scanner scanner = new Scanner(System.in);

        String something = scanner.nextLine();

        String words = something;
        int countWords = something.split("\\s").length;
        System.out.println(countWords);


        // int totalWords;
        // String words [] = something.split("");

        // totalWords = words.length;
        // System.out.println("\nTotal number of words = " + totalWords);

        //System.out.println(Arrays.toString(something.split("x",2)));
    }


    static void concatenateString() {

        System.out.println("Please enter string #1");

        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();

        System.out.println("Please enter string #2");

        String secondString = scanner.nextLine();

        System.out.println(firstString.concat(secondString));

    }
}




