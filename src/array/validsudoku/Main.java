package array.validsudoku;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		char[][] board = {
				{ '8', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' },
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' },
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' },
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' }
		};

		Solution s = new Solution();
		boolean isValid = s.isValidSudoku(board);
		System.out.println(isValid);

	}
}

class Solution {
	public boolean isValidSudoku(char[][] board) {

		Set<Character>[] rows = new HashSet[9];
		Set<Character>[] cols = new HashSet[9];
		Set<Character>[] boxes = new HashSet[9];

		for (int i = 0; i < 9; i++) {
			rows[i] = new HashSet<>();
			cols[i] = new HashSet<>();
			boxes[i] = new HashSet<>();
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				char num = board[i][j];

				if (num == '.') {
					continue;
				}

				// check row
				if (rows[i].contains(num)) {
					return false;
				}
				rows[i].add(num);

				// check col
				if (cols[j].contains(num)) {
					return false;
				}
				cols[j].add(num);

				// check box
				int boxIndex = i / 3 * 3 + j / 3;
				if (boxes[boxIndex].contains(num)) {
					return false;
				}
				boxes[boxIndex].add(num);
			}
		}

		return true;
	}
}