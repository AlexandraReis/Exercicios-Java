package POOPolimorfismo;

public class Cavalo extends Animal {

	@Override // --> sobrescrita de m�todo
	public void som() {
		System.out.println("Som do cavalo: rinnnnnnnnn...");

	}

	@Override // --> sobrescrita de m�todo
	public void movimento() {
		System.out.println("Cavalo correndo...");

	}

}
