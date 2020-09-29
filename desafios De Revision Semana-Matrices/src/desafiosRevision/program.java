package desafiosRevision;

public class program {

	public static void main(String[] args) {

		// int matriz[][] = new int[3][3];
		// matriz[0][0] = 2;

		int[][] matriz = { { 1, 2, 3 }, { 4, 1, 6 }, { 7, 8, 2 } };
//		int [][] matriz3 = {{1,2,3},{4,5,6}};
//		int [][] matriz1 = {{2,4,8},{9,1,0},{7,0,0},{7,0,0}};
		int[][] matriz2 = { { 1, 2, 5 }, { 4, 1, 6 }, { 7, 0, 2 } };
		int[][] matrizEj = { { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 1, 0, 0 }, { 2, 0, 0 } };

		System.out.println("00. Comprobación de diagonal principal en matriz");
		mostrarMatriz(matriz, 3, 3);

		if (comprobacionDiagonalMatriz(matriz, 3, 3)) {
			System.out.println("Verdadero");
		} else {
			System.out.println("Falso");
		}

		System.out.println("------------------------------------------------------------------");
		System.out.println("01. Comprobación de multiplicación nula");
		mostrarMatriz(matriz2, 3, 3);

		if (comprobacionDeMultiplicacionNula(matriz2)) {
			System.out.println("La multiplicacion de los valores de la matriz NO dara cero.");
		} else {
			System.out.println("La multiplicacion de los valores de la matriz dara cero.");
		}

		System.out.println("------------------------------------------------------------------");
		System.out.println("02. Suma de ciertos elementos de una matriz");

//		int matrizResultado[][] = sumaDeCiertosElementosDeUnaMatriz(matriz1,3 ,4 );
//		mostrarMatriz(matriz1,3,3);
//		System.out.println("-----------------------------");
//		mostrarMatriz(matrizResultado,3,3);

		int matrizResultado[][] = sumaDeCiertosElementosDeUnaMatriz(matrizEj, 5, 3);
		mostrarMatriz(matrizEj, 5, 3);
		System.out.println("-----------------------------");
		mostrarMatriz(matrizResultado, 5, 3);

	}

	public static boolean comprobacionDiagonalMatriz(int matriz[][], int f, int c) {

		if (f != c)
			return false;

		int sum = 0;

		for (int x = 0; x < matriz.length; x++) {

			if (matriz[x][x] == sum || sum == 0)
				sum += matriz[x][x];
			else
				return false;
		}
		return true;
	}

	public static boolean comprobacionDeMultiplicacionNula(int matriz[][]) {

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				if (matriz[x][y] == 0)
					return false;
			}
		}

		return true;
	}

	public static int[][] sumaDeCiertosElementosDeUnaMatriz(int matriz[][], int f, int c) {

		int[][] mres = new int[f][c];

		for (int x = 0; x < f; x++) {
			for (int y = 0; y < c; y++)
				mres[x][y] = matriz[x][y] + ((x - 1 >= 0) ? matriz[x - 1][y] : 0)
						+ ((y - 1 >= 0) ? matriz[x][y - 1] : 0) + ((y + 1 < c) ? matriz[x][y + 1] : 0)
						+ ((x + 1 < f) ? matriz[x + 1][y] : 0);
		}
		return mres;
	}

	public static void mostrarMatriz(int matriz[][], int f, int c) {

		for (int x = 0; x < f; x++) {
			for (int y = 0; y < c; y++)
				System.out.print(" | " + matriz[x][y] + " | ");
			System.out.println("\n------------------------------");
		}
	}

}
