package SintaxeBasica;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        //Tipos primitivos
        // byte,short,int,long ( todos sao para numeros inteiros a diferença e o tamanho do numero que cada um pode armazenar)
        int age;
        age = 19;
        //float, double(armazena numeros bem maior que o float)

        float height = 1.80f;
        //char
        char gender = 'M';
        //boolean
        boolean special = false;
        //or
        boolean special_2 = true;

        //Tipos de referencia
        //* referencias sempre se iniciam com letras maiusculas, é uma convenção para diferenciar classes dos tipos primitivos que sempre se iniciam com letra minusculas.
        //* sempre que for um conjunto de caraceteres deve ser declarado com aspas duplas e nao com aspas simples como o tipo primitivo char
        //string
        String Name = "Eduardo";

        System.out.println("Qual é seu nome:" + Name);
        System.out.println("Qual sua idade:" + age);
        System.out.println("Qual sua altura:" + height);
        System.out.println("Qual é seu genero:" + gender);
        System.out.println("Você é estudante:" + special_2);


    }


}
