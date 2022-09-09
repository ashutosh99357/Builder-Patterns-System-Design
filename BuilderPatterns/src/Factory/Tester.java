package Factory;

public class Tester {

	public static  AbstarctFactory factory;
 
	public Tester(AbstarctFactory factory)
	{
		Tester.factory=factory;
	}
	public static void main(String[] args)
	{
		
	CoffeeServer coffeeServer = new CoffeeServer(factory);
	coffeeServer.serve("Espresso");
	}
}
