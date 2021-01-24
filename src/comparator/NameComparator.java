package comparator;
import java.util.Comparator;

public class NameComparator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		
		if(o1.getName().compareTo(o2.getName())>0)
			return 1;//name of o1 lexicographically greater, comes first in dictionary
		return -1;
	}

}
