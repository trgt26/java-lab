// package assignment_4;

import java.net.*;
import java.io.*;
import java.util.*;

public class client {
    public static void main(String [] args) {
        try {

            Socket skt = new Socket("localhost", 323);
            
            InputStream is = skt.getInputStream();
            OutputStream os = skt.getOutputStream();
    
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);
    
            Scanner sc = new Scanner(System.in);
            while(true) {
                
                Double rad = sc.nextDouble();

                dos.writeDouble(rad);
                
                Double res = dis.readDouble();
                System.out.println(res);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
