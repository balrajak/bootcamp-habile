package day1;

class Employee{  
	
	 float salary=40000;  
	 int bonus=10000; 
	 
	}  

class Developer extends Employee{  
	
	public void disp() {
	   System.out.println("Developer salary is:"+salary);  
	   System.out.println("Bonus of Developer is:"+bonus);   
	}
}  
	
public class InheritanceExample {

	public static void main(String[] args) {

		Developer p=new Developer();  
		   p.disp();
		}

}
