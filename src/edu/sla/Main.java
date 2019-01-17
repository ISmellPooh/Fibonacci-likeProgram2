package edu.sla;

public class Main {

    public static void main(String[] args) {
        boolean recursiveMode = true;
        int numberOfFibonacci = (int)(Math.random()*10);

        for (int i = 0; i < numberOfFibonacci; i++) {
            //Fibonacci fibonacci = new Fibonacci((int)(Math.random()*10), (int)(Math.random()*10), 20, recursiveMode);
            //fibonacci.run();
            Runnable fibonacci = new Fibonacci((int)(Math.random()*10), (int)(Math.random()*10), 20, recursiveMode);
            Thread thread = new Thread(fibonacci);
            thread.start();
            System.out.println("");
        }
    }
}
