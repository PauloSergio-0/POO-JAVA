package edu.paulo.poo.lanchonete.atendimento;

public class Atendente {

    private void observar(){
        System.out.println("Procurando cliente");
    }

    public void atenderCliente(){
        observar();
        System.out.println("Atendendo Cliente");
    }

    public void levarPedido(){
        System.out.println("Levar pedido");
    }

    public void levarConta(){
        System.out.println("Levando a conta");
    }
}
