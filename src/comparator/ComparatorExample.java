package comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<Car>();
		Car car1 = new Car("Lexus", 1500, 1994);
		Car car2 = new Car("Toyota", 1600, 1995);

		Car car3 = new Car("Suzuki", 1900, 1984);

		Car car4 = new Car("Tesla", 10, 1984);

		Car car5 = new Car("JPT", 499, 1984);
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		
		Collections.sort(cars,new PriceComparator());
		
		
		for(Car c: cars) {
			System.out.println(c);
		}

	}

	

	

}
