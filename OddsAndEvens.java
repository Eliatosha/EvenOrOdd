//This is the Module two project work for my PS in Java Programming
import java.util.*;
public class OddsAndEvens {
    public static void main (String [] args) {
        System.out.println ("Let's play a game called \"Odds and Evens\"");
        System.out.print ("What is your name? ");
        Scanner input =  new Scanner (System.in);
        String name = input.next ();
//      Greeting the user and taking more details
        System.out.print ("Hi " + name + ", which do you choose? (O)dds and (E)vens?" );
        Scanner entry = new Scanner (System.in);
        String selection1 = entry.nextLine();
        if (selection1.equals("O")) {
            System.out.println (name + " has picked odds! The computer will be evens.");
        }
        else if (selection1.equals("E")) {
            System.out.println (name + " has picked evens! The computer will be odds.");
        }
        else {
            System.out.println (name + " has picked the wrong choice. PLease choose only \"O\" or \"E\"");
        }
        System.out.println ("-----***-----***-----***-----***-----***-----");
        playTheGame ();
    }
    public static void playTheGame () {
        System.out.println ( "How many \"fingers\" do you put out?.");
        Scanner input = new Scanner (System.in);
        int fingures  = input.nextInt ();
        Random rand = new Random();
        int computer = rand.nextInt (6);
        System.out.println (" The computer plays ." + computer + " fingures.");
        System.out.println ("***-----***-----***-----***-----***.");
        int sum;
        sum = fingures + computer;
        System.out.println (fingures + " + " + computer + " = " + sum + ".");
        if (sum % 2 == 0 ) {
            System.out.println ( sum + " is Even!");
            if (selection1.equals("E")) {
                System.out.println ("The user wins");
            }
        }
        else {
            System.out.println ( sum + " is Odd!");
        }
        System.out.println ("-----***-----***-----***-----***-----***-----");
    }
}
