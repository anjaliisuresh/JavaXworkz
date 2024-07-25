class CatRunner
{
	public static void main(String[] values)
	{
		System.out.println("running main in CatRunner");
		Rupee rupee=new Rupee ();
		String ref=rupee.symbol;
		double ref1=rupee.change;
		int ref2=rupee.code;
		System.out.println("rupee code :"+ref);
		System.out.println("rupee change:"+ref);
		System.out.println("rupee state:"+ref);
		
		System.out.println("end main in CatRunner");
	}
}