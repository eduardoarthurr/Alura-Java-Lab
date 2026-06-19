package SintaxeBasica;
import java.util.Scanner;

public class Aula06EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("   DECIDINDO O PASSEIO      ");
        System.out.println("==========================");

        System.out.println("O dia está ensolarado ?: [1] = Sim [2] = Não ");
        int tempo = scanner.nextInt();
        System.out.println("É final de semana?: [1] = Sim [2] = Não ");
        int dia = scanner.nextInt();

        if (tempo == 1 && dia == 1) {
            System.out.println("Hoje vamos a praia !");
        }
        else {
            System.out.println("Hoje vamos ao parque !");
        }

        scanner.close();
    }
}
