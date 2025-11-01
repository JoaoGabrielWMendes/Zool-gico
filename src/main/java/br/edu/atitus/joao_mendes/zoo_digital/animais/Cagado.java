package br.edu.atitus.joao_mendes.zoo_digital.animais;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Nadador;

public class Cagado extends Repteis implements Nadador{
	
    public Cagado(String nome, int idade) {
    	super(nome, idade, 3);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está bufando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo suas folhas favoritas.");
    }
    
    @Override
    public void nadar() {
    	System.out.println(getNome()+ " está nadando no rio.");
    }
    
}