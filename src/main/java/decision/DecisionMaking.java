package decision;

public class DecisionMaking {

    public static void main(String[] args) {
        printUserDetails(0);
        printUserDetails(-1);
        printUserDetails(13);
        printUserDetails(14);
        printUserDetails(17);
        printUserDetails(18);
        printUserDetails(65);
        printUserDetails(66);
        printUserDetails(130);
        printUserDetails(131); //negative - out



    }

    public static void printUserDetails(int userAge){
        //kid: 0 - 13
        //teenager: 14 - 17
        //adult: 18 - 65
        //retired: 66 - 130

        if (userAge < 0 || userAge > 130){
            System.out.println("Error: Invalid entry");
            return;
        }

        if (userAge >= 0 && userAge <= 13){
            System.out.printf("The user is a kid with the age of %d\n", userAge);
        }else if (userAge >= 14 && userAge <= 17) {
            System.out.printf("The user is a teenager with the age of %d\n", userAge);
        }else if (userAge >= 18 && userAge <= 65) {
            System.out.printf("The user is a adult with the age of %d\n", userAge);
        }else
        {
            System.out.printf("The user is a retired with the age of %d\n", userAge); {

        }

    }
    }
}
