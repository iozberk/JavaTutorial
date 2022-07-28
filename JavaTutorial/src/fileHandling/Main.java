package fileHandling;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        File file = new File("code.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        String val = "Programming ";
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(val);
        bWriter.write("Java");
        bWriter.write("\nnew line created");
        bWriter.close();


        FileReader fReader = new FileReader(file);
        String line;
        BufferedReader bReader = new BufferedReader(fReader);
        
        while((line = bReader.readLine()) != null){
            System.out.println(line);
        }
        bReader.close();


    }
    
}
