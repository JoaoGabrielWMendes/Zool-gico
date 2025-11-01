package br.edu.atitus.joao_mendes.zoo_digital.animais;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.Nadador;

public class TetraNeon extends Peixe implements Nadador{

    public TetraNeon(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emtindo algum som.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo microcrustáceos.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando na Amazônia.");
    }
    
}
