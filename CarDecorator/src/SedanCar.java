
public class SedanCar extends CarsDecorator {

	public SedanCar(CarDecorator car) {
		super(car);
	}

	public String Sedan() {
		return "Sedan.";
	}

	@Override
	public String drive() {
		// TODO Auto-generated method stub
		return super.drive() + Sedan();
	}
	
}
