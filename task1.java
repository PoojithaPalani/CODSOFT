import java.util.Random;
import java.util.Scanner;

public class guessthenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int min = 1;
        int max = 100;
        char play = 'A';
        int attempts = 0;
        int totalroundsplayed = 0;
        int totalattempts = 0;
        int randomnumber, userguess;
        while (play == 'A') {
            System.out.println("Welcome to Guess the Number challenge");
            System.out.println("Please enter your name");
            String name = sc.nextLine();
            System.out.println("I have selected a number between " + min + " and " + max);
            System.out.println("Try to guess it.");
            randomnumber = r.nextInt(max - min + 1) + min;
            boolean correctguess = false;
            attempts = 0;
            while (!correctguess) {
                System.out.println("Enter your guess ");
                userguess = sc.nextInt();
                attempts++;
                if (userguess == randomnumber) {
                    System.out.println("congrats! " + name + " you guessed correctly in " + attempts + " attempts");
                    correctguess = true;
                    totalattempts += attempts;
                } else if (userguess < randomnumber)

                {
                    System.out.println("too low try again");

                } else {
                    System.out.println("too high try again");
                }

            }
            totalroundsplayed++;
            System.out.println("Do you want to play again?(A/n)..then enter A Otherwise n");
            play = sc.next().charAt(0);

        }
        System.out.println("Thank you for playing");
        System.out.println("you played " + totalroundsplayed + " rounds and your average attempts per round was "
                + (totalattempts / totalroundsplayed));
        sc.close();
    }
}
