
public class Main {
	public static void main(String[] args) {
		CarDecorator car = new SpeedCar(new SedanCar(new YellowCar(new BasicCar(1,"Porshe",4))));
		System.out.println(car.drive());
		
		
	}
	}

