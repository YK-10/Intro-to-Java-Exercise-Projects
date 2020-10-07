package ProjectsCanvas;
import java.util.Scanner;
public class WindChillFactor {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the temperature that is between -58F and 41F: ");
double temperature = input.nextDouble();
System.out.print("Enter the wind speed higher then or qual to 2:");
double speed = input.nextDouble();
double wind =(35.74 + 0.6215) * (temperature -35.75) * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);
System.out.println("The wind chill index is"+wind);
}
}