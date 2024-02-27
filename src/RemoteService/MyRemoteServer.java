package RemoteService;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.rmi.RemoteException;

    public class MyRemoteServer implements MyRemoteInterface {

        private static SecretKey generateSecretKey() throws Exception {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            return keyGenerator.generateKey();
        }

        private static String encryptString(String input, SecretKey secretKey) throws Exception {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            byte[] encryptedBytes = cipher.doFinal(input.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        }
        public MyRemoteServer() throws RemoteException {
            super();
        }
        @Override
        public String Encrypt(String input) throws Exception {
            SecretKey secretKey = generateSecretKey();
            return encryptString(input, secretKey);
        }

    }



