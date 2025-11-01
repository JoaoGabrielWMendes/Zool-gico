package br.edu.atitus.joao_mendes.zoo_digital.animais;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Voador;

public class AraraAzul extends Ave implements Voador{

    public AraraAzul(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está soltando gritos estridentes.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo frutas e nozes.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando pelo Brasil.");
    }
    
}
