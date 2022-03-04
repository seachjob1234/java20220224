package chap99.codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution129507Test {

	@Test
	void test() {
		int [][] arr1 = {{1, 2}, {2, 3}};
		int [][] arr2 = {{3, 4}, {5, 6}};
		
		int[][] answer = solution(arr1, arr2);
		
		assertEquals(4, answer[0][0]);
		assertEquals(6, answer[0][1]);
		assertEquals(7, answer[1][0]);
		assertEquals(9, answer[1][1]);
		
		
	}
}
