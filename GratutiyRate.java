package REVELTESTING;
import java.util.Scanner;
public class GratutiyRate {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the subtotal and a gratuity rate");
double subtotal=input.nextDouble();
double gratuityrate=input.nextDouble();
double gratuity=subtotal*gratuityrate/100;
System.out.println(gratuity);
double total=subtotal+gratuity;
System.out.println(total);
	
}


}


