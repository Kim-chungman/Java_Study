package Lecture9;

public class StringMain05 {

	public static void main(String[] args) {
/*
		long start = System.currentTimeMillis();
		int sum = 0;
		for(int i = 0; i < 100000; i++) {
			sum += i;
		}
*/
		/*
		for(int i = 0; i < 100000; i++) {
			str += i;
			str = str.concat(String.valueOf(i));
		}
		*/
/*
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end-start) / 1000.0 + "초");
	
*/
//		------------------------------------------------------------
		// StringBuffer
		long start = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end-start) / 1000.0 + "초");
	}

}
