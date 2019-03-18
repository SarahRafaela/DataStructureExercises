package iterativo;

public class Metodos {
	public int [] carregaVetor(int vet[]) {
		for (int i =0; i< vet.length;i++ ) {
			vet[i]= (int) (Math.random()*10);
		}
		return vet;	
	}
	
	public void mergeSort(int vet[], int aux[], int ini, int fim  ) {
		if (ini<fim) {
			int meio = (ini + fim)/2;
			mergeSort(vet, aux, ini , meio);
			mergeSort (vet, aux, meio +1, fim);
			intercalar(vet, aux, ini , meio, fim);
		}
	}
	
	private static void intercalar(int[] vet, int[] aux, int ini, int meio, int fim) {
		for (int k = ini; k <= fim; k++) aux[k] = vet[k];
			
			int i = ini;
			int j = meio+1;
			
			for (int k = ini; k <= fim; k++) {
				if (i > meio) vet[k]= aux[j++];
				else if (j > fim) vet [k]= aux [i++];
				else if (aux[i] < aux[j]) vet[k] = aux[i++];
				else vet[k] = aux[j++];
		}
		
	}

	public String buscaBinaria(int vet[], int busca) {
		int f =0;
		int l = vet.length;
		boolean findData = false;
		int meio=0;
		while (f<=l && findData==false) {
			 meio =(f+l)/2;
			
			if (vet[meio]== busca) 
				findData = true;
		
			if (vet[meio]>busca) 
				l-=1;
			else f+=1;
			
		}
		
		if (findData==true) return Integer.toString(meio);
		else return "Não encontrado";
		
	}
}
