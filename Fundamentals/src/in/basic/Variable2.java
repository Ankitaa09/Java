package in.basic;
// every object is sharing the same copy of the static data 

public class Variable2 {

	static int data = 100;
	
	public static void main(String[] args) {
		//using className
		System.out.println(Variable2.data);
		
		//using object:
		Variable2 obj = new Variable2();
		Variable2 obj2 = new Variable2();
		
		System.out.println("________________________");
		System.out.println("Before modifying value");
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		obj.data = 500;
		System.out.println("________________________");
		System.out.println("After modifying value");
		System.out.println(obj.data);
		System.out.println(obj2.data);
	}

}
