/*Use of method overloading in java*/

class DemoMethodOverloading
{
	void add(int no1,int no2)
	{
		int res;
		res = no1 + no2;
		System.out.println("Sum of values are = "+res);
	}
	void add(int no1,int no2,int no3)
	{
		int res;
		res = no1 + no2 + no3;
		System.out.println("Sum of values are = "+res);
	}
	void add(float no1,float no2)
	{
		float res;
		res = no1 + no2;
		System.out.println("Sum of values are = "+res);
	}
	void add(float no1,int no2)
	{
		float res;
		res = no1 + no2;
		System.out.println("Sum of values are = "+res);
	}
}
class TestMethodOverloading
{
	public static void main(String args[])
	{
		DemoMethodOverloading ob = new DemoMethodOverloading();
		ob.add(10,20);
		ob.add(20,30,50);
		ob.add(10.5f,30.5f);
		ob.add(25.5f,30);
	}
}