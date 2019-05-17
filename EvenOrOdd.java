import java.util.*;
public class EvenOrOdd {
    public static void main (String [] args) {
        System.out.print ("Enter an integer number ");
        try{
            int num ;
            Scanner input = new Scanner(System.in);
             num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("The number is an Even number");
            } else if (num % 2 == 1) {
                System.out.println("The number is an Odd number");
            } else if(num < 0){
                System.out.println("This that you have entered a neg no");
            }
        }
        catch(Exception e){
            System.out.println("Please enter an integer");
        }

        System.out.println("Thanks for your time.");

    }
}
