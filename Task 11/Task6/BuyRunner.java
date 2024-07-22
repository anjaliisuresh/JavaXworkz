class BuyRunner
{
   public static void main (String[] args)
   {
	   System.out.println("running main in BuyRunner");
	   Buy.product1("Gucci",-599.05);
	   Buy.product1("Gucci",-599.05);
	   Buy.product2("Tom",-3999,"More",-39.8);
	   Buy.product2("Tom",3999,"More",49.8);
	   Buy.bookMovieTicket("Kalki","SPG",-699,-699.8d);
	   Buy.bookMovieTicket("KGF","JPG",699,199.8d);
	   Buy.buyEgg(-12,-60);
	   Buy.buyEgg(12,60);
	   Buy.buyShampoo(999,399.78,"pumma","sep");
	   Buy.buyShampoo(999,399.78,"addidas","feb");
	   Buy.buyCake('s',"choclate","venila",78.7,3);
	   Buy.buyCake('M',"Venila","choclate",88.7,4);
	   Buy.buySmartWatch("titan",150.1,5,'D',8);
	   Buy.buySmartWatch("Sonata",151.1,6,'A',7);
	   Buy.buyLaptop("hp",12,50000.89,4000,16.5,"array",700,16);
       Buy.buyLaptop("DELL",13,50067.89,4080,17.5,"byte",708,17);
	 }
}