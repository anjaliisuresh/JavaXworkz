class MirrorRunner
{
	public static void main (String[] args)
	{
		System.out.println("running main in MirrorRunner");
		String country=Mirror.country(91);
		System.out.println("country:"+country);
		String country1=Mirror.country(1);
		System.out.println("country:"+country1);
		String country2=Mirror.country(44);
		System.out.println("country:"+country2);
		String country3=Mirror.country(86);
		System.out.println("country:"+country3);
		String country4=Mirror.country(61);
		System.out.println("country:"+country1);
		String country5=Mirror.country(96);
		System.out.println("country:"+country5);
		double price= Mirror.price("washingMachine");
		System.out.println("price:"+price);
		double price1= Mirror.price("kfc");
		System.out.println("price1");
		double price2= Mirror.price("burger");
		System.out.println("price2");
		double price3= Mirror.price("kabab");
		System.out.println("price3");
		double price4= Mirror.price("dosa");
		System.out.println("price4");
		double price5= Mirror.price("pizza");
		System.out.println("price5");
		String producerName =Mirror.producerName("jollyDays");
		System.out.println("producerName:"+producerName);
	    String producerName1=Mirror.producerName("kgf");
		System.out.println("producerName:"+producerName1);
		String producerName2=Mirror.producerName("kantara");
		System.out.println("producerName:"+producerName2);
		String producerName3=Mirror.producerName("sarathi");
		System.out.println("producerName:"+producerName3);
		String producerName4=Mirror.producerName("rajakumar");
		System.out.println("producerName:"+producerName4);
		String producerName5=Mirror.producerName("kgf2");
		System.out.println("producerName:"+producerName5);
		double price6=Phone.price("acetaminophen");
		System.out.println("price:"+price6);
		double price7=Phone.price("albuterol");
		System.out.println("price:"+price7);
		double price8=Phone.price("amlodipine");
		System.out.println("price:"+price8);
		double price9=Phone.price("dollo");
		System.out.println("price:"+price9);
		String medicineName=Phone.medicineName("fever");
        System.out.println("medicineName:"+medicineName);
		String medicineName1=Phone.medicineName("cold");
        System.out.println("medicineName:"+medicineName1);
		String medicineName2=Phone.medicineName("body pain");
        System.out.println("medicineName:"+medicineName2);
		String medicineName3=Phone.medicineName("heart pain");
        System.out.println("medicineName:"+medicineName3);
		String availability=Phone.availability("janavi");
		System.out.println("availability:"+availability);
		String availability1=Phone.availability("amulya");
		System.out.println("availability1:"+availability1);
		String availability2=Phone.availability("sindhu");
		System.out.println("availability2:"+availability2);
		String availability3=Phone.availability("xxxx");
		System.out.println("availability3:"+availability3);
		
	}
}