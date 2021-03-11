package Lecture4;

public class ArrayMain02 {

	public static void main(String[] args) {
		
		int[] arr;
		
		arr = new int[] {1, 2, 3, 4, 5};										// arr[0] ~ arr[4]
		
		System.out.println("arr : "+arr + ", 원소 개수 : "+arr.length);			// 이 상태로 출력하면 "[I@182decdb" 주소값이 출력된다.
		System.out.println("첫번째 정수 : "+arr[0]);
		System.out.println("두번째 정수 : "+arr[1]);
		System.out.println("세번째 정수 : "+arr[2]);
		System.out.println("네번째 정수 : "+arr[3]);
		System.out.println("다섯번째 정수 : "+arr[4]);
		
		System.out.println("--------------------------------------");
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1 +"번째 정수 : " + arr[i]);
		}
		
		arr = new int[2];
		System.out.println("--------------------------------------");
		System.out.println("arr : "+arr + ", 원소 개수 : "+arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1 +"번째 정수 : " + arr[i]);
		}
	}

}
