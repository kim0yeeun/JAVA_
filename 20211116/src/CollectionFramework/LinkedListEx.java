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
		
		// ArrayList ����
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));			
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList�� �ɸ� �ð� : " +  (endTime-startTime) + "ns");
		
		
		// LinkedList ����
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));			
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList�� �ɸ� �ð� : " +  (endTime-startTime) + "ns");
		
		
		// VectorList ����
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list3.add(0, String.valueOf(i));			
		}
		endTime = System.nanoTime();
		System.out.println("VectorList�� �ɸ� �ð� : " +  (endTime-startTime) + "ns");
		
		
		// LinkedList > VectorList > ArrayList  ������.
		
		
		
	}

}
