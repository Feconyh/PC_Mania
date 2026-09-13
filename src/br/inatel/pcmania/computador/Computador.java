package br.inatel.pcmania.computador;

public class Computador {
    private String marca;
    private float preco;

    // Composição
    private SistemaOperacional so;
    private HardwareBasico processador;
    private HardwareBasico ram;
    private HardwareBasico hd;

    // Agregação
    private MemoriaUSB musb;


    public Computador(String marca, float preco, String processador, float frequencia, float cRam, float cHD, String nome, int tipo){
        this.marca = marca;
        this.preco = preco;
        this.processador = new HardwareBasico(processador,frequencia);
        this.ram = new HardwareBasico("Memória Ram",cRam);
        this.hd = new HardwareBasico("HD",cHD);
        this.so = new SistemaOperacional(nome, tipo);
    }

    public void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);

        System.out.println(processador.getNome() + " (" + processador.getCapacidade() + "Mhz)");

        System.out.println(ram.getCapacidade() + " Gb de " + ram.getNome());

        System.out.println(hd.getCapacidade() + " Gb de " + hd.getNome());

        System.out.println("Sistema Operacional " + so.getNome() + " (" + so.getTipo() + ")");

        if (musb != null){
            System.out.println("Acompanha " + musb.getNome() + " de " + musb.getCapacidade() + "Gb");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.musb = musb;
    }

    public float getPreco() {
        return this.preco;
    }
}
