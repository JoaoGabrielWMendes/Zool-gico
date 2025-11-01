package br.edu.atitus.joao_mendes.zoo_digital.app;
import br.edu.atitus.joao_mendes.zoo_digital.animais.*;
import br.edu.atitus.joao_mendes.zoo_digital.comportamentos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
        List<Animal> zooList = new ArrayList<>();
        
        String menu = """
                =======Sistema Biblioteca=======
                Escolha uma das opções abaixo
                1 - Cadastrar Animal
                2 - Listar Todos Animais
                3 - Listar Animais Corredores
                4 - Listar Animais Nadadores
                5 - Listar Animais Voadores
                6 - Listar Animais Predadores
                7 - Exibir Total de Animais
                0 - Sair
               """;
       int opcao;
       do {
           System.out.print("\033[H\033[2J");
           System.out.println(menu);
           System.out.print("Digite sua opção: ");
           opcao = sn.nextInt();
           sn.nextLine();
           switch (opcao) {
               case 1:
            	   CadastrarAnimal(sn,zooList);
                   break;
               case 2:
            	   ListarTodosAnimais(zooList);
                   System.out.println("Precione Enter para continuar...");
                   sn.nextLine();
                   break;
               case 3:
            	   ListarAnimaisCorredores(zooList);
                   System.out.println("Precione Enter para continuar...");
                   sn.nextLine();
                   break;
               case 4:
            	   ListarAnimaisNadadores(zooList);
                   System.out.println("Precione Enter para continuar...");
                   sn.nextLine();
                   break;
               case 5:
            	   ListarAnimaisVoadores(zooList);
                   System.out.println("Precione Enter para continuar...");
                   sn.nextLine();
                   break;
               case 6:
            	   ListarAnimaisPredadores(zooList);
                   System.out.println("Precione Enter para continuar...");
                   sn.nextLine();
                   break;
               case 7:
            	   TotalAnimais(zooList);
                   System.out.println("Precione Enter para continuar...");
                   sn.nextLine();
                   break;
               case 0:
                   System.out.println("Volte sempre!");
                   break;
               default:
                   System.out.println("Opção Inválida!");
                   break;
           }
       } while (opcao != 0);
	}
	
	private static void CadastrarAnimal(Scanner sn, List<Animal> zooList) {
		Animal novoAnimal=null;
	    System.out.println("Escolha o tipo de animal:");
	    System.out.println("1 - Arara Azul");
	    System.out.println("2 - Cachorro");
	    System.out.println("3 - Cagado");
	    System.out.println("4 - Camaleão");
	    System.out.println("5 - Coruja");
	    System.out.println("6 - Dragão de Komodo");
	    System.out.println("7 - Golfinho");
	    System.out.println("8 - Lagarto Dragão Voador");
	    System.out.println("9 - Lobo Cinzento");
	    System.out.println("10 - Lontra Europeia");
	    System.out.println("11 - Pato");
	    System.out.println("12 - Peixe Morcego");
	    System.out.println("13 - Pinguim");
	    System.out.println("14 - Salmão");
	    System.out.println("15 - Tetra Neon");
	    System.out.println("16 - Traíra");
	    
	    System.out.print("Digite sua opção: ");
	    int tipo = sn.nextInt();
	    sn.nextLine();
	    System.out.print("Digite o nome do animal: ");
	    String nome = sn.nextLine();
	    System.out.print("Digite a idade do animal: ");
	    int idade = sn.nextInt();
	    sn.nextLine();
	    
	    switch (tipo) {
        case 1: 
            System.out.print("Digite a cor das penas: ");
            String corPenasArara = sn.nextLine();
            novoAnimal = new AraraAzul(nome, idade, corPenasArara);
            break;
        case 2: 
            novoAnimal = new Cachorro(nome, idade);
            break;
        case 3: 
            novoAnimal = new Cagado(nome, idade);
            break;
        case 4: 
            novoAnimal = new Camaleao(nome, idade);
            break;
        case 5: 
            System.out.print("Digite a cor das penas: ");
            String corPenasCoruja = sn.nextLine();
            novoAnimal = new Coruja(nome, idade, corPenasCoruja);
            break;
        case 6: 
            novoAnimal = new DragaoDeKomodo(nome, idade);
            break;
        case 7: 
            novoAnimal = new Golfinho(nome, idade);
            break;
        case 8: 
            novoAnimal = new LagartoDragaoVoador(nome, idade);
            break;
        case 9: 
            novoAnimal = new LoboCinzento(nome, idade);
            break;
        case 10: 
            novoAnimal = new LontraEuropeia(nome, idade);
            break;
        case 11:
            System.out.print("Digite a cor das penas: ");
            String corPenasPato = sn.nextLine();
            novoAnimal = new Pato(nome, idade, corPenasPato);
            break;
        case 12: 
            novoAnimal = new PeixeMorcego(nome, idade);
            break;
        case 13: 
            System.out.print("Digite a cor das penas: ");
            String corPenasPinguim = sn.nextLine();
            novoAnimal = new Pinguim(nome, idade, corPenasPinguim);
            break;
        case 14: 
            novoAnimal = new Salmao(nome, idade);
            break;
        case 15: 
            novoAnimal = new TetraNeon(nome, idade);
            break;
        case 16: 
            novoAnimal = new Traira(nome, idade);
            break;
        default:
            System.out.println("Tipo inválido!");
            break;
    }
    
	    if (novoAnimal != null) {
        zooList.add(novoAnimal);
        System.out.println("Animal cadastrado com sucesso!");
    }
    	System.out.println("Pressione Enter para continuar...");
    	sn.nextLine(); // espera o usuário apertar Enter
}
		
	
	
	private static void ListarTodosAnimais(List<Animal> animais) {
           System.out.println("Animais: ");
           for (Animal animal : animais) {
        	   imprimirDados(animal);
   }       
}
	
    private static void ListarAnimaisCorredores(List<Animal> animais) {
        System.out.println("Corredores: ");
        for (Animal animal : animais) {
            if(animal instanceof Corredor) {
            	imprimirDados(animal);
            	imprimirCorrida((Corredor)animal);
            }
        }
}
    
    private static void ListarAnimaisNadadores(List<Animal> animais) {
        System.out.println("Nadadores: ");
        for (Animal animal : animais) {
            if(animal instanceof Nadador) {
            	imprimirDados(animal);
            	imprimirNado((Nadador)animal);
            }
        }
}
    
    private static void ListarAnimaisVoadores(List<Animal> animais) {
        System.out.println("Voadores: ");
        for (Animal animal : animais) {
            if(animal instanceof Voador) {
            	imprimirDados(animal);
            	imprimirVoo((Voador)animal);
            }
        }
}
    
    private static void ListarAnimaisPredadores(List<Animal> animais) {
        System.out.println("Predadores: ");
        for (Animal animal : animais) {
            if(animal instanceof Predador) {
            	imprimirDados(animal);
            	imprimirCaca((Predador)animal);
            }
        }
}
        
    private static void TotalAnimais(List<Animal> animais) {
    	System.out.println("Total de animais: "+Animal.getContador());
    }
    
    private static void imprimirDados(Animal animal) {
 	   	System.out.println("Nome: "+ animal.getNome()+" Idade: "+animal.getIdade()+" ano(s) "+" Espécie: "+animal.getEspecie());
 	   	animal.comer();
 	   	animal.emitirSom();
    }
    
    private static void imprimirVoo(Voador animalVoador){
        animalVoador.voar();
    }

    private static void imprimirNado(Nadador animalNadador) {
        animalNadador.nadar();
    }

    private static void imprimirCorrida(Corredor animalCorredor){
        animalCorredor.correr();
    }
    
    private static void imprimirCaca(Predador animalPredador) {
    	animalPredador.cacar();
    }
}
