package Desafios;
import java.util.Scanner;

public class Aula06DesafioSistemaDePremiacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("     PREMIAÇÃO DUTECH        ");
        System.out.println("============================");

        System.out.println("Valor gastado na nossa loja: ");
        double gastos = scanner.nextDouble();
        System.out.println("Quantas compras na nossa loja: ");
        int compras = scanner.nextInt();


        if (gastos > 2000 && compras > 10) {
            System.out.println("Parabéns você é um cliente VIP!! Use o cupom SouClienteVipPorra para ganhar 30% de desconto em qualquer compra.");
        } else if (gastos > 1000) {
            System.out.println("Parabéns você é um cliente Gold!! + 50 pontos acumule 75 pontos para conquistar o cupom 10% GoldSilver.");
        } else if (gastos > 500 || compras > 5) {
            System.out.println("Parabéns você é um cliente Silver!! +25 pontos acumule 75 pontos para conquistar o cupom 10% GoldSilver.");
        } else {
            System.out.println("Infelizmente você ainda é um clinte Bronze, efetue mais compras para ser premiado ! :(");
        }

    }
}
