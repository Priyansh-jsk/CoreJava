public class PublicTest
{
  public int a = 10;
  public void m1()
  {
     System.out.println("public method access in any package");
  }
  public static void main(String[] args)
  {
    PublicTest pt = new PublicTest();
    pt.m1();
    System.out.println(pt.a);
  }
 };