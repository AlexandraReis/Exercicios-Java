package POO;

public class EmpregadoTeste {

	public static void main(String[] args) {
		
		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Leticia Santos",25000);
		lista[1] = new Empregado("Hellen Digramont",15000);
		lista[2] = new Empregado("Isabel Brolhato",45750);
		
		for(Empregado roda: lista) { //criei um laço de repetição para rodar a classe empregado 
			//com uma variável de loop chamada roda que vai imprimir as informações dos Empregados 
			//da primeira posição até a última posição da  minha lista.			
					
			roda.imprimir();// cada vez que rodar um empregado diferente
			
		}
			System.out.println("*********************************");
			for(Empregado roda:lista) {
				roda.aumentarSalario(20);
				roda.imprimir();
			}
	  }

}
