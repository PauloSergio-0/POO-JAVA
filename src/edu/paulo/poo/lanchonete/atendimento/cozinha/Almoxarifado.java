package edu.paulo.poo.lanchonete.atendimento.cozinha;

public class Almoxarifado {

    private void atualizaSistema(){
        System.out.println("Atualizando sistema de estoque");
    }

    void trocarGas(String funcionario){
        System.out.println(funcionario+ " está trocando gás");
    }

    public void levarIngredientes(){
        atualizaSistema();
        System.out.println("Levando ingredinetes");
    }

    public void trazIngredientes(){
        atualizaSistema();
        System.out.println("trazendo ingredinetes");
    }
}
