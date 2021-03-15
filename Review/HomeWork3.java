package Review;

public class HomeWork3 {

	public static void main(String[] args) {

		int [] prime = new int[30];
		int loc = 0;
		
		for(int num = 2; num <= 100; num++) {// 자기 앞 소수를 prime[]이 기억하게 함
			boolean flag = true;
			for(int i = 0; i < loc; i++) {
				if(num % prime[i] ==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				prime[loc++] = num;
			}
		}
		for(int i = 0; i < loc; i++) {
			System.out.println(prime[i] + "\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}

}
