package Builder_Design_pattern;

public class Main {
	public static void main(String[] args) {
		User user = new User.UserBuilder()
		.setEmailId("ashutoshbh100@gmail.com")
		.setUserId(123)
		.setUserName("ashutosh")
		.build();
		
		System.out.println(user);
	}

}
