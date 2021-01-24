package comparable;

public class Car  implements Comparable<Car> {
	
	private String name;
	private int price;
	private int year;
	
	public Car(String name, int price, int year) {
		
		this.name = name;
		this.price = price;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Cars [name=" + name + ", price=" + price + ", year=" + year + "]";
	}
	@Override
	public int compareTo(Car o) {
		//thi sclass: use this.propertyname
		//class being compared with: use o.getProperty
		
		if(this.getName().compareTo(o.getName())>0)
			return 1;//name of o1 lexicographically greater, comes first in dictionary
		return -1;
	}
	
	

}
