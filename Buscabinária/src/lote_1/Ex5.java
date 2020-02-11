package lote_1;

import javax.swing.JOptionPane;

public class Ex5 {
	public static void main(String[] args) {
		int mt[][] = new int[4][4];
		mt = carregaMT(mt);
		show(mt);
	}

	private static void show(int[][] mt) {

		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt.length; j++) {
				System.out.print(" " + mt[i][j] + " ");

			}
			System.out.println();
		}

	}

	private static int[][] carregaMT(int[][] mt) {

		for (int i = 0; i < mt.length; i++) {

			for (int j = 0; j < mt.length; j++) {
				if (i == j) {
					mt[i][j] = (int) ((Math.random() * (1000 - (-1))) - 1);
				} else {
					mt[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para matriz:"));

				}
			}

		}
		return mt;
	}
}
