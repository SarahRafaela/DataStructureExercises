package recursivo;

import javax.swing.JOptionPane;

public class Principal {
public static void main(String[] args) {
	int []arr = {5,23,27,30,39,45,56,71,80,92};
	
	Metodos obj= new Metodos();
	
	obj.ordenaVetor(arr);
	int busca = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero para ser localizado:"));

	System.out.println("A busca esta na posi��o:" +	obj.buscaBinaria(arr, busca));
}
}
