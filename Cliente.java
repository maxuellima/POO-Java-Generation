package Pacote1;

public class Cliente {
	
	//declaração dos atributos da classe
	private String NomedoCliente;
	private String Endereço;
	private int Cpf;
	
	
	//Declaração do método construtor
	
	public Cliente(String NomedoCliente, String Endereço, int Cpf)
	{
		this.NomedoCliente = NomedoCliente;
		this.Endereço = Endereço;
		this.Cpf = Cpf;
	}


	public String getNomedoCliente() {
		return NomedoCliente;
	}


	public void setNomedoCliente(String nomedoCliente) {
		NomedoCliente = nomedoCliente;
	}


	public String getEndereço() {
		return Endereço;
	}


	public void setEndereço(String endereço) {
		Endereço = endereço;
	}


	public int getCpf() {
		return Cpf;
	}


	public void setCpf(int cpf) {
		Cpf = cpf;
	}
	
	public void Imprimir()
	{
		System.out.println("\nNome do Cliente: " + NomedoCliente + ", Endereço: " + Endereço + ", CPF: " + Cpf);
	}
	

}
