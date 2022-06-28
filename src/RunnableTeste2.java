public class RunnableTeste2 {

    public static void main(String[] args) {
        
        ThreadRunnable tr1 = new ThreadRunnable("#1", 1000);
        ThreadRunnable tr2 = new ThreadRunnable("#2", 1000);
        ThreadRunnable tr3 = new ThreadRunnable("#3", 1000);

        Thread t1 = new Thread(tr1);
        Thread t2 = new Thread(tr2);
        Thread t3 = new Thread(tr3);
    
        t1.start();
        t2.start();
        t3.start();
    
        //Faz com que o programa só execute a próxima etapa após as Threads finalizarem suas execuções
        while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {
            try {
                Thread.sleep(200);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Programa Finalizado");
    }
}