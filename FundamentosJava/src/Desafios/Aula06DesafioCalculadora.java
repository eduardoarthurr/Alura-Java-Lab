package Desafios;
import java.util.Scanner;
public class Aula06DesafioCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("      CALCULADORA       ");
        System.out.println("========================");

        System.out.println("Escolha tipo de operação desejada:");
        System.out.println("[ 1 ] - ADIÇÃO ");
        System.out.println("[ 2 ] - SUBTRAÇÃO ");
        System.out.println("[ 3 ] - MULTIPLICAÇÃO ");
        System.out.println("[ 4 ] - DIVISÃO ");
        int escolha = scanner.nextInt();

        System.out.println("Digite um numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite um numero: ");
        double num2 = scanner.nextDouble();


        switch (escolha){
            case 1:{
                double soma = num1 + num2;
                System.out.println("Resultado: " + soma);
                break;
            }
            case 2:{
                double subtracao = num1 - num2;
                System.out.println("Resultado: " + subtracao);
                break;
            }
            case 3:{
                double multiplicacao = num1 * num2;
                System.out.println("Resultado: " + multiplicacao);
                break;
            }
            case 4:{
                double divisao = num1 / num2;
                System.out.println("Resultado: " + divisao);
                break;
            }
            default:{
                System.out.println("Operação inválida ! escolha apenas uma das alternativas citadas.");
            }
        }

        scanner.close();




    }
}
