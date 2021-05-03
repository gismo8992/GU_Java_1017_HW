package javaLevel3.lesson4;

public class WaitNotifyClass implements Runnable {
    private static volatile char c = 'A';
    private static final Object monitor = new Object();
    private final char currentLetter;
    private final char nextLetter;

    public WaitNotifyClass(char currentLetter, char nextLetter) {
        this.currentLetter = currentLetter;
        this.nextLetter = nextLetter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (monitor) {
                try {
                    while (c != currentLetter)
                        monitor.wait();
                    System.out.print(currentLetter);
                    c = nextLetter;
                    monitor.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
