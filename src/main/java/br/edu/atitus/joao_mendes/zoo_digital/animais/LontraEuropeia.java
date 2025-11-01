package br.edu.atitus.joao_mendes.zoo_digital.animais;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Predador;

public class LontraEuropeia extends Mamifero implements Corredor, Nadador, Predador{

    public LontraEuropeia(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está assobiando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes.");
    }

    @Override
    public void correr() {
        System.out.println(getNome()+" está correndo a beira da água.");
    }
    
    @Override
    public void nadar() {
    	System.out.println(getNome()+" está nadando atrás de alimento.");
    }
    
    @Override
    public void cacar() {
    	System.out.println(getNome()+" está caçando na lua cheia.");
    }
    
}

