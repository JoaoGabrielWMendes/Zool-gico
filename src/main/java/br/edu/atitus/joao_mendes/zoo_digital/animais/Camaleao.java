package br.edu.atitus.joao_mendes.zoo_digital.animais;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Corredor;

public class Camaleao extends Repteis implements Corredor{
	
    public Camaleao(String nome, int idade) {
    	super(nome, idade, 1);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um  sibilo.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo insetos.");
    }
    
    @Override
    public void correr(){
    	System.out.println(getNome()+" está correndo dos passáros.");
    }
    
}