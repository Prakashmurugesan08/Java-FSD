package com;
import java.io.*;
public class TextFileModifier {
	static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File("c:\\FileHandling\\test.txt");
        String oldContent = "100 100  100Test data";
        BufferedReader reader = null;
        FileWriter writer = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(oldString, newString);
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args)
    {
        modifyFile("c:\\FileHandling\\test.txt", "100 100  100Test data", " 100");
        System.out.println("done");
    
    }



}
