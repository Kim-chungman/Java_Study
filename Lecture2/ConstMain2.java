package Lecture2;

public class ConstMain2 {

	public static void main(String[] args) {

		char ch = 'A';
		ch = 65;
		
		ch = '\u0041';
		
		// ch = '\uAC00';
		
		System.out.println("문자 : " + ch);
		
		System.out.println('A' + " " + 'B');
		
		System.out.printf("%c\n", ch);
		
		//int code = ch;
		//System.out.printf("%d\n", code); -> 많은 변수 생성은 비효율적
		System.out.println("문자 A의 숫자 : " + (int)ch);		// 형변환
		
		//int a = 65;
		//System.out.println(a);
		//System.out.println((double)a);
		//System.out.println((char)a);
		
		char a = 'A';
		byte b = 'A';
		System.out.println((char)b);
		System.out.println(a+b);
	}

}

/*
 * <자료형>
 * 자바는 유니코드 기반
 * 
 * <형변환>
 * byte < short < int < float < double
 *        char  < int < float < double
 *1) 묵시적 형변환
 *	 :범위가 넓은 데이터 형에 좁은 데이터 형을 대입하는 것.
 *	  ex) byte b = 100; int i = b;
 *2) 명시적 형변환
 *	 :범위가 좁은 데이터 형에 넓은 데이터 형을 대입하는 것.
 *	  형변환 연산자 사용 (타입)값
 *	  ex) int i = 100; byte b = i;(x), byte b = (byte)i;(o)         
 */
