package edu.paulo.poo.lanchonete;

import edu.paulo.poo.lanchonete.area.cliente.Cliente;
import edu.paulo.poo.lanchonete.atendimento.Atendente;
import edu.paulo.poo.lanchonete.atendimento.cozinha.Almoxarifado;
import edu.paulo.poo.lanchonete.atendimento.cozinha.Cozinheiro;


public class Estabelecimento {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
    
        cliente.fazerPedido();
        cliente.avaliarPedido(1);
    
        Atendente atendente = new Atendente();
        atendente.atenderCliente();
        atendente.levarConta();
        atendente.levarPedido();


        Almoxarifado almoxarifado = new Almoxarifado();
        almoxarifado.levarIngredientes();
        almoxarifado.trazIngredientes();

        Cozinheiro cozinheiro = new Cozinheiro();

        cozinheiro.prepararPedido();
        cozinheiro.trocarGas(almoxarifado);
        cozinheiro.pedidosFeitos();
    }

}
