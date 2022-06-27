
public class 모스부호테스트 {

	public static void main(String[] args) {

		String str = "SOS";

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+ " : " + (int)str.charAt(i));
		}
		
		//	1차원 배열
		int[] arr1 = {
				1, 
				2, 
				3
		};
		
		//	2차원 배열
		int[][] arr2 = {
				{1,2,3},
				{1,2,3},
				{1,2,3}
		};
		
		//	3차원 배열
		int[][][] arr3 = {
				{
					{1,2,3}, 
					{1,2,3}, 
					{1,2,3}
				},
				{
					{1,2,3}, 
					{1,2,3}, 
					{1,2,3}
				},
				{
					{1,2,3}, 
					{1,2,3}, 
					{1,2,3}
				}
		};

	}

}
