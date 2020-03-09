package epamcom.structural;

public class SampleFile implements PrintMediaFile{
	private String Filename;
	
	public SampleFile(String Filename){
	    this.Filename = Filename;
	    loadFromDisk(Filename);
	 }
	
	public void printingName() {
		System.out.println("Displaying:"+ Filename);	
	}
	private void loadFromDisk(String Filename){
	    System.out.println("Loading "+Filename);
	 }
}
