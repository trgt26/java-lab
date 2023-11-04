// package assignment_4;

import java.net.*;
import java.util.Scanner;
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

            Scanner sc = new Scanner(System.in);
            
            while(true) {

                String s = dis.readUTF();
                System.out.println(s);

                s = sc.nextLine();
                dos.writeUTF(s);
            }
    
        } catch (Exception e) {
            System.out.println(e);
            // e.printStackTrace();
        }
        // Socket("127.")
        
    }
}
