class Constructors
{
  String name;
  int const_id;

  Constructors(String name, int const_id)
  {
    this.name = name;
    this.const_id = const_id;
  }

  public static void main(String[] args)
  {
    Constructors c1 = new Constructors("priyansh",101);
    Constructors c2 = new Constructors("neema",102);
    System.out.println("Constructors 1 : "+c1.name+" "+c1.const_id);
    System.out.println("Constructors 2 : "+c2.name+" "+c2.const_id);
  }
}