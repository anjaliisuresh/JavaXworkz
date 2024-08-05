class DeliveryVehicle
{
  public static void deliver(String item,String location)
  {
	  System.out.println("running deliver in DeliveryVehicle with the two string parameter");
	  Company.deliver(item,location);
  }
}