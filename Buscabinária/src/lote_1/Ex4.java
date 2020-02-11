package lote_1;

public class Ex4 {
	public static void main(String[] args) {
		int mt[][] = new int[4][4];
		mt = carregaMT(mt);
		somaAteCem(mt);
		imparesTrintaACinquenta(mt);
		eDivisivelPorOito(mt);
		eDivisivelPorTres(mt);
		bubbleSort(mt);
		System.out.println( "O fatorial do maior número :"+ mt[3][3]+ " é: "+ fatorialDoMaiorNumero(mt[3][3]));

	}

	private static int fatorialDoMaiorNumero(int n) {

			int res = 1, i;
			for (i = 2; i <= n; i++)
				res *= i;
			return res;
		}
		
	

	private static void eDivisivelPorTres(int[][] mt) {
		int quantidadeTres = 0;
		for (int i = 0; i < mt.length; i++) {

			for (int j = 0; j < mt.length; j++) {

				if (mt[i][j] % 2 != 0 && mt[i][j] % 3 == 0) {
					quantidadeTres++;
				}
			}
		}
		System.out.println("A quantidade de números impares divisíveis por três é: " + quantidadeTres);

	}

	private static void eDivisivelPorOito(int[][] mt) {
		int quantidadeOito = 0;
		for (int i = 0; i < mt.length; i++) {

			for (int j = 0; j < mt.length; j++) {
				if (mt[i][j] % 8 == 0) {
					quantidadeOito++;
				}
			}
		}
		System.out.println("A quantidade de números divisíveis por oito é: " + quantidadeOito);
	}

	private static void imparesTrintaACinquenta(int[][] mt) {
		int quantidadeImpares = 0;

		for (int i = 0; i < mt.length; i++) {

			for (int j = 0; j < mt.length; j++) {
				if (mt[i][j] >= 30 && mt[i][j] <= 50) {
					if (mt[i][j] % 2 != 0) {
						quantidadeImpares++;
					}
				}
			}
		}
		System.out.println("A quantidade e impares >=30 e <=50 é : " + quantidadeImpares);
	}

	private static void somaAteCem(int[][] mt) {
		int sum = 0;

		for (int i = 0; i < mt.length; i++) {

			for (int j = 0; j < mt.length; j++) {
				if (mt[i][j] >= 1 && mt[i][j] <= 100) {
					sum += mt[i][j];
				}
			}

		}

		System.out.println("A soma dos valores da matriz dos números >= 1 e <=100 é : " + sum);

	}

	private static int[][] carregaMT(int[][] mt) {

		for (int i = 0; i < mt.length; i++) {

			for (int j = 0; j < mt.length; j++) {
				mt[i][j] = (int) ((Math.random() * (1000 - (-1))) - 1);
				System.out.println(mt[i][j]);
			}

		}
		return mt;
	}

	private static int fatorial(int n) {

		int res = 1, i;
		for (i = 2; i <= n; i++)
			res *= i;
		return res;
	}

	private static void bubbleSort(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[i][j] > array[i][j + 1]) {
					int aux = array[i][j];
					array[i][j] = array[i][j + 1];
					array[i][j + 1] = aux;
				}
			}
		}
	}

}
