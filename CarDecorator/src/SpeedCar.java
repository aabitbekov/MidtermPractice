
public class SpeedCar extends CarsDecorator {

	public SpeedCar(CarDecorator car) {
		super(car);
	}

	public String Speed() {
		return "You speed = 180.";
	}

	@Override
	public String drive() {
		return super.drive() + Speed();
	}
	 
	
	
}
