class paint
{
	public static void picture(String brand)
	{
		System.out.println("running picture in Paint with string parameter");
		System.out.println("brand:"+brand);
	}
	public static void brush(String brand,String color)
	{
		System.out.println("running  brush  in Paint with two string parameter");
		System.out.println("brand:"+brand);
		System.out.println("color:"+color);	
	}
	public static void pencil(String brand,double price)
	{
		System.out.println("running pencil in Paint with one string parameter and one double parameters");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
	}
	public static void eraser(String color,String type,double price)
	{
		System.out.println("running eraser in Paint with two string parameter and one double parameters");
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("price:"+price);
	}
	
	
}