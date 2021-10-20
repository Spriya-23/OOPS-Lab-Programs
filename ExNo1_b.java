import java.util.Scanner;
public class ExNo1_b {
	
	public static void main(String args[])
	{
		System.out.println("Enter a Length of the Fibonacci Sequece to be printed");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.close();
		int n1=0;
		int n2=1;
		int fibonacci_num=0;
		if(length >0)
		{
			System.out.println("Fibonacci Sequence of "+length+" Terms is ...");
			System.out.print(n1+ " "+n2+" ");
			for(int i=1;i<length-1;i++)
			{
				fibonacci_num= n1+n2;
				n1 = n2;
				n2 = fibonacci_num;
				System.out.print(fibonacci_num+" ");
			}
			
		}
		else
		{
			System.out.println("Enter a correct number");
		}

	}

}
