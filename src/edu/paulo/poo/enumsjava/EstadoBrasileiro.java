package edu.paulo.poo.enumsjava;

public enum EstadoBrasileiro {
    SERGIPE ("SE", "Sergipe",1),
    BAHIA ("BA", "Bahia",2),
    ALAGOAS ("AL", "Alagoas",23),
    SAO_PAULO ("SP", "São Paulo",3),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro",8);


    private String nome;
    private String sigla;
    private int codIbge;

    private EstadoBrasileiro(String sigla, String nome, int codIbge){
        this.nome = nome;
        this.sigla = sigla;
        this.codIbge = codIbge;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getCodIbge(){
        return codIbge;
    }
    
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
