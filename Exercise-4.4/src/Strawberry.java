
public class Strawberry extends Fruit{
	private String colour, taste;
	private int quantity; 
	private double weight, price;
	public Strawberry(String name, String colour, String taste, int quantity, double weight, double price) {
		super (name);
		this.colour = colour;
		this.taste = taste;
		this.quantity = quantity;
		this.weight = weight;
		this.price = price;
	}
	
	public String vitamin() {
		return "\nStrawberries contains vitamin C!";
	}
	
	public double totalWeight(int quantity, double weight) {
		return quantity * weight;
	}
	
	public double totalPrice(int quantity, double weight) {
		return quantity * weight * price;
	}
	
	public String toString() {
		return "\nName\t\t: " + this.name +
				"\nColour\t\t: "+ this.colour + 
				"\nTaste\t\t: " + this.taste +  
				"\nNumber of box\t: "+ this.quantity + 
				"\nWeight per box\t: "+ this.weight + "kg" +
				"\nTotal weight\t: " + totalWeight(quantity, weight) + "kg" +
				"\nPrice per kg\t: RM " + this.price +
				"\nTotal Price\t: RM " + totalPrice(quantity, weight)+
				vitamin();
	}
}