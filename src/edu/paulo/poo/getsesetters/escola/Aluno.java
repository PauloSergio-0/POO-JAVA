package edu.paulo.poo.getsesetters.escola;

public class Aluno {

    //deve ser privado
    private String nome;
    private int idade;

    public void setNome(String newNome){
        this.nome = newNome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int newIdade){
        this.idade = newIdade;
    }

    public int getIdade(){
        return idade;
    }


    public void infoAluno(){
        System.out.println("Aluno\nNome: "+ getNome()+"\nIdade: "+ getIdade());
    }
}