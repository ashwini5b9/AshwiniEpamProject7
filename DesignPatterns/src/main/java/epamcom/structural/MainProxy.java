package epamcom.structural;

public class MainProxy {

	public static void main(String[] args) {
		PrintMediaFile media = new ProxyMedia("movierulz.mp3");
		media.printingName();
		media.printingName();
	}

}
