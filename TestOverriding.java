/*Use of method overriding in Java to avoid overriding of methods in inheritance*/

class ParentOverriding
{
	void show()
	{
		System.out.println("Base class Method");
	}
}
class ChildOverriding extends ParentOverriding
{
	void show()
	{
		System.out.println("Derived class Method");
	}
}
class TestOverriding
{
	public static void main(String args[])
	{
		ParentOverriding ob;//Reference of parent class
		ob = new ChildOverriding();//Upcasting 
		ob.show();
		
		ob = new ParentOverriding();
		ob.show();
	}
}