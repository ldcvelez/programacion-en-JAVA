
public class program {

	public static void main(String[] args) {
		
				String message = "";
				Integer[][] matrix = { { 1, 8, 3 }, { 4, 1, 12 }, { 7, 8, 2 },{ 7, 8, 0 } };

				if (MatrixHelper.searchZero(matrix)) {
					message = "¡The multiplication of values is zero!";
				} else {
					message = "¡The multiplication of values is not zero!";
				}
				
				System.out.println(message);
	}

}