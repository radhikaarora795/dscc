// 

import java.io.*;
import java.net.*;

class RPCSever{
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(5003);
        System.out.println("Server Waiting");

        Socket s=ss.accept();

        DataInputStream in=new DataInputStream(s.getInputStream());
        DataOutputStream out=new DataOutputStream(s.getOutputStream());

        int a=in.readInt();
        int b=in.readInt();

        int result=a+b;
        out.writeInt(result);

        s.close();
        ss.close();
    }
}