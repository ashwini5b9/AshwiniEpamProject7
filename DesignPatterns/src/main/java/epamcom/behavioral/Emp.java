package epamcom.behavioral;

public abstract class Emp {
	abstract void working();
	abstract void takingbreak();
	abstract void gettingpaid();
	public final void CometoWork(){
		working();
		takingbreak();
		working();
		
	}	

}
