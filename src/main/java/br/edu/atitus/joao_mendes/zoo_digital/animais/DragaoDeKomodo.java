package br.edu.atitus.joao_mendes.zoo_digital.animais;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Predador;

public class DragaoDeKomodo extends Repteis implements Corredor, Predador{
	
    public DragaoDeKomodo(String nome, int idade) {
    	super(nome, idade, 1);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está bufando fortemente.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo porcos e carniças.");
    }
    
    @Override
    public void correr() {
    	System.out.println(getNome()+ " está se esgueirando pela Ilha de Komodo.");
    }
    
    @Override
    public void cacar() {
    	System.out.println(getNome()+ " está atrás da sua próxima vítima.");
    }
    
}