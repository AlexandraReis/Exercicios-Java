package POO;

import java.text.NumberFormat;

public class Empregado {

	private String nome;
	private double salario;
	
	public Empregado(String n, double s) {
		
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) { //método que irá aumentar o salário
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoeda() {
			NumberFormat nf = NumberFormat.getCurrencyInstance(); //coloca a moeda do país
			nf.setMinimumFractionDigits(2); //indica quantas casas decimais eu tenho de´pois da vírgula
			String formatoMoeda = nf.format(salario); //formatar o salário
			return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println("\nNome: "+nome+"\t\tSalário:"+this.formatarMoeda());
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
