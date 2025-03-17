package edu.paulo.poo.lanchonete.area.cliente;

public class Cliente {

    private void chamarAtendente(){
        System.out.println("Chamando atendente");
    }

    public void fazerPedido(){
        chamarAtendente();
        System.out.println("Fazendo pedido");
    }

    public void avaliarPedido(int avaliacao){
        chamarAtendente();
        System.out.println("O cliente deu nota: " + avaliacao);
    }
}
