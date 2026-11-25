import java.rmi.*;

public interface RemoteInterface extends Remote {
    int add(int a, int b) throws RemoteException;
}