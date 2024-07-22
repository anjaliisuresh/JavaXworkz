class Buy
{
  public static void product1(String brand,double price )
  {
     System.out.println("running product in Buy");
	 System.out.println("Brand:"+brand);
	 System.out.println("Price:"+price);
     if(price > -500.67 && price < 5000.67)
	  {
     System.out.println("price is valid");
	 }
	 else
     {  
	 System.out.println("price is invalid");
     }
  }
  public static void product2(String name,int quantity,String quality,double price)
  {
	  System.out.println("running product in buy");
	  System.out.println("name:"+name);
	  System.out.println("quantity:"+quantity);
	  System.out.println("quality:"+quality);
	  System.out.println("Price:"+price);
	  if(price>-600.78 && price < 600.98)
	  {
		System.out.println("price is valid");
	 }
	 else
     {  
	 System.out.println("price is invalid");
     }
	
 }
  public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
  {
	  System.out.println("running bookMovieTicket in buy");
	  System.out.println("name:"+name);
	  System.out.println("theaterName:"+theaterName);
	  System.out.println("quantity:"+quantity);
	  System.out.println("Price:"+price);
      if(price > -200.78 && price < 200.98)
	  {
		System.out.println("price is valid");
	 }
	 else
     {  
	 System.out.println("price is invalid");
     }
	 if(quantity > -1000 && quantity < 2000)
	 {
		System.out.println("quantity is valid");
	 }
	 else
     {  
	 System.out.println("quantity is invalid"); 
	 }	  
  }
  public static void buyEgg(int total,double pricePerEgg)
  {
	System.out.println("running buyEgg in buy");
	System.out.println("total:"+total);
	System.out.println("PricePerEgg:"+pricePerEgg); 
    if(pricePerEgg > -300.78 && pricePerEgg < 300.98)
	  {
		System.out.println("price is valid");
	 }
    else
     {  
	 System.out.println("price is invalid");
     }
	 if(total > -3000.78 && total < 3000.98)
	  {
		System.out.println("price is valid");
	 }
    else
     {  
	 System.out.println("price is invalid");
     }
  }
  public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
  {
	System.out.println("running buyShampoo in buy");
	System.out.println("quantityInMl:"+quantityInMl);
	System.out.println("Price:"+price); 
	System.out.println("Brand:"+brand); 
	System.out.println("ManfDate:"+manfDate); 
    if(quantityInMl > -1000 && quantityInMl < 1000)
	{
		System.out.println("quantity is valid");
	 }
	 else
     {  
	 System.out.println("quantity is invalid"); 
	 }
   if(price > 400.78 && price < 400.98)
	  {
		System.out.println("price is valid");
	 }
    else
     {  
	 System.out.println("price is invalid");
     }
  }	
  public static void buyCake(char size,String type,String flavour,double cost,int quantity)  
  {
	System.out.println("running buyCake in buy");
	System.out.println("size:"+size);
	System.out.println("type:"+type); 
	System.out.println("cost:"+cost); 
	System.out.println("quantity:"+quantity); 
	if(cost>250.0 && cost<10000.78)
  {
   System.out.println("cost is valid"); 
  }
  else
  {
   System.out.println("cost is invalid");
  }
 
 if(quantity>0 && quantity<5) 
	{
        System.out.println("quantity is valid"); 
    } 
	else
	{
        System.out.println("quantity is invalid");
    }
  }
  public static void buySmartWatch(String brand,double price,int color,char type,int mode)
  {
	System.out.println("running buySmartWatch in buy");
	System.out.println("brand:"+brand);
	System.out.println("price:"+price); 
	System.out.println("color:"+color); 
	System.out.println("type:"+type); 
	System.out.println("mode:"+mode); 
  if(price>250.0 && price<10000.78)
  {
   System.out.println("price is valid"); 
  }
  else
  {
   System.out.println("price is invalid");
  }
  if(color>0 && color<8)
  {
   System.out.println("color is valid"); 
  }
  else
  {
   System.out.println("color is invalid");
  }
 }
   public static void buyLaptop (String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
 {
	System.out.println("running buyLaptop in buy");
	System.out.println("brand:"+brand);
	System.out.println("serialNo:"+serialNo); 
	System.out.println("price:"+price); 
	System.out.println("batteryCapacity:"+batteryCapacity); 
	System.out.println("screenSize:"+screenSize); 
	System.out.println("os:"+os); 
	System.out.println("harddiskSize:"+harddiskSize); 
	System.out.println("ramSize:"+ramSize);
   if(serialNo>10 && serialNo<13)
    {
      System.out.println("serialNo is valid"); 
    }
    else
    {
      System.out.println("serialNo is invalid");
    }
 
    if(price>-45550.0 && price<79050.56) 
	{
        System.out.println("price is valid"); 
    } 
	else
	{
        System.out.println("price is invalid");
    } 
    if(batteryCapacity>3000 && batteryCapacity<6000)
    {
     System.out.println("batteryCapacity is valid"); 
    }
    else
    {
     System.out.println("batteryCapacity is invalid");
    }
    if(screenSize>15.4 && screenSize<17.6) 
	{
        System.out.println("screenSize is valid"); 
    } 
	else
	{
        System.out.println("screenSize is invalid");
    } 
    if(harddiskSize>500 && harddiskSize<2000) 
	{
        System.out.println("harddiskSize is valid"); 
    } 
	else
	{
        System.out.println("harddiskSize is invalid");
    }
    if(ramSize>8 && ramSize<32) 
	{
        System.out.println("ramSize is valid"); 
    } 
	else
	{
        System.out.println("ramSize is invalid");
	}		
 }
}