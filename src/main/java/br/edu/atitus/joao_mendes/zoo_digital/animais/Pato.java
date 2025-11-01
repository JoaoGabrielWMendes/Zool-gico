package br.edu.atitus.joao_mendes.zoo_digital.animais;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.*;

public class Pato extends Ave implements Nadador, Corredor, Voador{

    public Pato(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo plantinhas do lago.");
    }

    @Override
    public void voar() {
        System.out.println(getNome()+" puxou voo.");
    }

    @Override
    public void correr() {
        System.out.println(getNome()+" está correndo pelo desengnçado.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome()+" está nadando no lago.");
    }
    
}
