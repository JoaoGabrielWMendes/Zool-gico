package br.edu.atitus.joao_mendes.zoo_digital.animais;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Predador;

public class Salmao extends Peixe implements Nadador, Predador{

    public Salmao(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo bolinhas na água.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes pequenos.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no Atlântico.");
    }
    
    @Override
    public void cacar() {
    	System.out.println(getNome()+ " está caçando animais menores que ele.");
    }
}
