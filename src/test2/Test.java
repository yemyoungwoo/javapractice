// 0402 #2
// ArrayList vs Array  LinkedList
package test2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		Random random = new Random();
		
		//input
		for(int i=0; i<10; i++) {
			numbers.add(random.nextInt(100));
		}
		System.out.println("before sort "+numbers);
		
		Collections.sort(numbers);
		
		System.out.println("after sort "+numbers);
		for (int i=0; i<numbers.size(); i++)
			System.out.print(numbers.get(i)+" ");
	}
}
