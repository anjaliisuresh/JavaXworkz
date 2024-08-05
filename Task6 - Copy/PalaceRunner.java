class PalaceRunner
{
	public static void main (String[] information)
	{
		System.out.println("running main in PalaceRunner");
		if(information.length==4)
		{
			System.out.println("getting 4 reference from main method arguments");
			String name= information[0];
			String location= information[1];
			String builtBy= information[2];
			String buildYear= information[3];
			
			System.out.println("name:"+name);
			System.out.println("location:"+location);
			System.out.println("builtBy:"+builtBy);
			System.out.println("buildYear:"+buildYear);
			
			
		}
		else
		{
			System.out.println("not getting 4 reference from main method arguments");
		
		}
		
	}
}