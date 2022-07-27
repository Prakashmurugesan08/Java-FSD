package com;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
public class CreatingFile {
	public static void main(String[] args) throws IOException {
	    
        createFileUsingFileClass();
        createFileUsingFileOutputStreamClass();
        createFileIn_NIO();
    }

    private static void createFileUsingFileClass() throws IOException{
	
	 File f1=new File("C:\\FileHandling\\test.txt");
	
	 if (f1.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
	FileWriter writer = new FileWriter(f1);
    writer.write("Test data");
    writer.close();
    
    
    
    
}   
    private static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String d = "Test data";
        FileOutputStream fos = new FileOutputStream("c:\\FileHandling\\test1.txt");
        fos.write(d.getBytes());
        fos.close();
        
    }
 
   private static void createFileIn_NIO()  throws IOException
    {
        String data = "Test data";
        Files.write(Paths.get("c:\\FileHandling\\test2.txt"), data.getBytes());
        List<String> lines = Arrays.asList("1st line", "2nd line");
        Files.write(Paths.get("file6.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
                    
    }	



}
