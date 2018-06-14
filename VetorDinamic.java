
public class VetorDinamic {

	private Aluno[] alunos;
	
	private int size;
	
	public VetorDinamic() {
		alunos = new Aluno[10];
		size =0;
	}
	
	public VetorDinamic(int tamanho) {
		if(tamanho <  10) {
			tamanho = 10;
			alunos = new Aluno[tamanho];
			size = 0;
		}
	}
	
	public void garanteCapacidade(int tamanhoNovo) {
		int tamanhoAntigo = alunos.length;
		if(tamanhoNovo > tamanhoAntigo) {
			alunos = copia(tamanhoNovo);
		}
	}
	
	public Aluno[] copia(int tamanho) {
		Aluno[] novo = new Aluno[tamanho];
		
		for(int i = 0 - 1; i <= tamanho; i++) {
			novo[i]=alunos[i];
		}
		return novo;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty(){
	    return size == 0;
	 }
	
	private void validaIndice(int indice){
	    if (indice >= size || indice < 0)
	      throw new IndexOutOfBoundsException();
	 }
	
	public Aluno get(int indice) {
		validaIndice(indice);
		return alunos[indice];
	}
	
	public boolean add(Aluno aluno)
	  {
	    garanteCapacidade(size + 1);
	    alunos[size++] = aluno;
	    return true;
	  }
	
	
	public void insere(int indice, Aluno aluno) {
		garanteCapacidade(indice);
		for(int i = size - 1; i >= indice; i-=1) {
			alunos[i+1]= alunos[i];
			
		}
		alunos[indice]= aluno;
		size++;
	}
	
	public int capacity() {
		return alunos.length;
	}
	
	public void insereFinal( Aluno aluno) {
		this.alunos[size] = aluno;
		size++;
	}
	
	public void insereInicio(Aluno aluno) {
		insere(0, aluno);
		
	}
	
	public void remove(int indice) {
		validaIndice(indice);
		for(int i = indice; i < this.size - 1; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		this.size--;
	}
	
	public void removeIncio() {
		remove(0);
		}
	
	
	public void removeFinal() {
		remove(this.size - 1);
	}
	
	public void printVetor() {
		
		for(int i = 0; i< size; i++) {
			System.out.print(this.alunos[i]);
			System.out.print(", ");
			
		}
		System.out.println();
		System.out.println();
	}
	
	
	
	
}
