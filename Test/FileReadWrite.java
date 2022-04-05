package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        File file1 = new File("Test/File1.txt");
        File file2 = new File("Test/File2.txt");
        String str=FileRead(file1); 
        FileWrite(file2,str);
    }
    public static String FileRead(File file1) throws IOException
    {
        String str="";
        FileReader fReader=new FileReader(file1);
        while(true) {
            int num = fReader.read();
            if(num == -1) {
                break;
            }
            char ch=(char)num;
            str+=ch;
        }
        fReader.close(); 
        return str;
    }
    public static void FileWrite(File file2,String str) throws IOException
    {
        FileWriter fWriter=new FileWriter(file2);
        fWriter.append(str);
        fWriter.close();
    }
}
