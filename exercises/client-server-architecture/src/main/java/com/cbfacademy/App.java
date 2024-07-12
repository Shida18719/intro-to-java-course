package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URI;
import java.net.HttpURLConnection;


public class App {
    public static void main(String[] args) throws Exception{
        
    // Client-Server Architecture, connecting to the CBF website
        try {
            URL url = new URI("https://codingblackfemales.com/").toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
    
            try (BufferedReader in = new BufferedReader
            (new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }

                // Closing the connection
                connection.disconnect();
            }

        } catch (Exception e) {
            System.out.println("e.getMessage()");
        }

    }
}
