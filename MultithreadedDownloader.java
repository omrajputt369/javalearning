/**
 * A Java program that simulates a multithreaded file downloader.
 */
class DownloadTask implements Runnable {
    private String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Started downloading: " + fileName);
        try {
            // Simulate download time
            Thread.sleep((long) (Math.random() * 3000));
        } catch (InterruptedException e) {
            System.err.println("Download interrupted: " + fileName);
        }
        System.out.println("Finished downloading: " + fileName);
    }
}

public class MultithreadedDownloader {
    public static void main(String[] args) {
        String[] files = { "file1.zip", "file2.jpg", "file3.mp4", "file4.pdf", "file5.txt" };

        System.out.println("Starting downloads in parallel...");

        for (String file : files) {
            Thread thread = new Thread(new DownloadTask(file));
            thread.start();
        }
    }
}
