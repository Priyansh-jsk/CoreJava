class EncapsulationTest
{
  private int sid;
  private String sname;
  public void setSid(int x)
  {
    this.sid=sid;
  }
  public int getSid()
  {
    return sid;
  }
  public void setSname(String sname)
  {
    this.sname=sname;
  }
  public String getSname()
  {
    return sname;
  }
};
//To access encapsulated use fallowing code:-//
class TestEncapsulation
{
   public static void main(String[] args)
   {
     EncapsulationTest e = new EncapsulationTest();
     e.setSid(101);
     e.setSname("Priyansh");
     int num=e.getSid();
     String name=e.getSname();
     System.out.println(num);
     System.out.println(name);
   }
};