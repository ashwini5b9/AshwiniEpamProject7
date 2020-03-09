package epamcom.design;

public class CarBuilding {
	public static Cars BuildingCar(CarModel model){
		 Cars car = null;
	        switch (model) {
	        case BIG:
	            car = new Model_Big();
	            break;
	        case LUXURY:
	            car = new Model_Luxury();
	            break;
	 
	        default:
	            break;
	        }
	        return car;
		
	}

}
