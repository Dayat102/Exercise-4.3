import java.util.Scanner;
public class Apple extends Fruit {
    
    protected int quantity;
    protected double price;
    
    public Apple(String name, int q, double p) { //constructor with arguments
        super(name);
        this.quantity = q;
        this.price = p;
        
        //System.out.println("Apple constructor is invoked");
    
        if (this.quantity < 10) {
            totalPrice(); //overloading with no arguments
            System.out.println(name);
            System.out.println("If quantity LESS than 10, Total price: RM" + totalPrice());
        
        }
            else if (this.quantity > 10 && this.quantity < 100) {
            double pp = 1.99;
            totalPrice(pp); //overloading with 1 argument
            System.out.println(name);
            System.out.println("If quantity MORE than 10, Total price: RM" + totalPrice(pp));
        }
        
            else {
            double pp = 0.99;
            int qq = 100; //beli la byk mana pun, kuantiti tetap kira 100
            totalPrice(qq, pp); //overloading with 2 arguments
            System.out.println(name);
			System.out.println("If quantity more than 100, Total Price : Rm " + totalPrice(qq,pp));
		}
	}
	
	public double totalPrice() {
		return this.price* this.quantity;
	}
	
	public double totalPrice(double pp) {
		return pp * this.quantity;
	}
	
	public double totalPrice(double qq, double pp) {
		return qq * pp;
	}
}