//the introduction program I wrote below, gives a simple summary of what I have captured in Java so far at week one with edxEliRobert
import java.util.Scanner;
public class HelloWorld {
 public static void main (String [] args) {
     //end of input objects
     System.out.println ("Welcome!\n Please tell us ur name.");
     name ();
     System.out.println ("How old are you beautiful ");
     age ();
     System.out.println ("Please tell me how much did you pay for the training?");
     amount ();
}
public static void name () {
    Scanner input = new Scanner (System.in);
    String name = input.next ();
    System.out .println ("My name is "+ name);
}
 //creating the age method
 public static void age () {
     Scanner input = new Scanner (System.in);
     int age = input.nextInt ();
     System.out.println ("I am "+ age +" years old now.");
 }
 //creating the amount method
 public static void amount () {
     Scanner input = new Scanner (System.in);
     double amount = input.nextDouble ();
     System.out.println ("I payed "+ amount +" Tsh for the training");
 }
}
