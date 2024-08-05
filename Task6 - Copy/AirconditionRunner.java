class AirconditionRunner
{
	public static void main(String[] values)
	{
		System.out.println("running main in aircondition");
		Aircondition aircondition=new Aircondition ();
		String ref=aircondition.brand;
		double ref1=aircondition.price;
		int ref2=aircondition.mfDate;
		
		System.out.println("aircondition brand :"+ref);
		System.out.println("aircondition price:"+ref1);
		System.out.println("aircondition mfDate:"+ref2);
		
		System.out.println("end main in aircondition");
	}
}