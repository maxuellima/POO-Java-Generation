package Pacote1;

public class Paciente {

	
	//declaração dos atributos da classe
	
	private String NomePaciente;
	private String Endereço;
	private int NumeroSus;
	private int Idade;
	
	//Declaração do Método Construtor
	
	public Paciente(String NomePaciente, String Endereço, int NumeroSus, int Idade)
	{
		this.NomePaciente = NomePaciente;
		this.Endereço = Endereço;
		this.NumeroSus = NumeroSus;
		this.Idade = Idade;
	}

	public String getNomePaciente() {
		return NomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		NomePaciente = nomePaciente;
	}

	public String getEndereço() {
		return Endereço;
	}

	public void setEndereço(String endereço) {
		Endereço = endereço;
	}

	public int getNumeroSus() {
		return NumeroSus;
	}

	public void setNumeroSus(int numeroSus) {
		NumeroSus = numeroSus;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}
	
	public void Imprimir()
	{
		System.out.println("Nome do Paciente: " + NomePaciente + "\nEndereço: " + Endereço + "\nNumero do Cartão do SUS: " +
	NumeroSus + "\nIdade do(a) Paciente: " + Idade);
	}
}
