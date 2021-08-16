package day1;

abstract class Demo{
	abstract void  test();
	abstract void disp();
	void play() {
		System.out.println("Executing play()....");
	}
} 

class Sample extends Demo
{
	  void test() {
		  System.out.println("Executingb test()");
		  
	  }
	  void disp() {
		  System.out.println("Executingb disp()");
		  
	  }
	
}
public class AbstractExample {

	public static void main(String[] args) {
		
		Demo obj=new Sample();
		obj.test();
		obj.disp();
		obj.play();
	
	}

}
