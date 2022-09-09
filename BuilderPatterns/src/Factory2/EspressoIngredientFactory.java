package Factory2;

public class EspressoIngredientFactory implements IngredientFactory {

	@Override
	public Bean getBean() {
		// TODO Auto-generated method stub
		return new FrenchBean();
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
