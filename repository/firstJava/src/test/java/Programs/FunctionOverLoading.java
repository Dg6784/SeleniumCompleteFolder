package Programs;

public class FunctionOverLoading {

	void A(){
		System.out.println("A");
	}
	void A(int x){
		int a=x;
		System.out.println(a);
	}
	void A(int x,int y){
		int z=x+y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverLoading r = new FunctionOverLoading();
		r.A();
		r.A(5);
		r.A(5,6);

	}

}
