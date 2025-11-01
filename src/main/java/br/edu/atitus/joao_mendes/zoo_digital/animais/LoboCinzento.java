package br.edu.atitus.joao_mendes.zoo_digital.animais;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Predador;

public class LoboCinzento extends Mamifero implements Corredor, Predador{

    public LoboCinzento(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está uivando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo outros animais.");
    }

    @Override
    public void correr() {
        System.out.println(getNome()+" está correndo na floresta.");
    }
    
    @Override
    public void cacar() {
    	System.out.println(getNome()+" está caçando na lua cheia.");
    }
    
}

