import java.io.FileWriter;
import java.io.BufferedWriter;

public class WriteAFile {
    String writtenFile = "WriteAFileExample.txt";
    FileWriter filewriter;
    BufferedWriter writer;

public void writeFile() {
    try {
        filewriter = new FileWriter(writtenFile);
        writer = new BufferedWriter(filewriter);
        writer.write("Hello, World!");
        writer.newLine();
        writer.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
public String toString() {
    return writtenFile;
}
}
