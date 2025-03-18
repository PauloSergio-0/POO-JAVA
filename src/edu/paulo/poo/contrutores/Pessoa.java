package edu.paulo.poo.contrutores;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private String cpf;
    private String apelido;


    public Pessoa(String newNome, int newIdade, double newAltura){// sem tipo
        this.nome = newNome;
        this.idade = newIdade;
        this.altura = newAltura;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }
    
    public void setCpf(String newCpf){
        this.cpf = newCpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setApelido(String newApelido){
        this.apelido = newApelido;
    }

    public String getApelido() {
        return apelido;
    }

}
