class AutorikshawRunner
{
	public static void main(String[] values)
	{
		System.out.println("running main in aircondition");
		Autorikshaw autorikshaw=new Autorikshaw ();
		String ref=autorikshaw.autoName;
		int ref1=autorikshaw.passenger;
		double ref2=autorikshaw.price;
		
		System.out.println("autorikshaw autoName :"+ref);
		System.out.println("autorikshaw passenger:"+ref1);
		System.out.println("autorikshaw price:"+ref2);
		
		System.out.println("end main in aircondition");
	}
}