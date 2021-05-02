import java.util.Scanner;
public class Apple extends Fruits {

	Scanner sc=new Scanner (System.in);
	private double amount,price,discount,b,total,tendered,balance;
	private char ans;
	private Object Pay;
	
	public Apple(String name) {
		super(name);
		System.out.println("Please enter the total number of fruits you purchased");
		this.amount=sc.nextDouble();
	    this.price= this.amount*0.70;
	}
	private void discount(int amount) {
		// TODO Auto-generated method stub
		System.out.println("50 Apple - 70 = 0.50 per fruits ");
		System.out.println("71 Apple - 90 = 0.45 per fruits ");
		System.out.println("More than 90 = 0.40 per fruits ");
		
		System.out.println();
		System.out.println("Do you want to increase the amount of fruit to buy? (Y/N) ");
		this.ans=sc.next().charAt(0);
		
		do {
			if (ans == 'Y') {
				System.out.println("This is the amount of fruit you have taken : " + amount);
				System.out.println("Please enter amount that you want to add? ");
				this.b=sc.nextDouble();
				this.total= this.b + this.amount;
				
				if (total>= 50 || total< 71 ) {
					this.discount= this.total * 0.50;
				}
				else if (total>= 71 || total< 91 ) {
					this.discount= this.total * 0.45;
				}
				else if (total>= 91 ) {
					this.discount= this.total * 0.40;
				}
				break;
			}
			else if(ans == 'N') {
				this.discount=this.price;
				break;
			}
			else {
				System.out.println("Wrong input!!!");
			}
			System.out.println("Do you want to increase the amount of fruit to buy? (Y/N) ");
			this.ans=sc.next().charAt(0);	
		} while (ans!= 'Y'|| ans != 'N');
	}

	private void Tendered() {
		// TODO Auto-generated method stub

		 System.out.println("You bought:");
	     System.out.printf("\n%1s%31s%13s" , "Fruits" , "Quantity" , "Total Price (RM)");
		 System.out.print("\n--------------------------------------------------");
		 System.out.printf("\n%1s%26s%16.2f" , "Apple" , amount , discount);
	     System.out.print("\n--------------------------------------------------");
	     System.out.print("\nPlease enter Amount Tendered: RM ");
	     this.tendered = sc.nextDouble();
	     if (tendered >= discount)
	        {
	           this.balance = this.tendered - this.discount;
	           System.out.printf("%1s%43.2f" , "Balance" , balance);
	           System.out.println("\n*******************");
	           System.out.println("$$$$$$$$$$--THANK YOU. PLEASE COME AGAIN--$$$$$$$$$");
	        }
	     else
	        {
	           System.out.println("Error. Input cannot less than Amount Tendered!!");
	           System.out.print("Please enter Amount Tendered: RM ");
	           this.tendered = sc.nextDouble();
	           this.balance = this.tendered - this.discount;
	           System.out.printf("%1s%43.2f" , "Balance" , this.balance);
	           System.out.println("*****************");
	           System.out.println("$$$$$$$$$$--THANK YOU. PLEASE COME AGAIN--$$$$$$$$$");
	        }
	}

	public Double getAmount() {
		return amount;
	}
	public Double getPrice() {
		return price;
	}
	public Double getDiscount() {
		return discount;
	}
	public char getAns() {
		return ans;
	}
	public Double getB() {
		return b;
	}
	public Double getTendered() {
		return tendered;
	}
	public Double getBalance() {
		return balance;
	}
}
