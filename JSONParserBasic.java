import java.util.*;

/**
 * A very simple JSON parser that handles flat objects (key-value pairs of
 * strings).
 */
public class JSONParserBasic {

    public static Map<String, String> parse(String json) {
        Map<String, String> result = new HashMap<>();
        json = json.trim();
        if (json.startsWith("{") && json.endsWith("}")) {
            json = json.substring(1, json.length() - 1);
            String[] pairs = json.split(",");
            for (String pair : pairs) {
                String[] keyValue = pair.split(":");
                if (keyValue.length == 2) {
                    String key = keyValue[0].trim().replace("\"", "");
                    String value = keyValue[1].trim().replace("\"", "");
                    result.put(key, value);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String json = "{\"name\":\"Om\", \"age\":\"21\", \"city\":\"Pune\"}";
        System.out.println("Original JSON: " + json);

        Map<String, String> parsed = parse(json);
        System.out.println("Parsed Map: " + parsed);

        System.out.println("Name: " + parsed.get("name"));
    }
}
