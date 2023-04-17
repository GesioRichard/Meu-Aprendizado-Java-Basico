package entities;

public class Aluguel {
	private String nomeEstudante;
	private String emailEstudante;
	
	public Aluguel(String nomeEstudante, String emailEstudante) {
		this.nomeEstudante = nomeEstudante;
		this.emailEstudante = emailEstudante;
	}

	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}

	public String getEmailEstudante() {
		return emailEstudante;
	}

	public void setEmailEstudante(String emailEstudante) {
		this.emailEstudante = emailEstudante;
	}

	public String toString() {
		return this.nomeEstudante + ", " + this.emailEstudante;
	}
	
	
	
}
