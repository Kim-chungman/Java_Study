package Lecture5;
/*
 * 복사본 수정은 그때만 수정됨.
 */
public class ArrayMain03 {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50};
		
		// a배열의 모든 요소에 100을 더하자!
		// 1.5버전은 사용하지 말자!!!
		for(int num : a) {
			num = num + 100;					// 복사본을 수정한다고 원본이 바뀌지 않음.
			System.out.println(num);			// 출력값 : 110, 120, 130, 140, 150
		}
		
		/*
		// a배열의 모든 요소에 100을 더하자
		for(int i = 0; i < a.length; i++) {
			a[i] = a[i] + 100;
		}
		*/
		
		// for-each문
		for(int num : a) {
			System.out.println(num);			// 출력값 : 10, 20, 30, 40, 50
		}
		
		
		/*
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		*/

	}

}
