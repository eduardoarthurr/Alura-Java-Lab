package Rpg;

public class Aula03HabilidadeEspecial {

    public String nome;

    public int custoEnergia;

    public boolean habilitada;

    public Aula03HabilidadeEspecial(String nome, int custoEnergia, boolean habilitada){

        this.nome = nome;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilitada;

    }

    public void habilitarHabilidadeEspecial(){
        habilitada = true;
    }
}
