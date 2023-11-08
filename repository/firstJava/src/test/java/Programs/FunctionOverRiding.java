package Programs;
//

class Shape{
	  void draw() {
		  System.out.println("can't say type");
	  }
	  
}

class circle extends Shape{
	@Override void draw() {
		  System.out.println("Circle");
	  }
	   
}
public class FunctionOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape r = new circle();//
		
		r.draw();
		

	}

}








