package Decorator2;

public class UpperCaseDecorator extends WriteDecorator{

	public UpperCaseDecorator(Writer writer) {
		super(writer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void write(String text)
	{
		text = text.toUpperCase();
		super.write(text);
	}

}
