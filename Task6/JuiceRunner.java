class JuiceRunner
{
    public static void main (String[] information)
	{
		System.out.println("running main in JuiceRunner");
		if(information.length==5)
		{
			System.out.println("getting 5 refrence from main method argument");
			String name= information[0];
			String brand= information[1];
			String flavour= information[2];
			String price= information[3];
			String quantity= information[4];
			
			double convertedprice=Double.parseDouble(price);
			int convertedquantity=Integer.parseInt(quantity);
			
			Juice.info("Pinapple","Flavours24","Venilla",convertedprice,convertedquantity);
			
		}
		else
		{
			System.out.println("not getting 5 refrence from main method argument");
		}
		
	}

}