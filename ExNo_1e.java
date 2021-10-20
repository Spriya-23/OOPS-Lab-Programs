import java.util.Scanner;
import java.io.*;
public class ExNo_1e {
	public static void main(String args[]){  
	try
	{
	int i,fact=1;  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number to find its Factorial = ");
	  int number=sc.nextInt();//It is the number to calculate factorial    
	  if(number>0)
	  {
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);    
	 } 
	  else
	  {
		  System.out.println("Enter a valid number");  
	  }
	}
	
	catch(ArithmeticException e)
	{
		System.out.println(e.toString());  
	}
	}
}