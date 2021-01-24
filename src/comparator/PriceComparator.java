package comparator;
import java.util.Comparator;

public class PriceComparator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		
		if(o1.getPrice()>o2.getPrice())
			return 1;
		return -1;
	}

}
