import java.util.Scanner;

public class StopWatch {

    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch sw = new StopWatch();

        System.out.println("=== Console StopWatch ===");
        System.out.println("Press Enter to START");
        scanner.nextLine();

        sw.start();
        System.out.println("Stopwatch started... Press Enter to STOP");

        scanner.nextLine();
        sw.stop();

        long time = sw.getElapsedTime();
        System.out.println("\nElapsed Time: " + time + " milliseconds");
        System.out.printf("Elapsed Time: %.2f seconds\n", time / 1000.0);

        scanner.close();
    }
}
