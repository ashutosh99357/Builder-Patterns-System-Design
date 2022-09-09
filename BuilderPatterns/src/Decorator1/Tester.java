package Decorator1;

public class Tester {

	public static void main(String[] args)
	{
	Pizza pizza = new Mushroom(new Olive(new Onion(new WheatBase()))); // Decorator Pattern
	System.out.println(pizza.getName() + " " + pizza.getcost()); 
	}
}
