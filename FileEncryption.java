import java.io.*;
import java.util.Scanner;

/**
 * A Java program that performs basic XOR-based file encryption and decryption.
 */
public class FileEncryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File Encryption/Decryption Tool");
        System.out.print("Enter 1 for Encryption, 2 for Decryption: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();
        System.out.print("Enter encryption key (a character): ");
        char key = scanner.next().charAt(0);

        try {
            processFile(filePath, key);
            System.out.println("File processed successfully!");
        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void processFile(String filePath, char key) throws IOException {
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();

        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (data[i] ^ key);
        }

        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fos.close();
    }
}
