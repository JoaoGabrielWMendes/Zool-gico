package br.edu.atitus.joao_mendes.zoo_digital.animais;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Voador;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Corredor;


public class Coruja extends Ave implements Voador, Corredor{

    public Coruja(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está assobiando misteriosamente.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo outras aves e roedores.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando na escuridão.");
    }
    
    @Override
    public void correr() {
    	System.out.println(getNome()+ " está correndo para caçar um roedor.");
    }
    
}
