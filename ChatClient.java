import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * A basic socket client that sends a message to a server and prints the
 * response.
 */
public class ChatClient {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 5000;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message to send to server: ");
        String message = scanner.nextLine();

        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println(message);

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String response = reader.readLine();
            System.out.println("Server responded: " + response);

        } catch (UnknownHostException ex) {
            System.err.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("I/O error: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}
