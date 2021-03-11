package Lecture4;

import java.util.Arrays;

/*
 * 1, 2, 3, 4, 5를 가지는 배열 arr를 생성
 * arr배열의 원소 출력
 * 1. 인덱스를 이용한 출력
 * 2. 1.5버전의 for문을 이용한 출력
 * 3. java.util.Arrays.toString() 메소드를 이용한 출력
 */
public class ArrayMain03 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		System.out.println("<방식 1>");
		for(int i=0; i<arr.length; i++) {
			arr[i] = 2*i+1;
			System.out.print("arr["+i+"] : ");
			System.out.println(arr[i]);
		}
		
		
		// int[] arr = {1, 3, 5, 7, 9};							//선언과 동시에 초기화하는 경우에만 가능
		// int[] arr = new int[] {1, 3, 5, 7, 9};
		
		arr = new int[] {10, 20, 30, 40, 50, 60, 70};
		
		System.out.println("<방식 2 - for each>");
		for(int num : arr) {
			System.out.print(num + "   ");
		}
		System.out.println();
		
		System.out.println("<방식 3>");
		System.out.println(Arrays.toString(arr));
	}

}
