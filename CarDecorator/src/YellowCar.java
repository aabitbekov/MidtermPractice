
public class YellowCar extends CarsDecorator {

	public YellowCar(CarDecorator car) {
		super(car);
	}
	
	public String Yellow() {
		return "Car is yellow.";
	}

	@Override
	public String drive() {
		return super.drive() + Yellow();
	}
 
}
