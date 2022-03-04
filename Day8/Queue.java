package collections;
//import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> lines =new PriorityQueue<String>();
		lines.add("suma");
		lines.add("suman");
		lines.add("sumanth");
		lines.add("sum");
		
		
		
		Iterator itr=lines.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
