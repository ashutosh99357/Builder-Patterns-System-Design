package Decorator2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter implements Writer {

	private final String filePath;
	
	public FileWriter(String path)
	{
		this.filePath=path;
	}
	@Override
	public void write(String text) {
		// TODO Auto-generated method stub
		try {
			Files.write(Paths.get(filePath),text.getBytes());
		}catch(Exception e) {
			System.out.println("Exception is FileWriter");
		}
	}

}
