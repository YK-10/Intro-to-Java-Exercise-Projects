package ProjectsCanvas;
import java.util.Scanner;
public class CurrencyConversion {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);	
System.out.print("Enter the exchange rate from dollars to Rmb: ");
double exchangerate = input.nextDouble();
System.out.print("Enter 0 to convert dollars to Rmb or click 1 to convert Rmb to Dollars: ");
int option = input.nextInt();
double total;
switch(option)
{
case 0: System.out.print("Enter the dollar amount: ");
total = input.nextDouble();
System.out.println("$" + total + " is " + (total * exchangerate) + " Y or yuan"); break;
case 1: System.out.print("Enter the Rmb amount: ");
 total = input.nextDouble();
System.out.println(total + " yuan is $" + 
((int)((total * 100) / exchangerate)) / 100.0); break;

		} 
	}
}

