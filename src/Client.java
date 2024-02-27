import RemoteService.MyRemoteInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // Localisation du registre RMI
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Récupération du stub du serveur
            MyRemoteInterface stub = (MyRemoteInterface) registry.lookup("RemoteService");

            // Appel de la méthode distante
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string to encrypt: ");
            String input = scanner.nextLine();
            String result = stub.Encrypt(input);
            System.out.println("Server processing...");
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
