package Factory2;

public class DefaultIngredientFactory implements  IngredientFactory{

	@Override
	public Bean getBean() {
		// TODO Auto-generated method stub
		return new AmericanBean();
	}

	@Override
	public Sugar getSugar() {
		// TODO Auto-generated method stub
		return new RegularSugar();
	}

	@Override
	public Milk getMilk() {
		// TODO Auto-generated method stub
		return new CowMilk();
	}

}
