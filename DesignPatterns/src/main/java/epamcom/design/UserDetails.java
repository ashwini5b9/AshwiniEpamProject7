package epamcom.design;

public class UserDetails {
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phoneNo;
	private final String address;
	private UserDetails(UserBuilder builder){
		this.firstName = builder.firstname;
		this.lastName = builder.lastname;
		this.age=builder.age;
		this.phoneNo=builder.phone;
		this.address=builder.address;
	}
	public String getFirstname() {
		return firstName;
	}
	public String getLastname() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public String toString(){
		return "User:"+this.firstName+","+this.lastName+","+this.age+","+this.phoneNo+","+this.address;
		
	}
	public static class UserBuilder{
		private final String firstname;
		private final String lastname;
		private  int age;
		private String phone;
		private  String address;
		public UserBuilder(String firstname,String lastname){
			this.firstname=firstname;
			this.lastname=lastname;
			
		}
		public UserBuilder age(int age){
			this.age = age;
			return this;
		}
		public UserBuilder phone(String phone){
			this.phone = phone;
			return this;
		}
		public UserBuilder address(String address){
			this.address = address;
			return this;
		}
		public UserDetails build(){
			UserDetails user = new UserDetails(this);
			Validateuserobject(user);
			return user;
		}
		private void Validateuserobject(UserDetails user) {
		}
	}
}