class PrivateTest
{
  private void m1()
  {
    System.out.println("we can access this method only with this class");
  }
  public static void main(String[] args)
  {
    PrivateTest pt = new PrivateTest();
    pt.m1();
  }
};