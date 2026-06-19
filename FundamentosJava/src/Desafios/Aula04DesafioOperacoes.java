package Desafios;

import java.util.Scanner;
public class Aula04DesafioOperacoes {
    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("     OPERAÇÕES ARITIMÉTICAS      ");
        System.out.println("================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double x = scanner.nextDouble();
        System.out.println("Digite um numero: ");
        double y = scanner.nextDouble();

        double soma = x + y;
        double subtracao = x - y;
        double multiplicacao = x * y;
        double divisao = x / y;
        double modulo = x % y;

        System.out.println("--------------------------");
        System.out.println("       RESULTADOS          ");
        System.out.println("SOMA: " + soma);
        System.out.println("SUBTRAÇÃO: " + subtracao);
        System.out.println("MULTIPLICAÇÃO: " + multiplicacao);
        System.out.println("DIVISÃO: " + divisao);
        System.out.println("MÓDULO: " + modulo);

        scanner.close();
    }

}
