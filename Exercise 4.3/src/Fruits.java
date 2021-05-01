import java.util.Scanner;
public class Fruits {
	
	protected String name; //universe cannot access the data
	public Fruits(String name) {
		this.name = name;
	    System.out.println("Fruit constructor is invoked");
	  }
}