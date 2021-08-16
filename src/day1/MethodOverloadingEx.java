package day1;

class Flipkart{
	
	void payment() {
		System.out.println("Cash On Delivery mode.....");
	}
	void payment(String uname,String password) {
		System.out.println("Netbanking.....");
	}
	void payment(long card, int pin) {
		System.out.println("Using Card Payment mode.....");
	}


}

public class MethodOverloadingEx {

	public static void main(String[] args) {
		Flipkart pay=new Flipkart();
		pay.payment();
		pay.payment("Balraj","Passw0rd");
		pay.payment(897654321,54321);
		
	}

}
