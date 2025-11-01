package br.edu.atitus.joao_mendes.zoo_digital.animais;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Predador;

public class Cachorro extends Mamifero implements Corredor, Nadador,Predador{

    public Cachorro(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sua ração.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome()+"está nadando cachorrinho.");
    }

    @Override
    public void correr() {
        System.out.println(getNome()+" está correndo no parque.");
    }
    
    @Override
    public void cacar() {
    	System.out.println(getNome()+" está caçando a meia que roubou.");
    }
    
}

