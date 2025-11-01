package br.edu.atitus.joao_mendes.zoo_digital.animais;

public abstract class Repteis extends Animal {
	
	int periodoTrocaPeleMeses;

	public Repteis(String nome, int idade, int periodoTrocaPeleMeses) {
		super(nome, "Reptil", idade);
		this.periodoTrocaPeleMeses=periodoTrocaPeleMeses;
	}

	public int getperiodoTrocaPeleMeses() {
		return periodoTrocaPeleMeses;
	}

	public void periodoTrocaPeleMeses(int periodoTrocaPeleMeses) {
		this.periodoTrocaPeleMeses = periodoTrocaPeleMeses;
	}
	
	public void regularTemperatura() {
		System.out.println(getNome()+"está regulando sua temperatura. ");
	}
	
}