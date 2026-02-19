import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A Java program demonstrating a basic Markdown to HTML converter using Regex.
 */

public class MarkdownToHTMLConverter {
    public static String convert(String markdown) {
        String html = markdown;

        // Headers: # Heading -> <h1>Heading</h1>
        html = html.replaceAll("(?m)^# (.*)$", "<h1>$1</h1>");
        html = html.replaceAll("(?m)^## (.*)$", "<h2>$1</h2>");
        html = html.replaceAll("(?m)^### (.*)$", "<h3>$1</h3>");

        // Bold: **text** -> <b>text</b>
        html = html.replaceAll("\\*\\*(.*?)\\*\\*", "<b>$1</b>");

        // Italic: *text* -> <i>text</i>
        html = html.replaceAll("\\*(.*?)\\*", "<i>$1</i>");

        // Links: [text](url) -> <a href="url">text</a>
        html = html.replaceAll("\\[(.*?)\\]\\((.*?)\\)", "<a href=\"$2\">$1</a>");

        return html;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Markdown text (single line for demo):");
        String input = scanner.nextLine();

        String output = convert(input);

        System.out.println("\nConverted HTML:");
        System.out.println(output);

        scanner.close();
    }
}
