package edu.paulo.poo.enumsjava;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getNome() +" - "+ e.getSigla());
        }


        EstadoBrasileiro meu_estado = EstadoBrasileiro.SERGIPE;

        System.out.println(meu_estado.getNome() + " - " + meu_estado.getSigla()+" Codigo: " + meu_estado.getCodIbge());
    }
}
