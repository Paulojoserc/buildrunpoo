package tech.buildrun.cafeteria;

public class DolceGusto implements MaquinaCafe {
    private boolean ligada;
    private boolean resistenciaLigada;
    private boolean possuiCachimbo;
    private ModoCafe modoCafeSelecionado;
    private int qtdAguaCaldeira;

    @Override
    public void ligar() {
        System.out.println("Ligando a dolce Gusto....");
        this.ligada = true;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a dolce Gusto....");
        this.ligada = false;
    }

    @Override
    public void colocarCachimbo() {
        System.out.println("Cachimbo inserido...");
        this.possuiCachimbo = true;
    }

    @Override
    public void retirarCachimbo() {
        System.out.println("Cachimbo removido...");
        this.possuiCachimbo = false;
    }

    @Override
    public void selecionarModo(ModoCafe modoCafe) {
        System.out.println("Modo cafe selecionado: " + modoCafe.getDescricao());
        this.modoCafeSelecionado = modoCafe;
    }

    @Override
    public void fazerCafe() {
        if (this.isLigada()) {
            if (this.possuiCachimbo) {

                if (this.modoCafeSelecionado != null) {
                    this.injetarAguaCaldeira(300);
                    this.ligarResistencia();
                    System.out.println("Fazendo " + this.modoCafeSelecionado.getDescricao() + "...");
                    System.out.println("Café pronto!");
                    this.esvaziarCaldeira();
                    this.desligarResistencia();
                } else {
                    System.out.println("Modo de café não foi selecionado. Selecione antes de prosseguir.");
                }

            } else {
                System.out.println("Dolce Gusto está sem cachimbo. Coloque o cachimbo com o pé de café");
            }

        } else {
            System.out.println("Dolce Gusto está desligada.");
        }

    }

    private boolean isLigada() {
        return this.ligada;
    }

    private void injetarAguaCaldeira(int qtdAguaCaldeira) {
        System.out.println("Injetando " + qtdAguaCaldeira + "ml de água na caldeira...");
        this.qtdAguaCaldeira = qtdAguaCaldeira;
    }

    private void esvaziarCaldeira() {
        System.out.println("Esvaziando " + this.qtdAguaCaldeira + "ml da caldeira...");
        this.qtdAguaCaldeira = 0;
        System.out.println("Caldeira esvaziada...");
    }

    private void ligarResistencia() {
        System.out.println("Ligando resistencia...");
        this.resistenciaLigada = true;
    }

    private void desligarResistencia() {
        System.out.println("Desligando resistencia...");
        this.resistenciaLigada = false;
    }
}
