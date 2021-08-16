package day1;

class Facebookold{
	
	void reaction() {
		System.out.println("Like Option");
	}
}
class Facebooknew extends Facebookold{
	
	void reaction() {
		System.out.println("Like , wow , love options");
	}
}

public class OverridingEx {

	public static void main(String[] args) {
		Facebookold fb=new Facebookold();
		fb.reaction();
		Facebooknew fb1= new Facebooknew();
		fb1.reaction();
		Facebookold fb2=new Facebooknew();
		fb2.reaction();
		
	
	}

}
