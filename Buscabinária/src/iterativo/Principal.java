package iterativo;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Principal {
public static void main(String[] args) {
	int []v = new int [8];
	int []aux = new int [v.length];
	int busca =0;
	Metodos m = new Metodos();
	m.carregaVetor(v); 
	System.out.println(Arrays.toString(v));
	m.mergeSort(v, aux, 0, v.length-1);
	System.out.println(Arrays.toString(v));
	busca = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para busca no vetor:"));
	System.out.println(m.buscaBinaria(v, busca));
}
}
