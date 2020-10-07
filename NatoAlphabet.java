package ProjectsCanvas;
import java.util.*;

public class NatoAlphabet {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	   String nato[] = new String[26];
	 
	   nato[0] = "alpha";
	   nato[1] = "bravo";
	   nato[2] = "charlie";
	   nato[3] = "delta";
	   nato[4] = "echo";
	   nato[5] = "foxtrot";
	   nato[6] = "golf";
	   nato[7] = "hotel";
	   nato[8] = "india";
	   nato[9] = "juliet";
	   nato[10] = "kilo";
	   nato[11] = "lima";
	   nato[12] = "mike";
	   nato[13] = "november";
	   nato[14] = "oscar";
	   nato[15] = "papa";
	   nato[16] = "quebec";
	   nato[17] = "romeo";
	   nato[18] = "sierra";
	   nato[19] = "tango";
	   nato[20] = "uniform";
	   nato[21] = "victor";
	   nato[22] = "wiskey";
	   nato[23] = "x-ray";
	   nato[24] = "yankee";
	   nato[25] = "zulu";
	  
	   char alpha;
	   do
 {
 System.out.print("Enter the character or 1 to exit : "); 
	       alpha = input.nextLine().charAt(0); 
	       if(alpha >= 'a' && alpha <= 'z')
	       {
 System.out.println(alpha + " : " + nato[(int)alpha - 97]); 
	       }
	       else if(alpha >= 'A' && alpha <= 'Z')
	       {
System.out.println(alpha + " : " + nato[(int)alpha - 65]); 
	       }
	       else if(alpha == '1')
	       {
System.out.println("Thanks for using the phonetic translator");
	      
	       }
	       else
	       {
System.out.println("Invalid input"); 
	       }
	       }while(true);
	  
	   }
	}
