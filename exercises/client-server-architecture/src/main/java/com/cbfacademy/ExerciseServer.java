package com.cbfacademy;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.net.ServerSocket;
// import java.net.Socket;


import java.io.*;
import java.net.*;

public class ExerciseServer {
    public static void main(String[] args) {
        try {
            // ServerSocket object
            ServerSocket serverSocket = new ServerSocket(4040);
            System.out.println("Server is running on port 4040");

            while (true) {
            // Create a socket object from the ServerSocket to listen and accept connections
            try (Socket socketObj = serverSocket.accept();

                BufferedReader reader = new BufferedReader
                (new InputStreamReader(socketObj.getInputStream()))) {
                    String message = reader.readLine();
                
                    System.out.println("Received message from client: " + message);  
                  }

                  serverSocket.close();
                  // socketObj.close();
            }

        } catch (IOException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}
