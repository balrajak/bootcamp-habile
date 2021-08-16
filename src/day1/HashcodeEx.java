package day1;

class Example1
{
	
}
class Example2
{	
	
	public  int hashCode() {
		System.out.println("custom hash code");
		return 12;
	}
}

public class HashcodeEx {

	public static void main(String[] args) {
		
		Example1 e1=new Example1();
		System.out.println(e1.hashCode());

		Example2 e2=new Example2();
		System.out.println(e2.hashCode());
	}

}
