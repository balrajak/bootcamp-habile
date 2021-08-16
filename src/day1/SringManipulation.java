package day1;

public class SringManipulation {

	public static void main(String[] args) {
		
		String st="Hi welocome to java program ";
		System.out.println(st.contains("Java"));
			
		System.out.println("String from first 5 letters  :");
		System.out.println(st.substring(0,5));
		
		StringBuilder str=new StringBuilder("Hello World Java");
		System.out.println("Original String :");
		System.out.println(str);
		System.out.println(str.append(" Program "));
		
		str.reverse();
		System.out.println("Reversed  String :");
		System.out.println(str);
		

	}

}
