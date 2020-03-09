package epamcom.design;

public class DesignMain {

	public static void main(String[] args) {
		UserDetails user1 = new UserDetails.UserBuilder("A", "B")
				.age(30)
				.phone("9000000000")
				.address("HYD")
				.build();
		System.out.println(user1);
		UserDetails user2 = new UserDetails.UserBuilder("C", "D")
				.age(40)
				.address("HYD")
				.build();
		System.out.println(user2);

	}
}
