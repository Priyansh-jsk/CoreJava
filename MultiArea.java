class Multi
{
	float length;
	float breath;
	void getdata(float a, float b)
  	{
    	    length = a;
            breath = b;
  	}
}
class MultiArea
{
   public static void main(String[] args)
   {
	float area;
	Multi multi1 = new Multi();
	multi1.getdata(7,10);
	area = multi1.length * multi1.breath;
	System.out.println("Area =" +area);
   }
}
 