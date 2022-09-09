package Factory2;



public class CoffeeFactory {

	
	public Coffee getCoffee(String coffeeType) {
		// TODO Auto-generated method stub
		Coffee coffee;
		if(coffeeType.equals("Cappuccino"))
		coffee = new Cappuccino(new CappuccinoIngredientFactory());
		else if(coffeeType.equals("Espresso"))
		coffee  = new Espresso(new EspressoIngredientFactory());
		else if(coffeeType.equals("Robusta"))
			coffee = new Robusta(new RobustaIngredientFactory());
		else
			coffee = new Robusta(new DefaultIngredientFactory());
		return coffee;
	}
}
