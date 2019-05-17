//the program is an assignment to acccomplist model one of Java from Microsoft course
import java.util.Scanner;
public class TripPlanner {
    //my main method is used to call all the other methods I created
    public static void main (String [] args) {
      greettings();
      travelDetails();
      timeDifference();
      squareArea();
    }
    //the first Method am creating to Welcome my user in the System
    public static void greettings () {
        Scanner input = new Scanner (System.in);
        //I create an object to take the users inputs
        System.out.println("Welcome to Vacation planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine ();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String place = input.nextLine ();
        System.out.println("Great! "+ place + " sounds like a great trip.");
    }
    // the secod method am creating to take users details on the trip and calculate what he/she need to know
    public static void travelDetails() {
        Scanner input = new Scanner (System.in);
        System.out.print("How many Days are you going to spend travelling? ");
        int days = input.nextInt ();
        System.out.print("How much money, in USD, are you planing to spend in your trip? ");
        double amount = input.nextDouble ();
        System.out.print("What is the three letter currency Symbol for your Destination? ");
        String symbol = input.next ();
        System.out.print("How many "+ symbol + " are there in 1 USD? ");
        double currency = input.nextDouble();
        //Now am prompting the details in accordance to the Users Details
        System.out.println("If you are travelling for "+ days + " days that is the same as "+ (days*24) + " or "+ (days*1440) + " minutes");
        System.out.println("If you are going to spend $"+amount+" USD that means per day you can spend up to $"+(amount/days)+ " USD");
        System.out.println("Your total budget in " + symbol + " is "+ (amount*currency)+ symbol + ", which per day is "+((amount/days)*currency)+" "+ symbol);
    }//till here so far the code is ok giving exactly what is needed,
    //am prepairing for phase two.
    public static void timeDifference() {
        int midnight = 24;
        int noon = 12;
        Scanner input = new Scanner (System.in);
        System.out.print("What is the time difference, in hours, between your Home and your destination? ");
        int hours = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be "+ ((midnight+hours)%24)+" in your travel destination");
        System.out.println("and when it is noon at home it will be "+ (noon+hours));
    }
    public static void squareArea () {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the Square area of your Destination country in Km2? ");
        double area = input.nextDouble();
        System.out.println ("In miles that is " + (area*1.6)+ " Miles2.");
    }
}
