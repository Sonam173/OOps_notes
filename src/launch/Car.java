package launch;

public class Car {
	private String color;
	private static int numberOfCars = 0;

	static {
		System.out.println("Car class loaded");
	}

	public Car(String color) {
		this.color = color;
		numberOfCars++;
	}

	public String getColor() {// in static method non static varible can not use
		return this.color;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}
}
  class Tester{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Red");
		Car c2 = new Car("Green");
		Car c3 = new Car("Blue");
		System.out.println("Number of cars created: " + Car.getNumberOfCars());
	}

	static {
		System.out.println("Tester class loaded");
	}

	}


