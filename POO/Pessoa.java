package POO;

public class Pessoa { //super classe

	private String nome;
	private String endereço;  // atributos da minha pessoa
	private String cpf;
	private int telefone;
	private int idade;

 public Pessoa(String nome,String endereço,String cpf,int telefone, int idade) { //construtor // construtor
	 
	 this.nome = nome;
	 this.endereço = endereço;
	 this.cpf = cpf;
	 this.telefone = telefone;
	 this.idade = idade;
	 
 }
 	public void validarCpf() {
 		
 		if(getCpf().lenght()!=11) {
 			
 		}
 		System.out.println("\n---CPF Inválido!!!");
 		}else {
 		System.out.println("\---nCPF Válido!!!");
 		
 		}
 	
 }
 		public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
 		
 		
 		
 		
 	