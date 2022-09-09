package Decorator2;

public class ConsoleDecorator implements Writer {

	@Override
	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println(text);
	}

}
