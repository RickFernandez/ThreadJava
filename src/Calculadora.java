public class Calculadora {
    
    private int soma;

    public synchronized int somaArray(int[] array) {
        soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];

            System.out.println("Executando a soma " + Thread.currentThread().getName()
            + " somando o valor "  + array[i] + " com o total de " + soma); //Pega qual Thread está executando o programa
            
            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return soma;
    }
}
