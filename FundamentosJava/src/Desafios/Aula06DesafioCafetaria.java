package Desafios;

import java.util.Scanner;

public class Aula06DesafioCafetaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDePedido = 0;
        double totalDaCompra = 0;
        String Resposta;

        do {
            System.out.println("========================");
            System.out.println("     CAFETARIA DEVDU    ");
            System.out.println("========================");

            System.out.println("Escolha o tamanho do seu café:");
            System.out.println("[ P ] - Pequeno 2,50 R$");
            System.out.println("[ M ] - Médio 3,00 R$");
            System.out.println("[ G ] - Grande 3,50 R$");
            String tamanho = scanner.nextLine();

            System.out.println("Escolha o tipo do seu café:");
            System.out.println("[ E ] - Expresso 1,50 R$");
            System.out.println("[ C ] - Capuccino 2,00 R$");
            System.out.println("[ L ] - Lattte 3,50 R$");
            String tipo = scanner.nextLine();

            double valorTamanho = 0;
            double valorTipo = 0;
            String NomeTipo = " ";

            switch (tamanho) {
                case "P":
                    valorTamanho = 2.50;
                    break;
                case "M":
                    valorTamanho = 3.00;
                    break;
                case "G":
                    valorTamanho = 3.50;
                    break;
                default:
                    System.out.println("Escolha um tamanho válido!");
            }

            switch (tipo) {
                case "E":
                    valorTipo = 1.50;
                    NomeTipo = "Expresso";
                    break;
                case "C":
                    valorTipo = 2.00;
                    NomeTipo = "Capuccino";
                    break;
                case "L":
                    valorTipo = 3.50;
                    NomeTipo = "Latte";
                    break;
                default:
                    System.out.println("Escolha um tipo válido!");
            }

            double totalPedido = valorTamanho + valorTipo;
            quantidadeDePedido++;
            System.out.println("Café tamanho: " + tamanho);
            System.out.println("Tipo: " + NomeTipo);
            System.out.println("Valor: " + totalPedido);
            System.out.println("Pedido N° " + quantidadeDePedido);
            totalDaCompra = totalDaCompra + totalPedido;

            System.out.println("Deseja finalizar o pedido?: [ C ] - Continuar [ F ] - Finalizar ");
            Resposta = scanner.nextLine();

        } while ("C".equals(Resposta));

        System.out.println("Pedido: " + quantidadeDePedido + " Cafés");
        System.out.println("Total da compra: " + totalDaCompra);
    }
}