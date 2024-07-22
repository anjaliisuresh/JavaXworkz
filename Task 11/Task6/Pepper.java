class Pepper
{
   public static void dimLight(String boxName)
    {
	   System.out.println("running dimLight in Pepper");
	   if(boxName=="Ginger")
	   {
		   String dimLight="Garlic";
		   System.out.println("item is found"); 
           return;		   
	   }
	   else
	   {
		   System.out.println("item is not found"); 
		   return;
	   }
	}
}