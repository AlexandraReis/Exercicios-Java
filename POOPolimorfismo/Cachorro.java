package POOPolimorfismo;

public class Cachorro extends Animal{        //------------> clico

	@Override //--> sobrescrita de m�todo
	public void som() {	
		System.out.println("Som do cachorro: rau rau...");
		
	}

	@Override //--> sobrescrita de m�todo
	public void movimento() {	
		System.out.println("Cachorro correndo...");
		
	}

	

}


	

	

