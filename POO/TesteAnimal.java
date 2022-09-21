package POO;

public class TesteAnimal {

	public static void main(String[] args) {
		
	         Cachorro doguinho = new Cachorro("Pingo",2,"Au-Au" );
	         Cavalo poney = new Cavalo("Branco",10,"relinchar");
	         Preguiça dorminhoca = new Preguiça("Alexandra",46, "ronca");

	         doguinho.imprimirInfo();
	         doguinho.correDoguinho();
	         doguinho.emitirLatido();
	         poney.imprimirInfo();
	         poney.correCavalinho();
	         poney.relinchoCavalinho();
	         dorminhoca.imprimirInfo();
	         dorminhoca.sobePreguicinha();
	         dorminhoca.roncodaPreguiça();

	    }

	
	}


