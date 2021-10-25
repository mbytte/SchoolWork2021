/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meganl
 */
public class Server 
{
    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(8000);
                    
            Socket s = socket.accept();
            
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            
            int rad = in.readInt();
            
            out.writeDouble(Math.PI*rad*rad);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
