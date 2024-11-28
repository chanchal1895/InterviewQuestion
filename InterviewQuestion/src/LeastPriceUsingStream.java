import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LeastPriceUsingStream {
	public static void main(String[] args) {
		
		List<Computer> listOfComputer = new  ArrayList<>();
		listOfComputer.add(new Computer("Dell", 60000));
		listOfComputer.add(new Computer("HP", 35000));
		listOfComputer.add(new Computer("Lenevo", 45000));
		listOfComputer.add(new Computer("Dell", 3000));
		listOfComputer.add(new Computer("Asus", 2000));
		listOfComputer.add(new Computer("Dell", 25000));
		
		double leastPrice= listOfComputer.stream().filter(com->com.getBrand().equals("Dell")).
		 map(com->com.getPrice()).mapToDouble(price->price).summaryStatistics().getMin();
		List<Computer> listOfDellComputer = listOfComputer.stream().filter(com->com.getBrand().equals("Dell")).
				sorted((com1,com2)-> (int)(com1.getPrice()-com2.getPrice())).collect(Collectors.toList());
		System.out.println(leastPrice);
		System.out.println(listOfDellComputer);
				
	}
	public void applyDiscount(Double discount) {
		
	}
}
class Computer{
	
	private String brand;
	private double price;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Computer(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", price=" + price + "]";
	}
	
	
}