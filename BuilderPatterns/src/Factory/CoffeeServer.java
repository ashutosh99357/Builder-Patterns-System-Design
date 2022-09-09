package Factory;

public class CoffeeServer {

	public final AbstarctFactory factory;
	public CoffeeServer(AbstarctFactory factory)
	{
		this.factory=factory;
	}
	
	public Coffee serve(String coffeeType)
	{
		Coffee coffee = this.factory.getCoffee(coffeeType);
		coffee.brew();
		coffee.boil();
		return coffee;
	}
}
