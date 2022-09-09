package Builder;

public class User {

	private final int id;
	private final String name;
	private final String phoneNumber;
	private final int age;
	
	private User(Builder builder)
	{
		this.id=builder.id;
		this.age=builder.age;
		this.name=builder.name;
		this.phoneNumber=builder.phoneNumber;
	}
	public static class Builder{
		private final int id;
		private final String name;
		private  String phoneNumber;//optional
		private  int age;// optional
		
		public Builder(int id, String name) {
			this.id=id;
			this.name=name;
			this.phoneNumber= "";
			this.age= 0;
	
		}
		public Builder setPhoneNumber(String phoneNumer) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		public Builder setAge(int age)
		{
			this.age=age;
			return this;
		}
		public User build() {
			return new User(this);
		}
	}
}

// Having an intermediate class that hold the agruments : inner static class (in which immutability is sacrificed i.e final)
//for chaining we need to return something in the constructor like the class itself
// Builder pattern : It is basically used to make the client happy and easy to work with the software. It is used when there are lot of arguments and immutability.

// it should be used only when there is
// 1 . optional arguments
//  2. immutability