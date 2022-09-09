package Decorator1;

public abstract class Pizza {

	private final String name;
	private final double cost;
	
	protected Pizza(String name, double cost)
	{
		this.name=name;
		this.cost=cost;
	}
	
	public String getName() {
		return name;
	}
	public double getcost()
	{
		return cost;
	}
}
