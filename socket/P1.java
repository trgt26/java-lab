// package assignment_4;
import java.io.DataInput;
import java.net.*;
import java.io.*;
public class P1 implements Runnable {
    @Override
    public void run() {
        
    }
    public static void main(String [] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(123);
        while(true) {
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            ch obj = new ch(dis, dos);
            Thread t = new Thread(obj);
            t.start();
        }
        
    }
}
