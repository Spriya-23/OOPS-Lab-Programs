import java.util.Scanner;

public class ExNo1_a {
	public static void main(String args[])
	{
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum =0;
		int res=0;
		sc.close();
		//LOOP - Logic for calculating sum of n digits
		if(number>0)
		{
		while(number>0)
		{
		res = number%10; 
		sum = sum+res;
		number = number/10;
		}
		System.out.println("Sum of Digits of the Numebr "+number+" is = ");
		System.out.println(sum);
		}
		else
		{
			System.out.println("Enter a Positive Number");
		}
		}
		

}
