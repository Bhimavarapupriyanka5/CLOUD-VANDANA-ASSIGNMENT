// Create an array with the values (1,2,3,4,5,6,7) and shuffle it.
package java2;
import java.util.ArrayList;
import java.util.Collections;
public class shuffle {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(7);
		Collections.shuffle(arrayList);
		Integer[] shuffledArray =arrayList.toArray(new Integer[arrayList.size()]);
		for(Integer value: shuffledArray) {
			System.out.print(value + "");
		}
		
		
		
		
	}
}
	
	    
