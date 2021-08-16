package day1;

class Coordinates {
	int x = 10;
	int y =20;

	public boolean equals(Object obj) {
		Coordinates ch = (Coordinates) obj;
		if (this.x == ch.x && this.y==ch.y)
			return true;
		else
			return false;
	}
}

public class ExampleEquals {

	public static void main(String[] args) {

		Coordinates e1 = new Coordinates();
		Coordinates e2 = new Coordinates();
		System.out.println(e1.equals(e2));

	}

}
