package com.cbfacademy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Hello world! Starter Example of a simple Java program that throws an exception.
 *
 */
public class App 
{
    // public static void main( String[] args )
    // {
    //     try {
    //     System.out.println( "Hello World!" );
    //     Integer result = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
    //     System.out.println(result);
    // } catch (Exception e) {
    //     System.out.println("An error is present.");
    // } finally {
    //         System.out.println("This is the end of the code.");
    //     }
    // }

    
    public static void main(String[] args) {
        // List of filenames
        List<String> fileNames = Arrays.asList("App.java", "App.txt", null, "App.md");
        FileExtension fileExtension = new FileExtension();
        Map<String, Integer> resultMap = fileExtension.map(fileNames);

        // Print the result map
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println("File: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    
}

