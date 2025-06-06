// 0402 #1
// ArrayList vs Array  LinkedList
// 동적 연결리스트
// 관리 어려움 index
// 헤드 p 테일 위치관리 순차적인 
// 메모리 낭비 줄임
// 0에서 99 사이 값을/ 가지는 정수 10개/를 생성하고/ 출력하라/

package test1;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		Random random = new Random();

		// input
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		System.out.println("before sort " + Arrays.toString(numbers));

		Arrays.sort(numbers);

		System.out.println("after sort " + Arrays.toString(numbers));
	}
}
