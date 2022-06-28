public class RunnableTeste3 {
    
    public static void main(String[] args) {
        
        ThreadRunnable tr1 = new ThreadRunnable("#1", 1000);
        ThreadRunnable tr2 = new ThreadRunnable("#2", 1300);
        ThreadRunnable tr3 = new ThreadRunnable("#3", 1700);

        Thread t1 = new Thread(tr1);
        Thread t2 = new Thread(tr2);
        Thread t3 = new Thread(tr3);
    
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            //Faz com que o programa execute as próximas etapas após a "morte" das outras Threads

        } catch (Exception e) {
            e.printStackTrace();
        }
    
       
        System.out.println("Programa Finalizado");
    }
}
