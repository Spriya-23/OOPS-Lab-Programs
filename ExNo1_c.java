import java.util.Scanner;
public class ExNo1_c {
	public static void main(String[] args) 
	{
		int i, number, count; 
		
		System.out.println("Enter the N range = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0)
		{
		System.out.println(" Prime Numbers from 1 to "+n+" are : ");	
		for(number = 1; number <= 100; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
		else
		{
			System.out.println("Enter a correct Range");
		}
	}

}