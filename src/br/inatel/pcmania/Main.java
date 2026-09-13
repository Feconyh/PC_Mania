package br.inatel.pcmania;

import br.inatel.pcmania.cliente.Cliente;
import br.inatel.pcmania.computador.Computador;
import br.inatel.pcmania.computador.MemoriaUSB;
import br.inatel.pcmania.utils.ProcessarPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op; // opção/operação do cliente
        float matricula = 1000;

        Computador p1 = new Computador("Apple", matricula, "Pentium Core i5", 2200, 8, 500, "macOS Sequoia", 64);
        Computador p2 = new Computador("Samsung", matricula+1, "Pentium Core i7", 3370, 16, 1000, "Windows 8", 64);
        Computador p3 = new Computador("Dell", matricula+2, "Pentium Core i7", 4500, 32, 2000, "Windows 10", 64);

        MemoriaUSB m1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB m2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB m3 = new MemoriaUSB("HD Externo", 1000);

        p1.addMemoriaUSB(m1);
        p2.addMemoriaUSB(m2);
        p3.addMemoriaUSB(m3);

        // Menu para visualizar as promoções antes da compra,
        System.out.println("Promoção 1");
        p1.mostraPCConfigs();
        System.out.println(); // quebra de linha

        System.out.println("Promoção 2");
        p2.mostraPCConfigs();
        System.out.println(); // quebra de linha

        System.out.println("Promoção 3");
        p3.mostraPCConfigs();
        System.out.println(); // quebra de linha

        Cliente cliente = new Cliente("Carlos","123456789-00");

        int n = 0;
        do{
            System.out.println("Qual promoção deseja comprar \n" +
                    "\nPromoção 1, digite 1" +
                    "\nPromoção 2, digite 2" +
                    "\nPromoção 3, digite 3" +
                    "\nPara encerrar digite 0");
            op = input.nextInt();
            if(op == 1){
                cliente.addComputador(p1,n);
                n++;
            } else if (op == 2) {
                cliente.addComputador(p2,n);
                n++;
            } else if (op == 3) {
                cliente.addComputador(p3,n);
                n++;
            }

        }while(op != 0);
        if(n == 0){
            System.exit(0); // caso ele n faça nenhum pedido, o programa encerra
        }

        System.out.println("Informações do cliente " +
                "\nNome: " + cliente.getNome() +
                "\ncpf: " + cliente.getCpf() +
                "\n");

        System.out.println("Pc's no carrinho: ");
        for (int i = 0; i < n ; i++) {
            cliente.getComputadores()[i].mostraPCConfigs();
            System.out.println(); // quebra de linha
        }

        ProcessarPedido.processarPedido(cliente.getComputadores());
        System.out.println("Valor total da compra: R$ " + cliente.calculaTotalCompra(n));

    }

}