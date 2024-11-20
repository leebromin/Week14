import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("117.17.34.230", 1234);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("an");
        String serverMessage = in.readLine();
        System.out.println("Server: " + serverMessage);

        socket.close();
    }
}
