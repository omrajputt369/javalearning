import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * A Java program demonstrating a Simple Encryption/Decryption System simulation
 * (using AES).
 */

class EncryptionEngine {
    private SecretKey secretKey;

    public EncryptionEngine() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        this.secretKey = keyGen.generateKey();
    }

    public String encrypt(String strToEncrypt) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
    }

    public String decrypt(String strToDecrypt) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
    }
}

public class SimpleEncryptionSys {
    public static void main(String[] args) {
        try {
            EncryptionEngine engine = new EncryptionEngine();

            String originalString = "Secret Message 123";
            System.out.println("Original: " + originalString);

            String encryptedString = engine.encrypt(originalString);
            System.out.println("Encrypted: " + encryptedString);

            String decryptedString = engine.decrypt(encryptedString);
            System.out.println("Decrypted: " + decryptedString);

        } catch (Exception e) {
            System.out.println("Error while encrypting/decrypting: " + e.toString());
        }
    }
}
