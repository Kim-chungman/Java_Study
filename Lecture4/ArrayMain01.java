package Lecture4;

public class ArrayMain01 {

	public static void main(String[] args) {

		int [][] arr = {{1, 2, 3}, {2, 3, 4},{3, 4, 5}, {4, 5, 6}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("int ["+i+"]["+j+"] : "+arr[i][j]);
			}
		}
	}

}
