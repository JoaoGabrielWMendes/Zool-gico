package br.edu.atitus.joao_mendes.zoo_digital.animais;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Voador;


public class LagartoDragaoVoador extends Repteis implements  Voador{
	
    public LagartoDragaoVoador(String nome, int idade) {
    	super(nome, idade, 2);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo sons inaudíveis para o ser humano");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo insetos.");
    }
    
    @Override
    public void voar() {
    	System.out.println(getNome()+" está planando entre as árvores");
    }
}