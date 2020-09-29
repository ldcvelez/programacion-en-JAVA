import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class matricesTest {

	@Test
	void searchZeroWithValidSquareMatrixTest() {
		Integer[][] matrix = { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 2 } };

		assertTrue(MatrixHelper.searchZero(matrix));
	}
	
	@Test
	void searchZeroWithInvalidSquareMatrixTest() {
		Integer[][] matrix = { { 1, 2, 3 }, { 4, 1, 6 }, { 7, 8, 2 } };

		assertFalse(MatrixHelper.searchZero(matrix));
	}
	
	@Test
	void searchZeroWithValidMatrixTest() {
		Integer[][] matrix = { { 1, 2, 3, 2 }, { 4, 1, 6, 1 }, { 7, 8, 2, 0 } };

		assertTrue(MatrixHelper.searchZero(matrix));
	}
	
	@Test
	void searchZeroWithInvalidMatrixTest() {
		Integer[][] matrix = { { 1, 2, 3, 2 }, { 4, 1, 6, 4 }, { 7, 8, 2, 7 } };

		assertFalse(MatrixHelper.searchZero(matrix));
	}

	@Test
	void searchZeroWithEmptyMatrixTest() {
		Integer[][] matrix = {};

		assertFalse(MatrixHelper.searchZero(matrix));
	}
}
