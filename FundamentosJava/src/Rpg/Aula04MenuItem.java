package Rpg;

import java.util.Scanner;


public class Aula04MenuItem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha;
        Aula05ItemMagico item = new Aula05ItemMagico();

        do{
            System.out.println("Escolha uma opção:");
            System.out.println("[ 1 ] - Cadastrar Item");
            System.out.println("[ 2 ] - Exibir Item cadastrado");
            System.out.println("[ 0 ] - Sair ");

            escolha = scanner.nextInt();

            switch(escolha){
                case 1:{


                    System.out.println("Qual o nome do seu item ");
                    String nomeItem = scanner.nextLine();

                    System.out.println("Qual a descrição do seu item ");
                    String descricaoItem = scanner.nextLine();

                    System.out.println("O seu item é raro? (true/false)");
                    boolean raridadeItem = scanner.nextBoolean();

                    System.out.println("Qual o nível de poder do seu item");
                    int poderItem = scanner.nextInt();


                    item.nome = nomeItem;
                    item.descricao = descricaoItem;
                    item.raridade = raridadeItem;
                    item.poder = poderItem;

                    break;
                }
                case 2:{


                    System.out.println("NOME: "+ item.nome + " " + "DESCRIÇÃO: " + item.descricao + " " + "RARIDADE : " + item.raridade+ " " +"PODER: " + item.poder);

                    break;
                }
                case 0:{

                    System.out.println("Encerrando Sistema...");

                    break;
                }
                default:{
                    System.out.println("Digite apenas uma das opções citadas.");
                }
            }


        }while(escolha !=0);

    }
}
