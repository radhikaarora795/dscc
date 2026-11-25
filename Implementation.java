import java.rmi.*;
import java.rmi.server.*;

public class Implementation extends UnicastRemoteObject implements RemoteInterface{
   
    Implementation() throws RemoteException { 
        super();
    }

    public int add(int a, int b) {
        return a+b;
    }
}