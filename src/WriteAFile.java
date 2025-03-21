import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedWriter;

public class WriteAFile {
    Scanner scanner = new Scanner(System.in);
    String writtenFile = "C:\\Users\\Meng\\Desktop\\Programming2\\WriteAFileExample.txt.txt";
    FileWriter filewriter;
    BufferedWriter writer;
    String test;

public void writeFile() {
    try {
        filewriter = new FileWriter(writtenFile);
        writer = new BufferedWriter(filewriter);
        System.out.println("Enter the text you want to write to the file here.");
        while(true) {
            test = scanner.nextLine();
            if(test.equalsIgnoreCase("END")){
                break;
            }
            writer.write(test);
        }
        System.out.println("File written successfully.");
        writer.flush();
        writer.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
