package exceptions;

import java.io.IOException;

public class Test {
    public static void main(String[] args)  {
        try{
            ReadingFile.readFile("");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Code after exception");
    }
}
