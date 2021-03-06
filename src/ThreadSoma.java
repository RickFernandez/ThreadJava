public class ThreadSoma implements Runnable {
    
    private String nome;
    private int[] nums;
    private static Calculadora calc = new Calculadora();

    public ThreadSoma(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        new Thread(this, nome).start();
        //Thread t = new Thread(this, nome)
        //t.start();

    }

    @Override
    public void run() {

        System.out.println(this.nome + " iniciada");
        int soma = calc.somaArray(this.nums);
        
        System.out.println("Resultado da soma para Thread " + this.nome + " e: " + soma);
        System.err.println(this.nome + " finalizada");
        
    }
}
