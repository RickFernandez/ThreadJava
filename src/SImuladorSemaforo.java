public class SImuladorSemaforo {
    
    public static void main(String[] args) {
        
        ThreadSemnaforo semaforo = new ThreadSemnaforo();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(semaforo.getCor());
            semaforo.esperaCorMudar();
        }
        semaforo.desligarSemafoto();
    }
}
