package POOPolimorfismo;

public class Preguica extends Animal {

	@Override // --> sobrescrita de m�todo
	public void som() {
		System.out.println("Som da pregui�a: ahhhhhhar...");

	}

	@Override // --> sobrescrita de m�todo
	public void movimento() {
		System.out.println("Pregui�a subindo na �rvore...");

	}

}



