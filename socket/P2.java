import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 123);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        String str = dis.readUTF();
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        while(true) {
            int x = sc.nextInt();
            dos.writeInt(x);
            x = dis.readInt();
            System.out.println("Square = " +x);
        }
        
    }
}
