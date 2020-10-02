 class BasicCar implements CarDecorator {
	 private int id;
	 private String name;
	 private float engineVolume;
	 
	
	public BasicCar() {
		super();
	}
	public BasicCar(int id, String name, float engineVolume) {
		super();
		this.id = id;
		this.name = name;
		this.engineVolume = engineVolume;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getEngineVolume() {
		return engineVolume;
	}
	public void setEngineVolume(float engineVolume) {
		this.engineVolume = engineVolume;
	}
	@Override
	public String toString() {
		return "BasicCar [id=" + id + ", name=" + name + ", engineVolume=" + engineVolume + "]";
	}
	@Override
	public String drive() {
		return "You drive a Basic car.";
	}
	 
	 

}
