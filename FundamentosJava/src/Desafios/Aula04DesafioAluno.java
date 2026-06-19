package Desafios;

import java.util.Scanner;
public class Aula04DesafioAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("      CALCULATOR MEDIA FIAP        ");
        System.out.println("==================================");

        System.out.println("Nome do aluno: ");
        String nome = scanner.next();

        System.out.println("Digite as notas do primeiro semestre");
        System.out.println("Python: ");
        double PySemestre1 = scanner.nextDouble();
        System.out.println("JavaScript: ");
        double jsSemestre1 = scanner.nextDouble();

        double mediaSemestre1 = (PySemestre1 + jsSemestre1) / 2;

        System.out.println("Digite as notas do segundo semestre");
        System.out.println("IA: ");
        double IaSemestre2 = scanner.nextDouble();
        System.out.println("Java: ");
        double jaSemestre2 = scanner.nextDouble();

        double mediaSemestre2 = (IaSemestre2 + jaSemestre2) / 2;

        double mediaAno = (mediaSemestre1 + mediaSemestre2) / 2;

        System.out.println( nome + " Sua média é :");
        System.out.println("Media 1 semestre: " + mediaSemestre1);
        System.out.println("Media 2 semestre: " + mediaSemestre2);
        System.out.println("Media ano: " + mediaAno);
    }
}
