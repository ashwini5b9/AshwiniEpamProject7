package epamcom.design;

public class Model_Big extends Cars{

	 Model_Big() {
		super(CarModel.BIG);
		construction();
	 }
	 public void construction(){
		 System.out.println("Building big car");
	 }

}

