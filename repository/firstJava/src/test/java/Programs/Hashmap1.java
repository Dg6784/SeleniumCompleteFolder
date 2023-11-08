package Programs;
import java.util.*;
public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(1, "hello");
		m.put(2, "hello1");
		m.put(3, "hello2");
		m.put(4, "hello3");
		System.out.println(m);
		m.remove(2);
		System.out.println(m);
		m.get(4);
		System.out.println(m.get(3));

	}

}
