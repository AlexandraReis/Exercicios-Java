package POO;

public class Empregado1 extends Pessoa { //sub classe da minha pessoa

	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado1(String nome, String endere?o, String cpf, 
			int telefone, int idade,int codigoSetor,float salarioBase,float imposto) {
		super(nome,endere?o,cpf,telefone,idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF: "+getCpf()+
				"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+"\nEndere?o: "+getEndere?o()+
				"\nC?digo do Setor: "+codigoSetor+"\nSal?rio Base: "+salarioBase+
				"\nValor em porcentagem(sem o %) de imposto a ser retido do sal?rio:"+imposto);
	}
 
		public void calcularSalario() {
			double salarioTotal = salarioBase - (salarioBase * (imposto/100));
			System.out.println("\nO sal?rio total a ser recebido pelo empregado -- "+getNome()+
			"? igual a " +salarioTotal);
		}
}
		
 