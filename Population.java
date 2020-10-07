package REVELTESTING;

public class Population {
	public static void main(String[]args){
	    double alpha=7.0;
	    double bravo=13.0;
	    double charlie=45.0;
	      /*seperator*/
	    double population=312032486;
	    double S=60*60*24*365;
	    /*seperator*/
	    double nb=S/alpha;
	    double nd=S/bravo;
	    double ni=S/charlie;
	      /*seperator*/
	    for(int i=1;i<6;i++){
	        population+=nb+ni-nd;
	        System.out.println("Population after "+i+" year:"+(int)(population));
	    }
	    }
	}

