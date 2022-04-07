package Pacote1;

public class Paciente {

	
	//declara��o dos atributos da classe
	
	private String NomePaciente;
	private String Endere�o;
	private int NumeroSus;
	private int Idade;
	
	//Declara��o do M�todo Construtor
	
	public Paciente(String NomePaciente, String Endere�o, int NumeroSus, int Idade)
	{
		this.NomePaciente = NomePaciente;
		this.Endere�o = Endere�o;
		this.NumeroSus = NumeroSus;
		this.Idade = Idade;
	}

	public String getNomePaciente() {
		return NomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		NomePaciente = nomePaciente;
	}

	public String getEndere�o() {
		return Endere�o;
	}

	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
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
		System.out.println("Nome do Paciente: " + NomePaciente + "\nEndere�o: " + Endere�o + "\nNumero do Cart�o do SUS: " +
	NumeroSus + "\nIdade do(a) Paciente: " + Idade);
	}
}
