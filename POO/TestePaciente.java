package POO;

public class TestePaciente {

	public static void main(String[] args) {
		
		Paciente pessoa1 = new Paciente("Elza Borges Sakakibara",81,"Problema Neurológico","Feminino");
		Paciente pessoa2 = new Paciente("Rogério dos Reis",43,"Labirintite","Masculino");
		
		System.out.println("\n*****Hospital da Luz*****");
		pessoa1.imprimirInfo();
		System.out.println("\n");
		pessoa2.imprimirInfo();
		
		

	}

}
