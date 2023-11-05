import java.net.*;
import java.io.*;

public class ch implements Runnable {
    
    DataInputStream dis;
    DataOutputStream dos;
    
    @Override
    public void run() {
        try {
            dos.writeUTF("Connected, from server");
            while(true) {
                int x = dis.readInt();
                dos.writeInt(x*x);
            }
        } catch(Exception e) {

        }
    }
    public ch(DataInputStream dis, DataOutputStream dos) {
        this.dis=dis;
        this.dos = dos;
    }
}
