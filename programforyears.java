package REVELTESTING;
import java.util.Scanner;
public class programforyears {
public static void main(String[]args) {
Scanner input=new Scanner(System.in);
System.out.println("Enter the number of minutes:");
int minutes=input.nextInt();
int totalnumberofdays=minutes/(24*60);
int numberofyears=totalnumberofdays/365;
int remainder=totalnumberofdays%365;
System.out.println(minutes+" minutes is approximately "+numberofyears+" years and "+remainder+" days ");
}
}
