package leetCode;

public class Search2DMatrix2_leetcode240 {
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		
		int row = 0;
		int col = n - 1;
		while(row < m && col >= 0) {
			if(target == matrix[row][col]) return true;
			else if(matrix[row][col] > target) col -= 1;
			else row += 1;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int matrix[][] = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
		int target = 5;
		System.out.println(
		searchMatrix(matrix, target));		
	}
}
