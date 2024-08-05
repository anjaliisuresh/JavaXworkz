class Moive 
{
	public static void ticket()
	{
		int age=18;
		double price=1000;
		System.out.println("age:"+age);
		String name="Anjali";
	    System.out.println("name:"+name);
	}
	public static void ticket2(int age,String name,double price)
    {
     System.out.println("running ticket2 in moive");
	 System.out.println("age:"+age);
	 System.out.println("Price:"+price);
     if(age>18)
	  {
     System.out.println("ticket price is valid for below 18");
	 }
	 else
     {  
	 System.out.println("ticket price is valid for above 18");
     }
	}
	public static void main(String[] args)
	{
		System.out.println("running ticket in moive");
		ticket();
		ticket2(1,"anjali",4.6);
	}
}