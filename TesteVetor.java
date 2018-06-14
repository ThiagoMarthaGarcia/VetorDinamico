
public class TesteVetor {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("thiago");
		Aluno a2 = new Aluno("garcia");
		
		VetorDinamic vetor = new VetorDinamic();
		
		System.out.println(vetor.size());
		vetor.insereFinal(a1);
		System.out.println(vetor.size());
		vetor.insereFinal(a2);
		System.out.println(vetor.size());
		
		System.out.println("Vetor:");
		vetor.printVetor();
		
		Aluno a3 = new Aluno ("martha");
		
		vetor.insereFinal(a3);
		System.out.println("Insere no final:");
		vetor.printVetor();
		
		vetor.insere(1, a3);
		System.out.println("Insere em uma posição:");
		vetor.printVetor();
		
		vetor.insereInicio(a2);
		System.out.println("Insere no Inicio:");
		vetor.printVetor();
		
		vetor.remove(2);
		System.out.println("Remove em uma posição:");
		vetor.printVetor();
		
		vetor.removeIncio();
		System.out.println("Remove no Inicio:");
		vetor.printVetor();
		
		vetor.removeFinal();
		System.out.println("Remove no final:");
		vetor.printVetor();
		
		
	}
}
