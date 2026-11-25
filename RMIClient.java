import java.rmi.registry.*;

public class RMIClient{
    public static void main(String[] args) throws Exception{
        Registry r=LocateRegistry.getRegistry("localhost",5003);
        RemoteInterface obj=(RemoteInterface)r.lookup("Calculator");
        int result=obj.add(10,20);
        System.out.println("Result: "+result);
    }
}