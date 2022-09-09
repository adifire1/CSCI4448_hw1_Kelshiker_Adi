package hw1;
import java.util.Scanner;
import java.util.ArrayList;

public class reader {
	
	ArrayList<Double> data = new ArrayList<Double>();
	
	
	  void getInput() {
		  	
		    System.out.println("Please enter integer or real number or hit enter to terminate loop");
		  	Scanner ini = new Scanner(System.in);
		  	String valS  = ini.nextLine();
		  	double val = Integer.parseInt(valS);  
		    data.add(val);
		    System.out.println(val);
		  	int start= 0;
		
		  	while(start == 0) {
		    System.out.println("Please enter integer or real number or hit enter with no values to terminate loop");
		    valS  = ini.nextLine();
		    if(valS == "") {
			    System.out.println("Loop terminated");
		    	break;
		    }
		    val = Integer.parseInt(valS);
		    data.add(val);
		    System.out.println();
		    for (int i = 0; i < data.size();i++) 
		      { 		      
		          System.out.println(data.get(i)); 		
		      }   
		  	}
		    
		  }
	   public ArrayList<Double> getData() {
		      return(data);
		   }

		  public static void main(String[] args) {

		  }
	
	

}
