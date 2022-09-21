package POOPolimorfismo;

public class Preguica extends Animal {

	@Override // --> sobrescrita de método
	public void som() {
		System.out.println("Som da preguiça: ahhhhhhar...");

	}

	@Override // --> sobrescrita de método
	public void movimento() {
		System.out.println("Preguiça subindo na árvore...");

	}

}



