package days13;

public class Car {

	//필드
	String name;
	String gearType;
	int door;
	private Engine engine =null;
	
	
	
	public Car(Engine engine) {
		this.engine = engine;
	}

	//getter, setter
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	//생성자
	//메소드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	
	void stop() {
		this.engine.stop();
	}
	
	
	
}
