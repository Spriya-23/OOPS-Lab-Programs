import java.util.*;
abstract class dept
{
    double bp;
    dept(double bpay)
    {   
        bp=bpay;
    }
    void disp()
    {
        System.out.println("basicpay= "+bp);
    }
    abstract double bonus();
}
class sales extends dept
{
    sales(double bpay)
    {
        super(bpay);
    }
    public double bonus()
    {
        return(0.20*bp);
    }
}
class marketing extends dept
{
    marketing(double bpay)
    {
        super(bpay);
    }
    public double bonus()
    {
        return(0.30*bp);
    }
}
class hr extends dept
{
    hr(double bpay)
    {
        super(bpay);
    }
    public double bonus()
    {
        return(0.50*bp);
    }
}

   

public class ExNo2_Program {
	 public static void main(String arg[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter basic pay = ");
	        double bp=sc.nextDouble();
	        sales s=new sales(bp);
	        s.disp();
	        System.out.println("Bonus for sales dept = " +s.bonus());
	        marketing m=new marketing(bp);
	        m.disp();
	        System.out.println("Bonus for marketing dept =  " +m.bonus());
	        hr h=new hr(bp);
	        h.disp();
	        System.out.println("Bonus for hr dept = " +h.bonus());
	    }

}
