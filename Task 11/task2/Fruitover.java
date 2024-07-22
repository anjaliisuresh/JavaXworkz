class Fruit{

   public static void main(String[] args)
   {
	   Energy();
   }
   public static void digestive()
   {
      System.out.println("Fruit provides digestive health");
	  Energy();
   }
   public static void Energy()
   {
     System.out.println("Fruit provides Energy");
	 digestive();
   }
}