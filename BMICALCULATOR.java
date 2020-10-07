package ProjectsCanvas;
import java.util.Scanner;
public class BMICALCULATOR {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print("Enter weight in pounds:");
double weight = input.nextDouble();
System.out.print("Enter height in inches:");
double inches=input.nextDouble();
double BMI=weight*0.45359237/(inches*0.0254*inches*0.0254);
System.out.print("Your BMI is "+BMI);
}
}
