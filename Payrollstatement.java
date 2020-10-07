 package ProjectsCanvas;
 import java.util.Scanner;
 public class Payrollstatement {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 
 System.out.print("Enter employee's name:");
 String name = input.nextLine();
 System.out.print("Enter Number of hours worked in a week:");
 double hoursworked = input.nextDouble();
 System.out.print("Enter Hourly pay rate:");
 double HourlyPayrate = input.nextDouble();
 System.out.print("Enter Federal tax withholding rate:");
 double FedtaxHoldRate = input.nextDouble();
 System.out.print("Enter State tax withholding rate:");
 double StatetaxHoldRate = input.nextDouble();

 System.out.println("Employee Name:" + name);
 System.out.println("Hours Worked:" + hoursworked);
 System.out.println("Pay Rate: $" + HourlyPayrate);
 System.out.printf("Gross Pay: $%.2f\n", + HourlyPayrate * hoursworked);
 System.out.println("Deduction:");
 System.out.printf("\tFederal Withholding (%.1f%%): $%.2f\n", FedtaxHoldRate* 100, FedtaxHoldRate * HourlyPayrate * hoursworked);
 System.out.printf("\tState Withholding (%.1f%%): $%.2f\n", StatetaxHoldRate* 100,  StatetaxHoldRate * HourlyPayrate * hoursworked);
 System.out.printf("\tTotal Deduction: $%.2f\n", (StatetaxHoldRate + FedtaxHoldRate) * HourlyPayrate * hoursworked);
 System.out.printf("Net Pay: $%.2f\n", (1 - StatetaxHoldRate - FedtaxHoldRate) * HourlyPayrate * hoursworked);

}

}