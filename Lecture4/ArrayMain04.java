package Lecture4;

import java.util.Arrays;

/*
 *		String s  = new String("폴리텍"); 
 *		String s2 = new String("데이터분석");
 *		String s3 = new String("자바");  
 */

public class ArrayMain04 {

	public static void main(String[] args) {
		
	//	String [] strArr = {"폴리텍", "데이터분석", "자바"};
		String [] strArr = {new String ("폴리텍"), new String ("데이터분석"), new String ("자바")};
		
		System.out.println("strArr 배열의 크기 : "+ strArr.length);
		
		System.out.println("<방식 1>");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(i+1 +"번재 문자열 : "+ strArr[i]);
		}
		
		System.out.println("<방식 2>");
		for(String str : strArr) {
			System.out.println(str);
		}
		
		System.out.println("<방식 3>");
		System.out.println(Arrays.toString(strArr));
		
		
	//	System.out.println("첫번재 문자열 : "+ strArr[0]);
	//	System.out.println("두번재 문자열 : "+ strArr[1]);
	//	System.out.println("세번재 문자열 : "+ strArr[2]);

	}

}
