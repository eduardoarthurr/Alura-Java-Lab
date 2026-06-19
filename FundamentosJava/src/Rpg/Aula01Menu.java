package Rpg;

import java.util.Scanner;

public class Aula01Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha;
        Aula02PersonagemMagico personagem = new Aula02PersonagemMagico();

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("[ 1 ] - Cadastrar personagem");
            System.out.println("[ 2 ] - Exibir personagem cadastrado");
            System.out.println("[ 3 ] - Atacar");
            System.out.println("[ 4 ] - Aumentar energia");
            System.out.println("[ 5 ] - Habilidade especial");
            System.out.println("[ 0 ] - Sair ");

            escolha = scanner.nextInt();

            switch (escolha){
                case 1:{

                    scanner.nextLine();

                    System.out.println("Digite o nome do seu personagem:");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o poder do seu personagem:");
                    String poder = scanner.nextLine();

                    System.out.println("Digite o nível de energia do seu personagem");
                    int energia = scanner.nextInt();

                    personagem.nome = nome;
                    personagem.poder = poder;
                    personagem.nivelEnergia = energia;

                    scanner.nextLine();

                    System.out.println("Digite o nome da sua habilidade:");
                    String nomeHabilidade = scanner.nextLine();

                    System.out.println("Digite o custo de energia da sua habilidade:");
                    int custoEnergia = scanner.nextInt();

                    System.out.println("Sua habilidade está habilitada?(true/false)");
                    boolean habilitada = scanner.nextBoolean();

                    Aula03HabilidadeEspecial habilidade = new Aula03HabilidadeEspecial(nomeHabilidade,custoEnergia,habilitada);

                    personagem.aula03HabilidadeEspecial = habilidade;

                    System.out.println("Digite o nome do seu ataque:");
                    String ataque = scanner.nextLine();


                    break;

                }
                case 2:{
                    System.out.println("=============== PERSONAGEM ================");
                    System.out.println("NOME: "+ personagem.nome + " " + "PODER: " + personagem.poder + " " + "NIVEL DE ENERGIA : " + personagem.nivelEnergia );
                    System.out.println("=============== HABILIDADE ================");
                    System.out.println("NOME: " + personagem.aula03HabilidadeEspecial.nome + " " + "CUSTO DE ENERGIA: " + personagem.aula03HabilidadeEspecial.custoEnergia + " " + "HABILITADO: " + personagem.aula03HabilidadeEspecial.habilitada );

                    break;

                }
                case 3:{
                    scanner.nextLine();

                    System.out.println("Digite o nome do seu ataque");
                    String ataque = scanner.nextLine();
                    personagem.ataque(ataque);

                    break;
                }
                case 4:{
                    System.out.println("Digite a quantidade de energia:");
                    int energia = scanner.nextInt();
                    int nivelAtual = personagem.aumentarEnergia(energia);
                    System.out.println("NIVEL ATUAL DE ENERGIA: " + nivelAtual);

                    break;
                }
                case 5:{
                    personagem.ativarHabilidadeEspecial();
                    System.out.println("NIVEL DE ENERGIA ATUAL: " + personagem.nivelEnergia);

                    break;
                }
                case 6:{
                    personagem.aula03HabilidadeEspecial.habilitarHabilidadeEspecial();
                }
                case 0:{
                    System.out.println("Finalizando programa...");

                    break;
                }
                default:{
                    System.out.println("Escolha uma das alternativas citadas.");
                }
            }
        }while(escolha != 0);











    }
}
