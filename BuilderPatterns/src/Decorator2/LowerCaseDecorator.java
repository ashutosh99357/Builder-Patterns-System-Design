package Decorator2;

public class LowerCaseDecorator extends WriteDecorator{

	public LowerCaseDecorator(Writer writer) {
		super(writer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write(String text)
	{
		text = text.toLowerCase();
		super.write(text);
	}

}
