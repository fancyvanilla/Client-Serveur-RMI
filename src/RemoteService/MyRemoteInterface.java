package RemoteService;

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface MyRemoteInterface extends Remote {
    public String Encrypt(String input) throws Exception;
}
