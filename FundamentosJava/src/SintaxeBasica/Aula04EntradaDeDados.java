package SintaxeBasica;

import java.util.Scanner;

public class Aula04EntradaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nameProduct = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        double value = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        int amount = scanner.nextInt();

        System.out.println("Produto: " + nameProduct + " Preço: " + value + "R$ " + " Quantidade: " + amount);

        scanner.close();


    }
}
