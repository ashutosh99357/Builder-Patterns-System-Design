package Decorator2;

public class CleaningDecorator extends WriteDecorator{

	public CleaningDecorator(Writer writer) {
		super(writer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write(String text)
	{
		text = text.replaceAll("[^a-zA-Z0-9]", " ");
		super.write(text);
	}

}
