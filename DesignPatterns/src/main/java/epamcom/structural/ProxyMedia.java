package epamcom.structural;

public class ProxyMedia implements PrintMediaFile{
	private SampleFile SF;
	   private String FileName;
	   public ProxyMedia(String Filename){
	      this.FileName = Filename;
	   }
	   public void printingName() {
	      if(SF == null){
	    	  SF = new SampleFile(FileName);
	      }
	      SF.printingName();
	   }
}
