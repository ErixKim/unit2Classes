public class Annuity
{
   public static void main(String[] args)
   {
      double i = .08;
      int pmt = 10000;
      int n = 20;
      
      
      double PVann;
      
      PVann = pmt*(((Math.pow(1+i, n-1)-1)/i/(Math.pow(1+i, n-1))+1));
      System.out.println(PVann);
   }
}
