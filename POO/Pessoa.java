package POO;

public class Pessoa { //super classe

	private String nome;
	private String endere�o;  // atributos da minha pessoa
	private String cpf;
	private int telefone;
	private int idade;

 public Pessoa(String nome,String endere�o,String cpf,int telefone, int idade) { //construtor // construtor
	 
	 this.nome = nome;
	 this.endere�o = endere�o;
	 this.cpf = cpf;
	 this.telefone = telefone;
	 this.idade = idade;
	 
 }
 	public void validarCpf() {
 		
 		if(getCpf().lenght()!=11) {
 			
 		}
 		System.out.println("\n---CPF Inv�lido!!!");
 		}else {
 		System.out.println("\---nCPF V�lido!!!");
 		
 		}
 	
 }
 		public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void getValidarCpf() {
		return validarCpf;
	}
	public void setValidarCpf(void validarCpf) {
		this.validarCpf = validarCpf;
	}
 		
 		
 		
 		
 	