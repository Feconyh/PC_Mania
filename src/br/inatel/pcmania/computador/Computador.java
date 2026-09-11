package br.inatel.pcmania.computador;

public class Computador {
    private String marca;
    private float preco;

    // Promoção 1
    SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia", 64);

    HardwareBasico hbp1 = new HardwareBasico("Processador Core i5",2200);
    HardwareBasico hbram1 = new HardwareBasico("Memória RAM",8);
    HardwareBasico hbhd1 = new HardwareBasico("HD",500);

    MemoriaUSB musb1 = new MemoriaUSB("Pen-drive",16);

    // Promoção 2
    SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);

    HardwareBasico hbp2 = new HardwareBasico("Processador Core i7",3370);
    HardwareBasico hbram2 = new HardwareBasico("Memória RAM",16);
    HardwareBasico hbhd2 = new HardwareBasico("HD",1000);

    MemoriaUSB musb2 = new MemoriaUSB("Pen-drive",32);

    // Promoção 3
    SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);

    HardwareBasico hbp3 = new HardwareBasico("Processador Core i7",4500);
    HardwareBasico hbram3 = new HardwareBasico("Memória RAM",32);
    HardwareBasico hbhd3 = new HardwareBasico("HD",2000);

    MemoriaUSB musb3 = new MemoriaUSB("HD Externo",1000);


    public Computador(String marca, float preco, HardwareBasico hbp, HardwareBasico hbram, HardwareBasico hbhd, SistemaOperacional so, MemoriaUSB musb){

    }

    public void mostraPCConfigs(){

    }

    public void addMemoriaUSB(MemoriaUSB musb){

    }
}
