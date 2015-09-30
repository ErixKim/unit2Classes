import java.util.Scanner;

public class GivingChange
{
   public static void main (String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print ("How much is due ");
      int due = s.nextInt();
      System.out.print("How much do we recieve ");
      int recieve = s.nextInt();
      int give = recieve - due;
      System.out.println(give);
      int dollars = give/100;
      System.out.println(dollars);
      give -= (dollars * 100);
      int quarters = give/25;
      System.out.println(quarters);
      give -= quarters * 25;
      int dimes = give/10;
      System.out.println(dimes);
      give -= dimes * 10;
      int nickels = give/5;
      System.out.println(nickels);
      give -= nickels * 10;
      
    }
}