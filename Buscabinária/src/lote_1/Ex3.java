package lote_1;

import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {
		int array[] = new int[10];
		array = carregaVetor(array);
		bubbleSort(array);
		show(array);
	}

	private static void show(int[] array) {

		System.out.println(Arrays.toString(array));

	}

	private static void bubbleSort(int[] array) {

		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < (array.length - x - 1); y++) {

				if (array[y] > array[y + 1]) {
					int aux = array[y];
					array[y] = array[y + 1];
					array[y + 1] = aux;

				}
			}

		}

	}

	private static int[] carregaVetor(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * (10 - (-10))) - 10);
			System.out.println(array[i]);
		}

		return array;
	}
}
