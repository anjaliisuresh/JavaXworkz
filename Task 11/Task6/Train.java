class Train
{
	public static void book1(String source,String destination)
	{
		System.out.println("running Train in book1 with two string parameter");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
	}
	public static void book2(String source,String destination,int quantity)
	{
		System.out.println("running Train in book2 with two string parameter and one int quantity");
		System.out.println("source:"+source);
	    System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
	}
	public static void book3(String source,String destination,int quantity,double price)
	{
		System.out.println("running Train in book3 with two string parameter and one int quantity and one double");
		System.out.println("source:"+source);
	    System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
	}
	public static void cancel1(int ticketNo)
	{
	System.out.println("running Train in cancel1 with int ticketNo");
	System.out.println("ticketNo:"+ticketNo);
	}
	public static void cancel2(String source,String destination)
	{
		System.out.println("running Train in cancel2 with two string parameter");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
	}
	
}