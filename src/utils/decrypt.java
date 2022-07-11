package utils;

import javax.crypto.Cipher;
import java.security.PrivateKey;

public class decrypt {
    public static final String alg = "RSA";

    public static String decrypter(byte[] texto) {
        PrivateKey key = keys.getPrivateKey();

        byte[] dectyptedText = null;

        try {
            final Cipher cipher = Cipher.getInstance(alg);
            cipher.init(Cipher.DECRYPT_MODE, key);
            dectyptedText = cipher.doFinal(texto);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return new String(dectyptedText);
    }
}
