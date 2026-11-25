import java.rmi.registry.*;

public class RMIServer {
    public static void main(String[] args) throws Exception{
        Implementation obj=new Implementation();
        Registry r=LocateRegistry.createRegistry(5003);
        r.rebind("Calculator", obj);
        System.out.println("RMI Server is ready");
    }
}