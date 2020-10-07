package ProjectsCanvas;
import java.util.Scanner;
public class MonthDayCalculator {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter year:");
	int j = input.nextInt();
	System.out.print("Enter month from 1-12:");
	int m = input.nextInt();
	System.out.print("Enter the day of the month from 1-31:");
	int q = input.nextInt();
	if (m == 1 || m == 2)
	{
	m = (m == 1) ? 13 : 14;
	j--;
	}
	int h = (q + (26 * (m + 1)) / 10 + (j % 100) + (j % 100) / 4 + (j / 100) / 4 + 5 * (j / 100)) % 7; 
	System.out.println("The name of the month is:");
	switch(m)
	{
	    case 1: System.out.println("January"); break;
		case 2: System.out.println("Febrary"); break;
		case 3: System.out.println("March"); break;
		case 4: System.out.println("April"); break;
		case 5: System.out.println("May"); break;
		case 6: System.out.println("June");break;
		case 7: System.out.println("July");break;
		case 8: System.out.println("August");break;
		case 9: System.out.println("September");break;
		case 10:System.out.println("October");break;
		case 11:System.out.println("November");break;
		case 12:System.out.println("December");break;
	}
	System.out.println("Day of the week is:");
	switch(h)
			{
	    case 0: System.out.println("Saturday");break;
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday");
	}
	}
	}

