package Factory2;

public class RobustaIngredientFactory implements IngredientFactory {

	@Override
	public Bean getBean() {
		// TODO Auto-generated method stub
		return new AmericanBean();
	}

	@Override
	public Sugar getSugar() {
		// TODO Auto-generated method stub
		return new BrownSugar();
	}

	@Override
	public Milk getMilk() {
		// TODO Auto-generated method stub
		return new CowMilk();
	}

}
