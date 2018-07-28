import java.util.Scanner;
class assignment_cricket
{
	String name;
	int id;
	performance odi;
	performance test;
	performance t20;

	cricket(String dname ,int did,performance dodi,performance dtest,performance dt20)
	{
		name=new String(dname);
		id=did;
		odi=dodi;
		test=dtest;
		t20=dt20;
	}
	cricket(String dname ,int did,performance dodi,performance dtest)
	{
		name=new String(dname);
		id=did;
		odi=dodi;
		test=dtest;
		t20=null;
	}
	cricket(String dname ,int did,performance dodi)
	{
		name=new String(dname);
		id=did;
		odi=dodi;
		test=null;
		t20=null;
	}
	void display()
	{
		System.out.println("\nName:" + name + "\n" + "id:" + id + "\n");
	}
	public static void main(String [] args)				
	{
		int n;
		Scanner s=new Scanner(System.in);
		cricket c;
	
		System.out.println("enter name:");
		String name= s.next();
		System.out.println("enter id:");
		int id=s.nextInt();
		System.out.println("Enter choice: 1.one 2.two 3.three");
		int choose=s.nextInt();
		
		String s0;
		performance p0;
		System.out.println("Enter match type:");
		s0=s.next();
		System.out.println("Catches:");
		int catch1=s.nextInt();
		System.out.println("Wickets:");	
		int wicket=s.nextInt();
		System.out.println("runs:");
		int run=s.nextInt();
		p0=new performance(catch1,wicket,run);
		c=new cricket(name,id,p0);
		c.display();
		p0.display1(s0);
	}	
	
}

class performance
{
	int catch1;
	int wicket;
	int run;
	performance(int dcatch,int dwicket,int drun)
	{
		catch1=dcatch;	
		wicket=dwicket;
		run=drun;
	}
	performance()
	{
		catch1=0;	
		wicket=0;
		run=0;			
	}
	void display1(String s)
	{	
		System.out.println(new String(s) +":\n" +"catch:" + catch1 + "\n" + "wicket:" + wicket + "\n" + "run:" + run + "\n");
	}
}
