//import  java.util.concurrent.TimeUnit;

class MedeTempo 
{
    public static void main(String args[]) throws InterruptedException {
        
        long startTime = System.nanoTime();
        /*
        
        código que será medido vai aqui
        
        
        */
        long endTime  = System.nanoTime();
        long timeElapsed = endTime - startTime;
        
        System.out.println("Tempo de Execucao em Nanosegundos: " + timeElapsed);
        System.out.println("Tempo de Execucao em Microsegundos: " + timeElapsed / 1000);
        System.out.println("Tempo de Execucao em Milisegundos: " + timeElapsed / 1000 / 1000);
        System.out.println("Tempo de Execucao em Segundos: " + timeElapsed / 1000 / 1000 / 1000);
    }
}