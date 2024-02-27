package RemoteService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemoteInterface extends Remote {
    String performAction(String input) throws RemoteException;
}
