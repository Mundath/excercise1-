/*Miles-per-gallon */
import java.util.Scanner;
public class M_Gallon{
 public static void main(String[] args) {
     Scanner G= new Scanner (System.in);
     System.out.println(" Enter the number of miles driven");

     double milesdriven= G.nextDouble();

     System.out.println("Enter the number of the gallon of gas");

     double gallongas=G.nextDouble();

      double MGP=milesdriven/gallongas;

      System.out.println("The MGP is"+MGP);
         
}

}
