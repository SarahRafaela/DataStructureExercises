package lote_1;

public class Ex2 {
	public static void main(String[] args) {
		int array_1[] = new int[5];
		int array_2[] = new int[array_1.length];

		array_1 = carregaVetor(array_1);
		array_2 = carregaVetorAuxiliar(array_1, array_2);
		showResults(array_1, array_2);
	}

	private static int[] carregaVetor(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
			// System.out.println(array[i]);
		}

		return array;
	}

	private static int[] carregaVetorAuxiliar(int[] array_1, int[] array_2) {
		for (int i = 0; i < array_1.length; i++) {
			array_2[i] = fatorial(array_1[i]);
			// System.out.println(array_2[i]);
		}
		return array_2;
	}

	private static int fatorial(int n) {

		int res = 1, i;
		for (i = 2; i <= n; i++)
			res *= i;
		return res;
	}

	private static void showResults(int[] array_1, int[] array_2) {

		for (int i = 0; i < array_1.length; i++) {

			System.out.println("O fatorial de " + array_1[i] + " é igual a :" + array_2[i]);

		}
	}
}
