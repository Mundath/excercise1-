/*Celsuis to fahrenheit temperature conveter*/
import java.util. Scanner;
public class Celsius{

    public static void main(String[] args) {
        Scanner  A= new Scanner (System.in);
        System.out.println("Enter a temperature in celsius");
        double C= A.nextDouble();

        double  F=(9/5)*C+32;
  
        System.out.println(F); 
    }
  
 
    }
