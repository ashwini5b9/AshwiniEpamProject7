package epamcom.design;

public class Model_Luxury extends Cars{
	 Model_Luxury() {
		super(CarModel.LUXURY);
		construction();
	}
	public void construction(){
		System.out.println("Building luxury car");	
	}
}
