package Factory;

public class CoffeeFactory implements AbstarctFactory {

	@Override
	public Coffee getCoffee(String coffeeType) {
		// TODO Auto-generated method stub
		Coffee coffee;
		if(coffeeType.equals("Cappuccino"))
		coffee = new Cappuccino();
		else if(coffeeType.equals("Espresso"))
		coffee  = new Espresso();
		else
			coffee = new Robusta();
		return coffee;
	}
	

	
}
