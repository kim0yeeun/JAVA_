package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		List<String> list3 = new Vector<String>();
		long startTime;
		long endTime;
		
		// ArrayList 성능
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));			
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList의 걸린 시간 : " +  (endTime-startTime) + "ns");
		
		
		// LinkedList 성능
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));			
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList의 걸린 시간 : " +  (endTime-startTime) + "ns");
		
		
		// VectorList 성능
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list3.add(0, String.valueOf(i));			
		}
		endTime = System.nanoTime();
		System.out.println("VectorList의 걸린 시간 : " +  (endTime-startTime) + "ns");
		
		
		// LinkedList > VectorList > ArrayList  빠르다.
		
		
		
	}

}
