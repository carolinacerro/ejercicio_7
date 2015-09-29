package edu.upc.eetac.dsa.carolina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Carolina on 29/09/2015.
 */
public class DaytimeTCPClient {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Tienes que poner el nombre del servidor y el numero de puerto del servidor");
            System.exit(-1);
        }
        String server = args[0];
        int port = Integer.parseInt(args[1]);

        Socket socket = new Socket(server, port);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String time = reader.readLine();
        System.out.println(time);
    }
}
