/*calculate the quotient and remainder */
import java.util.Scanner;
public class Quotient_rem{
     public static void main(String[] args) {
        
       Scanner P = new Scanner (System.in) ;
       
       System.out.println("Enter the first integer number:");
       double x =P. nextDouble();

       System.out.println("Enter the second integer number:");
       double y=P.nextDouble();

       double xy=x/y;
       double yx=x%y;
       System.out.println("The qoutient of x and y is :"+xy);
       System.out.println("The remainder of x and y is:"+yx);

    }

}
