package gui.crearclase;

import java.security.SecureRandom;

/**
 *
 * @author sound
 */
public class GeneracionCodigo {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generarRandomString() {
        StringBuilder sb = new StringBuilder(7);
        for (int i = 0; i < 7; i++) {
            int randomIndex = RANDOM.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
