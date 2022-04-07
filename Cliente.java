package Pacote1;

public class Cliente {
	
	//declara��o dos atributos da classe
	private String NomedoCliente;
	private String Endere�o;
	private int Cpf;
	
	
	//Declara��o do m�todo construtor
	
	public Cliente(String NomedoCliente, String Endere�o, int Cpf)
	{
		this.NomedoCliente = NomedoCliente;
		this.Endere�o = Endere�o;
		this.Cpf = Cpf;
	}


	public String getNomedoCliente() {
		return NomedoCliente;
	}


	public void setNomedoCliente(String nomedoCliente) {
		NomedoCliente = nomedoCliente;
	}


	public String getEndere�o() {
		return Endere�o;
	}


	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
	}


	public int getCpf() {
		return Cpf;
	}


	public void setCpf(int cpf) {
		Cpf = cpf;
	}
	
	public void Imprimir()
	{
		System.out.println("\nNome do Cliente: " + NomedoCliente + ", Endere�o: " + Endere�o + ", CPF: " + Cpf);
	}
	

}
