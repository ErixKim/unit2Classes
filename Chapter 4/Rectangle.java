import java.util.Scanner;

public class Rectangle
{
   public static void main (String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print ("Length of the rectangle sides? ");
      double length = s.nextDouble();
      
      System.out.print ("Width of the rectangle sides? ");
      double width = s.nextDouble();
    
      double perimeter = (length * 2) + (width * 2);
      double area = length * width;
      double first = Math.pow(length,2) + Math.pow(width, 2);
      
      double diaganol = Math.sqrt(first);
      System.out.println(diaganol);
      

      // compute the average of the three numbers

      
      
      
   }
}
