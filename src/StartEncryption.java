import utils.encrypt;
import utils.decrypt;
import utils.keys;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StartEncryption {

    public static String text;

    public static void main(String[] args) {

        try {
            Path path = Paths.get("E:\\Dev\\RSA_N3\\src\\arquivo.txt");
            byte[] bytes = Files.readAllBytes(path);
            String content = new String(bytes, StandardCharsets.UTF_8);
            text = content;
        } catch (IOException e) {
            e.printStackTrace();
        }

        final String originalMessage = text;

        final byte[] encryptedMessage = encrypt.encrypt(originalMessage);

        final String decryptedMessage = decrypt.decrypter(encryptedMessage);

        printarMensagens(originalMessage, encryptedMessage, decryptedMessage);
    }

    private static void printarMensagens(String originalMessage, byte[] encryptedMessage, String decryptedMessage) {
        System.out.println("Mensagem Original: " + originalMessage);
        System.out.println("Mensagem Criptografada: " + encryptedMessage.toString());
        System.out.println("Mensagem Decriptografada: " + decryptedMessage);
    }
}
