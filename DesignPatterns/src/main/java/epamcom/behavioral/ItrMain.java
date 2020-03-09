package epamcom.behavioral;

public class ItrMain {

	public static void main(String[] args) {
		Learners std = new Learners();
		for(Iterator i = std.getItr();i.hasnext();){
			String student = (String)i.next();
			System.out.println("Students : "+student);
		}

	}

}
