import RemoteService.MyRemoteInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Localisation du registre RMI
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Récupération du stub du serveur
            MyRemoteInterface stub = (MyRemoteInterface) registry.lookup("RemoteService.RemoteService.MyRemoteServer");

            // Appel de la méthode distante
            String result = stub.performAction("Hello from client");
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
