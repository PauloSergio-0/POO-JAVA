package edu.paulo.poo.lanchonete.atendimento.cozinha;



public class Cozinheiro {

    private void balcao(){
        System.out.println("Indo até o balcão");
    }

    public void prepararPedido(){
        balcao();
        System.out.println("Preparando pedido do cliente");
    }

    public void pedidosFeitos(){
        balcao();
        System.out.println("os pedidos estão prontos");
    }
    
    public void trocarGas(Almoxarifado func){
        func.trocarGas("Willian");
    }
}
