// import java.io.*;
// import java.net.*;

// class RPCClient {
//     public static void main(String[] args) throws Exception {
//         Socket s = new Socket("localhost", 5003);

//         DataOutputStream out =
//             new DataOutputStream(s.getOutputStream());

//         DataInputStream in =
//             new DataInputStream(s.getInputStream());

//         out.writeInt(10);
//         out.writeInt(20);

//         int result = in.readInt();

//         System.out.println("Result: " + result);

//         s.close();
//     }
// }

import java.io.*;
import java.net.*;

class RPCClient{
    public static void main(String[] args) throws Exception{
        Socket s=new Socket("localhost",5003);

        DataInputStream in=new DataInputStream(s.getInputStream());
        DataOutputStream out=new DataOutputStream(s.getOutputStream());

        out.writeInt(10);
        out.writeInt(20);

        int result=in.readInt();

        System.out.println("Result: "+result);

        s.close();
    }
}