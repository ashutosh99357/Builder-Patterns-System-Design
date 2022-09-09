package Builder;

public class Tester {

	public static void main(String[] args)
	{
		//User.Builder builder = new  User.Builder(2,"ashu");
		//builder.setAge(10);
		//builder.setPhoneNumber("3127");
		//User user =new User(builder);
		User u1 = new User.Builder(3, "tosh").setAge(5).setPhoneNumber("939364").build(); // Chaining 
		
	}
}

// earlier without chaining we had to write the code in 4 line in the comment but with the concept of chaining it is done in only one line
