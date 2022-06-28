public enum CorSemaforo {
    
    VERDE(1000), AMARELO(500), VERMELHO(1500);

    private int tempoEspera;

    CorSemaforo(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
