package utils;

import javax.crypto.Cipher;
import java.security.PublicKey;

public class encrypt {
// Metodo feito para criptografar o texto;

    public static final String alg = "RSA";

    public static byte[] encrypt(String text) {
        PublicKey key = keys.getPublicKey();

        byte[] figureText = null;

        try {
            final Cipher cipher = Cipher.getInstance(alg);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            figureText = cipher.doFinal(text.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return figureText;
    }



}
