import java.util.Scanner;
class Cpu
{
	int price=75000;
	class Processor
		{
		int noofcores=8;
		String manufacturer="Apple";
		void display()
		{
		System.out.println("No of cores :" + noofcores);
		System.out.println("Name of manufacturer :" + manufacturer);
		}
		}
void display()
	{
	
	
	Processor p=new Processor();
	p.display();
	{
	System.out.println("price :"+price);
	}
	}
static class Ram
	{
	int memory=16;
	String manufacturer="Apple";
	void display()
	{
	System.out.println("memory :" +memory);
	System.out.println("manufacturer :" +manufacturer);
	}
	}
}
class Cpus{
public static void main(String[] args)
{
	Cpu c1=new Cpu();
	c1.display();
	Cpu.Ram r1=new Cpu.Ram();
	r1.display();
	}
}
	










