package temprature;
import java.util.Scanner;


public class Temprature {
	
		  public double convertToFarenhiet(double C) {
			  System.out.println("Converion to Celcius to Farenhiet:");
		    return (C *9/5) + 32 ;
		  }
	     public double convertTocelcius(double F)
	     {
	     System.out.println("Converion to Farenhiet to Celcius:");
	    	 return (F - 32) * 5/9;
	    	 
	    	 
	     }
		  public static void main(String[] args) {
			  Temprature temp = new Temprature();
			  Scanner scan = new Scanner(System.in);
				double  result = scan.nextDouble();
			  System.out.println(temp.convertToFarenhiet(result));
			
			  Temprature temp1 = new Temprature();
		
			  Scanner scan1= new Scanner (System.in);

				double result1 = scan1.nextDouble();
		  
		    System.out.println(temp1.convertTocelcius(result1)); 
		  }
		}




