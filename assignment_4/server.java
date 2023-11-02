// package assignment_4;

import java.net.*;
import java.io.*;

public class server {
    public static void main(String [] args) {
        try {
            ServerSocket sskt = new ServerSocket(323);
            Socket skt = sskt.accept();
            
            InputStream is = skt.getInputStream();
            OutputStream os = skt.getOutputStream();

            
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);
            
            while(true) {

                Double rad = dis.readDouble();
                
                Double res = 3.1416*rad*rad;
    
                dos.writeDouble(res);
            }
    
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Socket("127.")
        
    }
}
