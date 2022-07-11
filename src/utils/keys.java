package utils;

import java.io.*;
import java.security.PrivateKey;
import java.security.PublicKey;

// Onde pegamos é buscado as chaves publicas e privadas.
public class keys {

    // declaração em variavel dos caminho das chave
    public static final String privateKey = "src/Keys/private.key";
    public static final String publicKey = "src/Keys/public.key";

    // busca chave publica.
    public static PublicKey getPublicKey() {
        try {
            // caso exista chave, é retornado a chave publica para a classe encrypt.
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(publicKey));
            return (PublicKey) inputStream.readObject();
        } catch (Exception e) {
            // entra aqui quando acontece um erro.
            throw new RuntimeException(e);
        }
    }

    // busca chave privada.
    public static PrivateKey getPrivateKey() {
        try {
            // caso exista chave, é retornado a chave privada para a classe decrypt.
            ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream(privateKey));
            return (PrivateKey) inputStream2.readObject();
        } catch (Exception e) {
            // entra aqui quando acontece um erro.
            throw new RuntimeException(e);
        }
    }
}

