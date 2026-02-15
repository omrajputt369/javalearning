import java.io.*;
import java.net.*;

/**
 * A basic socket server that receives a message from a client and prints it.
 */
public class ChatServer {
    public static void main(String[] args) {
        int port = 5000;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                String message = reader.readLine();
                System.out.println("Received message: " + message);

                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                writer.println("Server received: " + message);

                socket.close();
                if (message.equalsIgnoreCase("shutdown")) {
                    System.out.println("Shutting down server...");
                    break;
                }
            }
        } catch (IOException ex) {
            System.err.println("Server exception: " + ex.getMessage());
        }
    }
}
