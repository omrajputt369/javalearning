import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReader {
        public static void main(String[] args) throws IOException {

                // Enter data using BufferedReader
                BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

                // Reading data using readLine
                String s = r.readLine();

                // Printing the read line
                System.out.println(s);
        }
}