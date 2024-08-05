class MedicineRunner
{
    public static void main (String[] information)
	{
		System.out.println("running main in MedicineRunner");
		if(information.length==4)
		{
			System.out.println("getting 4 refrence from main method argument");
			String name= information[0];
			String manfdate= information[1];
			String price= information[2];
			String quantity= information[3];
			
			int convertedmanfdate=Integer.parseInt(manfdate);
			double convertedprice=Double.parseDouble(price);
			int convertedquantity=Integer.parseInt(quantity);
			
			Medicine.info("Dollo",convertedmanfdate,convertedprice,convertedquantity);
			
		}
		else
		{
			System.out.println(" not getting 4 refrence from main method argument");
		}
		
	}

}