package CodSoft;

import java.util.Random;
import java.util.Scanner;

public class guessNumber{
    public static void guess(){
        int number = 0;
        int attempts = 5;
        int score = 0;
        boolean b = true;
        int i = 0;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt(100)+1;
        // System.out.println("Random = "+randomNumber);
        while (b){
            int n = attempts-score;
            if(score<attempts){
                System.out.println("You have only "+n+" attempts.");

                if(i==0) {
                    System.out.println("Enter a number between 1 and 100");
                    number = s.nextInt();
                    score++;
                    i++;
                }
                else{
                    System.out.println("Enter again.......");
                    number = s.nextInt();
                    score++;
                }
            }
            if(number>100&&b==true){
                System.out.println("You have entered a number greater than 100");
                System.out.println("Game Over");
                b = false;
            }
            else if(number>randomNumber&&b==true){
                System.out.println();
                System.out.println("Your number is too high.");
            }
            else if (number<randomNumber&&b==true) {
                System.out.println();
                System.out.println("Your number is too low.");
            }
            else if(number==randomNumber){
                System.out.println("You win......");
                System.out.println("You have guessed the correct number in "+score+" attempts.");
                System.out.println();
                b=false;
            }
            if(score==attempts) {
                System.out.println("Game Over");
                System.out.println();
                b = false;
            }
        }
    }
    public  static String again(){
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to play again? (yes/no)");
        String str = s.nextLine();
        System.out.println();
        if(str.equalsIgnoreCase("yes")) {
            guess();
        }
        return str;
    }
    public static void main(String[] args) {
        guess();
        String str = again();
        while(str.equalsIgnoreCase("yes")) {
            String s = again();
            str = s;
        }
        System.out.println("Thank you for using our program");
    }
}
