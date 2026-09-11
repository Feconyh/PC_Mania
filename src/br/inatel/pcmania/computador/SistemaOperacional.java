package br.inatel.pcmania.computador;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public void getInfo(){
        System.out.print(this.nome + " ");
        System.out.println(this.tipo + " bits");
    }
}
