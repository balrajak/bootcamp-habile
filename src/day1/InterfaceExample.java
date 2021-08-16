package day1;

interface Demoo {
	public void test();
}

class Samplee implements Demoo {
	public void test() {
		System.out.println("Interface Method Implemented");
	}

}

public class InterfaceExample {

	public static void main(String[] args) {

		Samplee s = new Samplee();
		s.test();

	}

}
