package Decorator1;

public abstract class Topping extends Pizza{

	private final Pizza pizza;
	
	public Topping(String name, double cost, Pizza pizza) {
		super(name,cost);
		this.pizza=pizza;
	}
	@Override
	public String getName() {
		return super.getName()+ " "+ pizza.getName();
	}
	@Override
	public double getcost()
	{
		return super.getcost() + pizza.getcost();
	}
}
