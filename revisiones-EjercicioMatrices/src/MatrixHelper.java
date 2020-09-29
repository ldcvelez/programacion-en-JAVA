import java.util.Arrays;


public final class MatrixHelper {

	private static final Integer zero = 0;

	public static boolean searchZero(Integer[][] matrix) {
		int i = 0;
		boolean isZero = false;
		
		while (i < matrix.length && !isZero) {
			isZero = Arrays.asList(matrix[i]).contains(zero); //.contains retorna true si encuentra el cero, sino false
			i++;
		}

		return isZero;
	}

}
