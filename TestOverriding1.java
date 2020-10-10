/*Use of method overriding in Java to avoid overriding of methods in multi-level inheritance*/

class ParentOverriding1
{
	void show()
	{
		System.out.println("Base class Method");
	}
}
class ChildOverriding1 extends ParentOverriding1
{
	void show()
	{
		System.out.println("Derived1 class Method");
	}
}
class ChildOverriding2 extends ChildOverriding1
{
	void show()
	{
		System.out.println("Derived2 class Method");
	}
}
class TestOverriding1
{
	public static void main(String args[])
	{
		ParentOverriding1 ob;//Reference of parent class
		ob = new ChildOverriding1();//Upcasting 
		ob.show();
		
		ob = new ParentOverriding1();
		ob.show();
		
		ob = new ChildOverriding2();//Upcasting 
		ob.show();
	}
}