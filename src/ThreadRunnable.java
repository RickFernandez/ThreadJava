public class ThreadRunnable implements Runnable{

    private String nome;
    private int tempo;
    
    public ThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;

        //Faz a instancia de uma nova Thread automaticamente
        //Thread t =  new Thread(this);
        //t.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 6; i++) {
            try {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.err.println(nome + " finalizou a execucao");
    }
}