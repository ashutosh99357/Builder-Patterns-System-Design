package Decorator2;
import java,io.File;
public class Tester {

	public static void main(String[] args)
	
	{
		Writer writer= new CleaningDecorator(new LowerCaseDecorator(new ConsoleDecorator()));
	writer.write("My#name&is ashutosh");
	writer = new UpperCaseDecorator(new CleaningDecorator(new FileWriter("/User/programming pathshala/Destop/myspace.text")));
	writer.write("My name is Ashutosh");
	}
}
