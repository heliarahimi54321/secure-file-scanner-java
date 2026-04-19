import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

public class HashGenerator {

    public static String generateSHA256(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] byteArray = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(byteArray)) != -1) {
                digest.update(byteArray, 0, bytesRead);
            }

            fis.close();

            byte[] hashBytes = digest.digest();

            StringBuilder sb = new StringBuilder();

            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();

        } catch (Exception e) {
            return "Hash generation failed.";
        }
    }
}