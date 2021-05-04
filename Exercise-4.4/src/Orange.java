
public class Orange extends Fruit{
	private String colour, taste;
	private int quantity; 
	private double price, shipping;
	public Orange(String name, String colour, String taste, int quantity, double price) {
		super (name);
		this.colour = colour;
		this.taste = taste;
		this.quantity = quantity;
		this.price = price;
	  }
	
	public String vitamin() {
		return "\nOranges contains vitamin A,B and C!";
	}
	
	public double shipping() {
		if (this.quantity < 5) {
			this.shipping = 5.00;
		}
		else if (this.quantity < 10) {
			this.shipping = 3.00;
		}
		else {
			this.shipping = 0.00;
		}
		return this.shipping;
	}
	
	public double totalPrice() {
		return this.quantity * this.price;
	}
	
	public String toString() {
		return "\nName\t\t: " + this.name + 
				"\nColour\t\t: "+ this.colour + 
				"\nTaste\t\t: " + this.taste + 
				"\nQuantity\t: "+ this.quantity +
				"\nUnit Price\t: RM " + this.price +
				"\nTotal Price\t: RM " + totalPrice()+
				"\nShipping Fee\t: RM " + shipping() +
				"\nTotal Price(Include Shipping): RM" + (totalPrice() + shipping()) +
				vitamin();
	}
}
