
public class CarsDecorator implements CarDecorator {
	CarDecorator car;
    
	public CarsDecorator(CarDecorator car) {
		this.car= car;
	}

	@Override
	public String drive() {
		return car.drive();
	}

}
