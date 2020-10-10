/*Employee details using Polymorphism*/

import java.util.*;

class Employee
{
		String empName;
		int empID;
				
		void input()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Employee name");
			empName=sc.nextLine();
			System.out.println("Enter the EmployeeNumber");
			empID=sc.nextInt();
		}
		void calSal()		
		{
			
		}
		void display()
		{
			System.out.println(empName+"\t"+empID);
		}
}

class Manager extends Employee
{
	double basic;
	byte da,hra;
	double gross;
	Manager()
	{
		
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary");
		basic=sc.nextDouble();
		System.out.println("Enter the DA(<128)");
		da=sc.nextByte();
		System.out.println("Enter the HRA(<128)");
		hra=sc.nextByte();
	}
	void calSal()	
	{
		gross=basic+da+hra;
	}
	void display()
	{
		System.out.println("\t\t"+basic+"\t"+da+"\t"+hra+"\t"+gross);
	}
}


class EmployeePolymorphism
{
	public static void main(String args[])
	{
		Employee ob;
		//Object creatation
		ob  = new Employee();
		ob.input();//Call to parent class
		ob.display();
		ob = new Manager();//Call to child class
		ob.input();
		ob.calSal();
		System.out.println("Details of Employees :");
		ob.display();	
	}
}

