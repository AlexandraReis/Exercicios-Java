package POO;

public class Paciente {
	
	private String nomePaciente;
	private int idade;
	private String diagnostico;
	private String sexo;
	
	public Paciente (String nomePaciente,int idade,String diagnostico,String sexo){
		
		this.nomePaciente = nomePaciente;
		this.idade = idade;
		this.diagnostico = diagnostico;
		this.sexo = sexo;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void imprimirInfo() {
		System.out.println("Nome do Paciente: "+nomePaciente);
		System.out.println("Idade: "+idade);
		System.out.println("Diagnostico: "+diagnostico);
		System.out.println("Sexo do Paciente: "+sexo);
		
	
	}
	
}
