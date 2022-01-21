import java.util.*;

public class Assignpro1 {

	public static void main(String[] args) {
		System.out.println("Welcome to code java collection, At HotWax");
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Rahul");
		names.add("Neema");
		names.add("Priyansh");
		names.add("HotWax");
		names.add("HotWax");
		names.add("HotWax Systems");
		
		//get
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		//remove
		names.remove("Neema");
		System.out.println(names);
		
		//size
		System.out.println("SIZE ="+names.size());
		
		//check item is there is or not
		System.out.println(names.contains("Priyansh"));
		
		//check for empty
		System.out.println(names.isEmpty());
		
		//setting value
		names.set(1, "Sunil");
	
		System.out.println(names);
		
		//remove all the elements
		//names.clear();
		//System.out.print(names);
		
		//Vector
		Vector<String> vector = new Vector<>();
		vector.addAll(names);
		System.out.println("VECTOR "+vector);
		
		System.out.println("----------------------------------");
		
		HashSet<Double> nms = new HashSet<>();
		nms.add(7.50);
		nms.add(4.35);
		nms.add(13.3);
		nms.add(40.00);
		nms.add(123.35);
		nms.add(24.345);
		nms.add(99.7);
		nms.add(9.7);
		System.out.println(nms);
		
		//sorted
		TreeSet<Double> tset = new TreeSet();
		tset.addAll(nms);
		System.out.println(nms);
	}

}
