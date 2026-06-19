package SintaxeBasica;

public class Aula03Operadores {
    public static void main(String[] args) {

        //Operadores Aitimeticos (+ , - , /, * , %, ++ , -- )

        int x = 10;
        int y = 5;

        int soma = x + y;
        int subtracao = x- y;
        int multiplicacao = x * y;
        int divisao = x / 5;
        int modulo = x % y;

        System.out.println("SOMA " + soma);
        System.out.println("SUBTRAÇÃO " + subtracao);
        System.out.println("MULTIPLICAÇÃO " + multiplicacao);
        System.out.println("DIVISÃO " + divisao);
        System.out.println("MÓDULO " + modulo);

        System.out.println("---------------------------------------------");
        System.out.println("          INCREMENTO E DECREMENTO          ");
        x++;
        System.out.println(x);
        y--;
        System.out.println(y);




    }
}
