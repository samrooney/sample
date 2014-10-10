import java.util.Scanner;

public class Hello { 

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("enter a noun");
      String noun1 = "";
      noun1 = scnr.next(); 
      System.out.println("Hi, i am a " + noun1);
   }

}
