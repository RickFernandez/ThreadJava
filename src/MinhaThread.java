public class MinhaThread extends Thread{
    
    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run() {
        
        for (int i = 0; i < 6; i++) {
            try {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            
            } catch (InterruptedException e) {    
                e.printStackTrace();
            }
        }
        System.err.println(nome + " terminou a execucao");
    }

}
