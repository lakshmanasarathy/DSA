package leetCode;

public class Search2DMatrix_leetcode74 {
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		int row = -1;
		int top = 0, bottom = m - 1;
		
		while(top <= bottom) {
			int mid = top + (bottom - top) / 2;
			if(target >= matrix[mid][0] && target <= matrix[mid][n - 1]) {
				row = mid;
				break;
			}
			else if(target > matrix[mid][0]) {
				top = mid + 1;
			}
			else {
				bottom = mid - 1;
			}
		}
		
		if(row == -1) return false;
		
		int left = 0, right = n - 1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(target == matrix[row][mid]) {
				return true;
			}
			else if(target > matrix[row][mid]) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
				
		return false;
	}	
}
