package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

     /**
     * Checks a filename to verify if it has a .java extension
     * @param filename
     * @return true if the filename extension is .java; otherwise false
     * @throws FilenameException
     */

    public boolean check(String fileName) throws FilenameException {
        if (fileName == null || fileName.isEmpty()) {
            throw new FilenameException("Filename is empty");
        }
        return fileName.endsWith(".java");

    }
    
    /**
     * Maps a list of filenames to a map with the filename as key and an integer as value
     * The integer value is 1 if the filename has a .java extension, 
     * 0 if it doesn't, and -1 if the filename is empty
     * @param filenames
     * @return a map with the filename as key and an integer as value
     */

     public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (String filename: filenames) {
            try {
                boolean fileEx = this.check(filename);
                resultMap.put(filename, fileEx ? 1 : 0);
            } catch (FilenameException e) {
                resultMap.put(filename, -1);
            }
        }
        return resultMap;
    }
    
}
