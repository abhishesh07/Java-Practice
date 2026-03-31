import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        //creating a new file
        File f =new File("Abhi.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //writting to a file
        FileWriter fw = null;
        try {
            fw = new FileWriter("Abhi.txt");
            fw.write("Hello everyone , I am Abhishesh\nCurrently i am persuing b.tech in cse\nfinal year student");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //reading a file
        File f1 = new File("Abhi.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        if(f1.delete())
            System.out.println("file deleted");
        else
            System.out.println("file not deleted");

    }
}
