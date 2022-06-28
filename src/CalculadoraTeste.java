public class CalculadoraTeste {
    
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};
        ThreadSoma ts1 = new ThreadSoma("#1", array);
        ThreadSoma ts2 = new ThreadSoma("#2", array);

    }
}
