class RingRunner
{
	public static void main (String[] args)
	{
		System.out.println("running main in RingRunner");
		char group=Blood.group();
		System.out.println("group return type:"+group);
		String personName=Blood.personName();
		System.out.println("personName return type:"+personName);
		double cost=Blood.cost();
		System.out.println("cost return type:"+cost);
		String hospitalTested=Blood.hospitalTested();
		System.out.println("hospitalTested return type:"+hospitalTested);
		boolean sickness=Blood.sickness();
		System.out.println("sickness return type:"+sickness);
		boolean donate=Blood.donate();
		System.out.println("donate return type:"+donate);
		int carat=Chain.carat();
		System.out.println("carat return type:"+carat);
		double costPerGram=Chain.costPerGram();
		System.out.println("costPerGram return type:"+costPerGram);
		String type=Chain.type();
		System.out.println("typereturn type:"+type);
		String quality=Chain.quality();
		System.out.println("quality return type:"+quality);
		int quantity=Chain.quantity();
		System.out.println("quantity return type:"+quantity);
		double wastage=Chain.wastage();
		System.out.println("wastage return type:"+wastage);
		int serviceCharge=Chain.serviceCharge();
		System.out.println("serviceCharge return type:"+serviceCharge);
		double gst=Chain.gst();
		System.out.println("gst return type:"+gst);
	}
}