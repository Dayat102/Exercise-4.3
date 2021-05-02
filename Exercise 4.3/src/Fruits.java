import java.util.Scanner;
public class Fruits {
	
	protected String name; //universe cannot access the data
	public Fruits(String name) {
		this.name = name;
	    System.out.println("Fruit constructor is invoked");
	  }
	public String discount() {
		return("We provide special promotions if you buy fruit in that amount:- ");
	}
}