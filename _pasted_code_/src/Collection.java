import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Collection {
	public static void main(String args[]) {
		List al=new LinkedList();
		al.add(5);
		al.add(6);
		al.add(8);
		Date d=new Date();
		
		al.add(9);
		al.add(10);
		al.add(2,7);


		
		System.out.println(al);
		System.out.println(d);
		
	}

}
