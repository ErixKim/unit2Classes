import java.util.Scanner;

public class Phone
{
   public static void main (String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print ("Please enter a ten digit phone number ");
      String number = s.next();
      String sub = number.substring(0,3);
      String finalsub = "(" + sub + ") ";
      String sub2 = number.substring(3,6);
      String finalsub2 = sub2 + "-";
      String sub3 = number.substring(6,10);
      System.out.print(finalsub + finalsub2 + sub3);
    }
}
      