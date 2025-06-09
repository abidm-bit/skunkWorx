package May3;

import java.io.File;
import java.io.FileWriter;

public class writeToTxtFile {
    void main(){
        File myObj = new File("src/main/resources/UntitledDocument.txt");
        System.out.println(myObj.canRead() + " I can read this file");
        System.out.println(myObj.canWrite() + " I can write to this file");

        try{
            FileWriter fileWrite = new FileWriter(myObj);
            String input = "ratatouille, incredibles, deja vu, taking of pelham 123, limitless";
            fileWrite.write(input);
            fileWrite.close();
            System.out.print("I wrote to this file");

        } catch (Exception errorWritingToFile) {
           System.out.println("I can't read or write to this this file");
        }
    }
}
