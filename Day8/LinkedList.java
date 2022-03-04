package collections;
import java.util.Collections;
import java.util.LinkedList;

/* 
 * The important points about Java LinkedList are:
Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.
 * 
 */
public class LinkedListDemo {
	
public static void main(String[] args) {
		
		
		LinkedList<String> linklistdemo = new LinkedList<String>();
		
		linklistdemo.add("Mango");
		linklistdemo.add("Banana");
		linklistdemo.add("nuts");
		linklistdemo.add("Kiwi");
		linklistdemo.add("Orange");
		linklistdemo.add("apple");
		linklistdemo.add("apple");
		linklistdemo.add("apple");
		//linklistdemo.add(null);
	    Collections.sort(linklistdemo);
		System.out.println("sorted list: "+linklistdemo);
		
		//for (String fruit : linklistdemo) {
			//System.out.println("list of fruit  " + fruit);
		//}
		
		linklistdemo.addFirst("PAYAPA");
		linklistdemo.addLast("JACKFRUIT");
		
		System.out.println("After adding  elememnts.............");
		for (String fruit : linklistdemo) {
			System.out.println("list of fruit  " + fruit);
		}
		
}


}
