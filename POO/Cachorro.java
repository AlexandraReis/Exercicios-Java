package POO;

public class Cachorro extends Animal{
	
	public AnimalCachorro(String nome,int idade) {
		super (nome,idade);
		
	}
		
	@Override
	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	@0verride
	public void imprimirInfo(){
		System.out.println("\nNome do cachorro: "+getNome()+"\nIdade: "+getIdade()+"\nO que ele faz?: "+deveCorrer);
	}
	   public void emitirLatido() {
           System.out.println("\n Au-Au-Au");
}
           public void correDoguinho() {
           System.out.println("\n Cachorro correndo atrás do motoqueiro");
}          
}


	

