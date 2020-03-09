package epamcom.design;

public  abstract class Cars {
	public Cars(CarModel model) {
        this.model = model;
        arrangeParts();
    }
    private void arrangeParts() {
    }
    protected abstract void construction();
    private CarModel model = null;
    public CarModel getModel() {
        return model;
    }
    public void setModel(CarModel model) {
        this.model = model;
    }

	
}