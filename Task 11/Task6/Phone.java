class Phone 
{
	public static double price (String medicineName)
	{
		System.out.println("running price in phone");
		
		if(medicineName=="acetaminophen")
		{
			double price=100.5;
			System.out.println("medicineName");
			
			return price;
		}
		if(medicineName=="albuterol")
		{
			double price=150.5;
			System.out.println("medicineName");
			
			return price;
		}
		if(medicineName=="amlodipine")
		{
			double price=200.5;
			System.out.println("medicineName");
			
			return price;
		}
		return 0;
	}
	public static String medicineName (String symptom)
	{
		System.out.println("running medicineName in phone");
		
		if(symptom=="fever")
		{
			String medicineName="acetaminophen";
			
			System.out.println("symptom:"+symptom);
			return medicineName;
		}
		if(symptom=="cold")
		{
			String medicineName="albuterol";
			
			System.out.println("symptom:"+symptom);
			return medicineName;
		}
		if(symptom=="body pain")
		{
			String medicineName="amlodipine";
			
			return medicineName;
		}
		return "no symptom found";
	}
	public static String availability(String doctorName)
	{
	System.out.println("running medicineName in phone");
		
		if(doctorName=="janavi")
		{
			String availability ="monday";
			System.out.println("doctorName:"+doctorName);
			
			return availability;
		}
		if(doctorName=="amulya")
		{
			String availability ="friday";
			System.out.println("doctorName:"+doctorName);
			
			return availability;
		}
		if(doctorName=="sindhu")
		{
			String availability ="thursday";
			System.out.println("doctorName:"+doctorName);
			
			return availability;
		}
		return "not available";
		
		
	}
}