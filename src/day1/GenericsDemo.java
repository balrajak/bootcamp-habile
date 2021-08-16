package day1;

class Test<T>
{
	T obj;
	Test(T obj) 
	{ 
		this.obj = obj;
	}
	
	public T getObject()
	{ 
		return this.obj; 
	}
	static <T> void genericDisplay (T element)
    {
        System.out.println(element.getClass().getName() +"= " + element);
    }
}

public class GenericsDemo {

	public static void main(String[] args) {
		
		Test <Integer> obj1 = new Test<Integer>(10);
		System.out.println(obj1.getObject());

		Test <String> obj2 =new Test<String>("GeeksForGeeks");
		System.out.println(obj2.getObject());

		Test.genericDisplay(25);
		Test.genericDisplay("String Type");
		
		
	}

}
