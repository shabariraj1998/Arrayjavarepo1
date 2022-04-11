package A;

class A{
	private int id;
	public float salary;
	A(int id){
		this.id=id;
		System.out.println("A class constructor");
		//System.out.println("id is:"+obj.id);
	}
}
class B extends A{
	B(int i){
		super(i);
		System.out.println("B class constructor");
	}
}
class C extends B{
	C(int i){
		super(i);
		System.out.println("c class constructor");
	}
}

public class classAconstruct {
	
	public static void main(String[] args) {
		C obj =  new C (25);
	}

}
