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
		//System.out.println("Enter no of players..");
		//n=s.nextInt();
		//cricket[] c=new cricket[n];
		cricket c;
	
			System.out.println("enter name:");
			String name= s.next();
			System.out.println("enter id:");
			int id=s.nextInt();
			System.out.println("No of matches: 1.one 2.two 3.three");
			int choose=s.nextInt();
			switch(choose)
			{
				case 1:
					String s0;
					performance p0;
					System.out.println("Enter match type:");
					s0=s.next();
					System.out.println("Enter no of catches:");
					int catch1=s.nextInt();
					System.out.println("Enter no of wickets:");
					int wicket=s.nextInt();
					System.out.println("Runs has been made:");
					int run=s.nextInt();
					p0=new performance(catch1,wicket,run);
					c=new cricket(name,id,p0);
					c.display();
					p0.display1(s0);
					break;
				case 2:
					String [] s1 = new String[2];
					performance[] p=new performance[2];	
					for(int i=0;i<2;i++)
					{
						System.out.println("Enter match type:");
						s1[i]=s.next();
						System.out.println("Enter no of catches:");
						catch1=s.nextInt();
						System.out.println("Enter no of wickets:");
						wicket=s.nextInt();
						System.out.println("Runs has been made:");
						run=s.nextInt();
						p[i]=new performance(catch1,wicket,run);
					}
					c=new cricket(name,id,p[0],p[1]);
					c.display();
					p[0].display1(s1[0]);
					p[1].display1(s1[1]);
					break;
				case 3:
					String [] s2 = new String[3];
					performance[] p2=new performance[3];	
					for(int i=0;i<3;i++)
					{
						System.out.println("Enter match type:");
						s2[i]=s.next();
						System.out.println("Enter no of catches:");
						catch1=s.nextInt();
						System.out.println("Enter no of wickets:");
						wicket=s.nextInt();
						System.out.println("Runs has been made:");
						run=s.nextInt();
						p2[i]=new performance(catch1,wicket,run);
					}
					c=new cricket(name,id,p2[0],p2[1],p2[2]);
					c.display();
					p2[0].display1(s2[0]);
					p2[1].display1(s2[1]);
					p2[2].display1(s2[2]);
			}
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
