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

                String s = sc.nextLine();

                dos.writeUTF(s);
                
                s = dis.readUTF();
                System.out.println(s);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
