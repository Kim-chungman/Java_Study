package Lecture5;
/*
 * arraycopy 활용
 * arraycopy(복사하고 싶은 배열, 원본 복사 시작 위치, 복사할 배열, 복사 받을 시작 위치, 복사할 크기);
 */
import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30};
		int[] b = {5, 7, 8, 9, 20, 23};
		
		// int[] c = a + b; // c = {10, 20, 30, 5, 7, 8, 9, 20, 23}을 만들고 싶음.
		int[] c = new int[a.length + b.length];
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		System.out.println("c : " + Arrays.toString(c));
		
		/*
		int loc = 0;
		for(int i = 0; i < a.length; i++) {
			c[loc++] = a[i];
		}
		for(int i = 0; i < b.length; i++) {
			c[loc++] = b[i];
		}
		
		for(int i = 0; i < a.length + b.length; i++) {
			System.out.println("c[" + i + "] = " + c[i] + "입니다.");
		}
		 */
	}

}
