package br.inatel.pcmania.cliente;

import br.inatel.pcmania.computador.Computador;

public class Cliente {
    private String nome;
    private String cpf;

    private Computador[] computadores = new Computador[100];

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addComputador(Computador computador,int i){
        computadores[i] = computador;
    }

    public float calculaTotalCompra(int n){
        int valorTotal = 0;
        for (int i = 0; i < n; i++) {
            valorTotal += computadores[i].getPreco();
        }
        return valorTotal;
    };

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Computador[] getComputadores(){
        return computadores;
    }
}
