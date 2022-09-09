package hw1;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class analyzer {
	
	
	void sum(ArrayList<Double> mylist) {
		
		double total = 0;
		
		for (int i = 0; i < mylist.size();i++) 
	      { 		      
				total = total + mylist.get(i);		
	      }   
	    System.out.println("Sum: " + total);
		
		
	}
	
	void mean (ArrayList<Double> mylist) {

		double total = 0;
		
		for (int i = 0; i < mylist.size();i++) 
	      { 		      
				total = total + mylist.get(i);		
	      }   
		
		double t = total;
		double avg = t/mylist.size();
	    System.out.println("Mean: " + avg);

		
	}
	
	void min(ArrayList<Double> mylist) {
		double mini = mylist.get(0);
		for (int i = 0; i < mylist.size();i++) 
	      { 		      
				if (mylist.get(i)< mini) {
					mini = mylist.get(i);
				}
	      }   
		
	    System.out.println("Minimum: " + mini);

	}
	
	void max(ArrayList<Double> mylist) {
		double maxi = mylist.get(0);
		for (int i = 0; i < mylist.size();i++) 
	      { 		      
				if (mylist.get(i)> maxi) {
					maxi = mylist.get(i);
				}
	      }   
		
	    System.out.println("Maximum: " + maxi);

	}
	
	void median(ArrayList<Double> mylist) {
		if(mylist.size()%2 == 0) {
			int pos = mylist.size()/2;
			int pos1 = pos +1;
		    System.out.println(pos);
		    System.out.println(pos1);
		    int possum = pos1 + pos;
		    double div = 2.0;
			double avg = possum/div;
		    System.out.println("Median: " + avg);
		}
		else {
			int mid = (mylist.size()-1)/2;
			double val = mylist.get(mid);
		    System.out.println("Median: " + val);
			
			
		}
	}
	
	void mode(ArrayList<Double> mylist){
	    double mode = 0;     
	    int maxOccurance = 0;

	    for(int i=0; i<mylist.size(); i++){
	        int occuranceOfThisValue = 0;
	        for(int j=0; j<mylist.size(); j++){
	            if(mylist.get(i)== mylist.get(j))
	               occuranceOfThisValue++;
	        }

	        if(occuranceOfThisValue > maxOccurance){
	            maxOccurance = occuranceOfThisValue;
	            mode = mylist.get(i);
	        }
	    }
	    if (maxOccurance == 1 & mode != 1) {
		    System.out.println("No mode found");

	    }
	    
	    else {
	    System.out.println("Mode: " + mode);
	    }
	}
	
	void maxoccur(ArrayList<Double> mylist){
	    double mode = 0;     
	    int maxOccurance = 0;
	    int test = 1;

	    for(int i=0; i<mylist.size(); i++){
	        int occuranceOfThisValue = 0;
	        for(int j=0; j<mylist.size(); j++){
	            if(mylist.get(i)== mylist.get(j))
	               occuranceOfThisValue++;
	        }

	        if(occuranceOfThisValue > maxOccurance){
	            maxOccurance = occuranceOfThisValue;
	            mode = mylist.get(i);
	        }
	    }
	    
	    if (maxOccurance == 1 & mode != 1) {
		    System.out.println("No max occurence found");
	    }
	    else {
	    System.out.println("Max Occurences -- Value: " + mode + "   Count: " + maxOccurance);
	    }
	    
	}
	
	void variance(ArrayList<Double> mylist) {
		
		double total = 0;
		
			for (int i = 0; i < mylist.size();i++) 
		      { 		      
					total = total + mylist.get(i);		
		      }   
		
		double t = total;
		double avg = t/mylist.size();
		
		ArrayList<Double> devs = new ArrayList<Double>();
		
		for (int i = 0; i < mylist.size();i++) 
	      { 		      
				devs.add(mylist.get(i)-avg);
	      }   
		
		for (int i = 0; i < mylist.size();i++) 
	      { 		      
			double squar = devs.get(i) * devs.get(i);	
			devs.set(i, squar);
	      } 
		
		double tot = 0;
		
		for (int i = 0; i < devs.size();i++) 
	      { 		      
				tot = tot + devs.get(i);		
	      }   
		
		double vary = tot/(devs.size()-1);
		
	    System.out.println("Variance: " + vary);

		
	}
	
	void stddev(ArrayList<Double> mylist) {
		
		double total = 0;
		
			for (int i = 0; i < mylist.size();i++) 
		      { 		      
					total = total + mylist.get(i);		
		      }   
		
		double t = total;
		double avg = t/mylist.size();
		
		ArrayList<Double> devs = new ArrayList<Double>();
		
		for (int i = 0; i < mylist.size();i++) 
	      { 		      
				devs.add(mylist.get(i)-avg);
	      }   
		
		for (int i = 0; i < mylist.size();i++) 
	      { 		      
			double squar = devs.get(i) * devs.get(i);	
			devs.set(i, squar);
	      } 
		
		double tot = 0;
		
		for (int i = 0; i < devs.size();i++) 
	      { 		      
				tot = tot + devs.get(i);		
	      }   
		
		double vary = tot/(devs.size()-1);
		
		double devi = Math.sqrt(vary);
		
	    System.out.println("Standard Deviation : " + devi);

		
	}
	
	void analyze(ArrayList<Double> mylist) {
	    analyzer test = new analyzer();
	    test.sum(mylist);
	    test.mean(mylist);
	    test.median(mylist);
	    test.min(mylist);
	    test.max(mylist);
	    test.mode(mylist);
	    test.maxoccur(mylist);
	    test.variance(mylist);
	    test.stddev(mylist);

	}
	
	public static void main(String[] args) {
	   
		reader readit = new reader();
		readit.getInput();
		analyzer trial = new analyzer();
		trial.analyze(readit.getData());
		
		
	  }

}
