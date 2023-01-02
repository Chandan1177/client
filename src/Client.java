import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Socket s;
        try {
           s=new Socket("localhost",1024);
            System.out.println("conneced");
            while (true){
                DataOutputStream dos=new DataOutputStream(s.getOutputStream());
                dos.writeUTF(sc.nextLine());
                DataInputStream dis=new DataInputStream(s.getInputStream());
                System.out.println(dis.readUTF());

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
