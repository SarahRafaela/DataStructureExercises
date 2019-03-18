package recursivo;

import java.util.Arrays;

public class Metodos {
	
	public int [] ordenaVetor(int vet[]) {	
	Arrays.sort(vet);
	return vet;
		
	}
	
	public int buscaBinaria(int array[],int busca) {
		
		return buscaRecursiva(array, busca, 0 , array.length -1);
	}
	
	//chamadas recursivas
	public static int buscaRecursiva(int array[],int busca, int inicio, int fim) {
		
		int medio = (inicio + fim)/2;
		if (inicio> fim) return -1;
		if (array[medio]== busca) return medio;
		if (array[medio] < busca) return buscaRecursiva(array, busca, medio+1, fim);
		else return buscaRecursiva(array, busca, inicio, medio-1);
	}
	
}
