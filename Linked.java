package collections;
import java.util.*;
public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("hi");
		l.add("this");
		l.add("is");
		l.add("raje");
		
		LinkedList l1=new LinkedList();
		l1.addAll(l);
		
		ArrayList a=new ArrayList();
		a.addAll(l1);
		
		Iterator i=l.iterator();
		
		while(i.hasNext())
		{
			String s=(String)i.next();
			System.out.println(s);
		}
		
		System.out.println(l1);
		System.out.println(a);
		
	}

}
