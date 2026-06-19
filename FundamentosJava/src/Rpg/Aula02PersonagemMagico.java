package Rpg;

public class Aula02PersonagemMagico {

    public String nome;

    public String poder;

    public int nivelEnergia;

    public Aula03HabilidadeEspecial aula03HabilidadeEspecial;

    public void ataque(String atacar){
        if (nivelEnergia >= 10){
            System.out.println(nome + " " + "Realizou um ataque: " + atacar + "!");
            nivelEnergia -= 10;
        }
        else{
            System.out.println(nome + " " + "Está com o nivel de energia muito maixo para atacar.");
        }
    }

    public int aumentarEnergia(int energia){
        nivelEnergia = nivelEnergia + energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial(){
        if(!aula03HabilidadeEspecial.habilitada ){
            System.out.println("A habilidade especial nao está ativada.");
        }
        else if(nivelEnergia >= aula03HabilidadeEspecial.custoEnergia){
            System.out.println(nome + " " +"USOU SUA HABILIDADE ESPECIAL" + " " + aula03HabilidadeEspecial.nome + "!!");
            nivelEnergia -= aula03HabilidadeEspecial.custoEnergia;
        }
        else{
            System.out.println(nome + " " + "não tem energia suficiente para usar sua habilidade especial.");
        }
    }


}
