package POO;

public class TesteAnimal {

	public static void main(String[] args) {
		
	         Cachorro doguinho = new Cachorro("Pingo",2,"Au-Au" );
	         Cavalo poney = new Cavalo("Branco",10,"relinchar");
	         Pregui�a dorminhoca = new Pregui�a("Alexandra",46, "ronca");

	         doguinho.imprimirInfo();
	         doguinho.correDoguinho();
	         doguinho.emitirLatido();
	         poney.imprimirInfo();
	         poney.correCavalinho();
	         poney.relinchoCavalinho();
	         dorminhoca.imprimirInfo();
	         dorminhoca.sobePreguicinha();
	         dorminhoca.roncodaPregui�a();

	    }

	
	}


