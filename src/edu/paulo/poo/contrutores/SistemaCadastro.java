package edu.paulo.poo.contrutores;



public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa cliente = new Pessoa("Paulo", 20, 1.86);

        System.out.println(cliente.getNome());
        System.out.println(cliente.getIdade());
        System.out.println(cliente.getAltura());

        cliente.setCpf("99998879594");
        cliente.setApelido("Shark");

        System.out.println(cliente.getCpf());
        System.out.println(cliente.getApelido());
    }
}
