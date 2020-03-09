package epamcom.behavioral;

public class BehavioralMain {
	public static void main(String[] args){
		Emp emp = new Tasks();
		emp.CometoWork();
		System.out.println();
		 emp = new HRandManager();
		 emp.CometoWork();
	}

}
