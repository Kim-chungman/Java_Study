package Review;

public class HomeWork4 {

	public static void main(String[] args) {
		
		
		int[] nums = new int[99];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i+2;
		}
		
		for(int i : nums) {
			System.out.print(i + "  ");
		}
		System.out.println();
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("num["+ i +"] : "+nums[i]);
			if(nums[i] != 0) {
				for(int j = i+1; j < nums.length; j++) {
					if(nums[j] % nums[i] == 0) {
						nums[j] = 0;
					}
				}
			}
			for(int n : nums) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
	}

}
