package POO;

public class Pregui�a extends Animal {
	
	private String subirArvore;
	
	public Pregui�a(String nome, int idade, String subirArvore) {
		super(nome,idade);
		
		this.subirArvore = subirArvore;
	}

	public String getSubirArvore() {
		return subirArvore;
	}
	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	public void imprimirInfo() {
		System.out.println("\nNome da Pregui�a: "+getNome()+"\nIdade: "+getIdade()+"\nO que ela faz?"+subirArvore);
	}
	public void roncodaPregui�a() {
		System.out.println("\nzzzzzzzzzzzzzz");
	}
	public void sobePreguicinha() {
		System.out.println("\nSubindo a arvore para dormir!!!");
	}
}
