package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparable.Car;

public class ComparableExample {
	
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<Car>();
		Car car1 = new Car("Lexus", 1500, 1994);
		Car car2 = new Car("Toyota", 1600, 1995);

		Car car3 = new Car("Suzuki", 1900, 1984);

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);

		Collections.sort(cars); //comparable example
		
		for(Car c: cars) {
			System.out.println(c);
		}
	}

}
