package array.ratateimage;

public class Main {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Solution s = new Solution();
		s.rotate(matrix);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}
}

class Solution {
	public void rotate(int[][] matrix) {

		// replace
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				int tmp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = tmp;
			}
		}

		// reverse
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j < matrix[i].length - 1 - j) {
					int tmp = matrix[i][j];
					matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
					matrix[i][matrix[i].length - 1 - j] = tmp;
				}
			}
		}
	}
}