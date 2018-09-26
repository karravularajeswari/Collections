package collections;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("1");
		a.add("6");
		
		Iterator t=a.iterator();
		while(t.hasNext())
		{
			String b=(String)t.next();
			System.out.println(b);
		}

	}

}
