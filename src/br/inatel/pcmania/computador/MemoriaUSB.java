package br.inatel.pcmania.computador;

public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void getInfo(){
        System.out.print(this.nome + " ");
        System.out.println(this.capacidade + "Gb");
    }
}
