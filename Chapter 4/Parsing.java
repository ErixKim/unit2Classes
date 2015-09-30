import java.util.Scanner;

public class Parsing
{
   public static void main (String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print ("Please enter an integet between 1,000 and 999,999 ");
      String number = s.next();
      int index = number.indexOf(",");
      String sub = number.substring(0,index);
      String sub2 = number.substring(index + 1);
      String number2 = sub + sub2;
      System.out.print(number2);
    }
}
      

      // compute the average of the three numbers

      
      