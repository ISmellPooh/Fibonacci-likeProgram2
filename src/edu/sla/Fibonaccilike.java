package edu.sla;

class Fibonacci implements Runnable {
    private int start1;
    private int start2;
    private int amount;

    private boolean recursiveMode;

    Fibonacci(int a, int b, int c, boolean mode) {
        start1 = a;
        start2 = b;
        amount = c;
        recursiveMode = mode;
    }

    public void iterativeRun() {
        System.out.println(start1);
        System.out.println(start2);
        for (int i = 3; i <= amount; i = i + 1) {
            System.out.println(start1 + start2);
            int temp = start1;
            start1 = start2;
            start2 = temp + start2;
        }
    }

    public void recursiveRun(int first, int second, int count) {
        if (count > 0) {
            System.out.println(first);
            recursiveRun(second, first + second, count - 1);
        }
    }

    public void run() {
        System.out.println();
        if (recursiveMode) {
            recursiveRun(start1, start2, amount);
        } else {
            iterativeRun();
        }
    }
}
