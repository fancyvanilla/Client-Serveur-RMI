import RemoteService.MyRemoteInterface;
import RemoteService.MyRemoteServer;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Server {
    public static void main(String[] args) {
        try {
            MyRemoteServer server = new MyRemoteServer();
            MyRemoteInterface stub = (MyRemoteInterface) UnicastRemoteObject.exportObject(server, 0);
            System.out.println("Stub generated successfully.");

            // Création du registre RMI
            Registry registry = LocateRegistry.createRegistry(1099); //default port:1099
            registry.rebind("RemoteService", stub);
            System.out.println("Server ready");

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
