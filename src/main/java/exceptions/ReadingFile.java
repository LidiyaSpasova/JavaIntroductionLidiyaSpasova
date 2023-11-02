package exceptions;

import java.io.*;

public class ReadingFile {
    public static void readFile(String fullPathName) throws IOException {
        //FileInputStream fis //optional
        FileInputStream fileInputStream = new FileInputStream(fullPathName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String tmp = null;
        while ((tmp = bufferedReader.readLine()) != null){
        }
        bufferedReader.close();
        fileInputStream.close();
    }
}
