package RemoteService;

import java.rmi.RemoteException;

    public class MyRemoteServer implements MyRemoteInterface {
        public MyRemoteServer() throws RemoteException {
            super();
        }

        @Override
        public String performAction(String input) throws RemoteException {
            // Traitement côté serveur
            return "Server received: " + input;
        }

    }


