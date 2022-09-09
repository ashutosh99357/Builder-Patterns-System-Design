package Decorator2;

public class WriteDecorator implements Writer {

	private final Writer writer;
	
	public WriteDecorator(Writer writer)
	{
		this.writer=writer;
	}
	@Override
	public void write(String text) {
		// TODO Auto-generated method stub
		writer.write(text);
	}

}
