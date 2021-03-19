package Lecture9;

import java.util.Arrays;

public class StringMain04 {

	public static void main(String[] args) {
		
		// 문자열 변환 substring
		String str = "Hello World";
		
		System.out.println("str : " + str);
		
		String subStr = str.substring(1, 5);
		System.out.println("str.substring(1, 5) : [" + subStr + "]");

		subStr = str.substring(6);
		System.out.println("str.substring(6) : [" + subStr + "]");

		// 문자열 결합 concat
		String str1 = "Hello";
		String str2 = "!!!!";
		
		str = str1 + str2;
		str = str1.concat(str2);
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("concat(str1, str2) : " + str);
		
		// 문자열 치환 replace
		str = "Hello World";
		System.out.println("replace() 전 : " + str);
		str = str.replace("ll", "rrrrrr");
		System.out.println("replace() 후 : " + str);
		
		// 공백문자 제거 trim
		str = "      hello      ";
		System.out.println("trim() 전 [" + str + "] 길이 : " + str.length());
		str = str.trim();
		System.out.println("trim() 후 [" + str + "] 길이 : " + str.length());
		
		// 소,대문자 변환 toLowerCase, toUpperCase
		str = "Hello World!!!";
		System.out.println("str : " + str);
		System.out.println("toLowerCase() : " + str.toLowerCase());
		System.out.println("toUpperCase() : " + str.toUpperCase());
		
		// 문자열 나누기 split
		str = "홍길동전:허균:조선시대";
		String[] strArr = str.split(":");
		System.out.println(Arrays.toString(strArr));
		
		String ip = "192.168.5.203";
		String[] ipArr = ip.split("\\.");			// .을 인식하기위해서는 \\ 두개 사용해줌
		System.out.println(Arrays.toString(ipArr));
		
		// 형의 변환 
		int num = 123;
//		String strNum = num + "";
		String strNum = String.valueOf(num);
		System.out.println(strNum + 10);
		System.out.println(String.valueOf(true)+false);
	}

}
