import java.util.Scanner;

/**
 * A Java program simulating a basic Text-to-Speech (TTS) engine interface.
 */

interface TTSEngine {
    void speak(String text);

    void setVoice(String voice);

    void setRate(double rate);
}

class MockTTSEngine implements TTSEngine {
    private String voice = "Default";
    private double rate = 1.0;

    @Override
    public void speak(String text) {
        System.out.println("[TTS - " + voice + " - Rate: " + rate + "x] Speaking: " + text);
    }

    @Override
    public void setVoice(String voice) {
        this.voice = voice;
        System.out.println("Voice changed to: " + voice);
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
        System.out.println("Speech rate changed to: " + rate);
    }
}

public class TextToSpeechBasic {
    public static void main(String[] args) {
        TTSEngine tts = new MockTTSEngine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Basic TTS Simulation ---");

        tts.setVoice("English-US");
        tts.setRate(1.2);

        System.out.print("Enter text to speak: ");
        String text = scanner.nextLine();

        tts.speak(text);

        System.out.println("TTS operation completed.");
        scanner.close();
    }
}
