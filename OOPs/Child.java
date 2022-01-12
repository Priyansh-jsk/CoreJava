class Parent
{
	public void m1()
	{
	  System.out.println("m1 methos call");
	}
	public void m2()
	{
	  System.out.println("m2 methos call");
	}
}
class Child extends Parent
{
	public void m3()
	{
	   System.out.println("m3 method call");
	}
	public static void main(String[] args) {
	  Child c = new Child();
	  c.m1();
	  c.m2();
	  c.m3();
	  Parent p = new Parent();
	  p.m1();
	  p.m2();
	  }
}