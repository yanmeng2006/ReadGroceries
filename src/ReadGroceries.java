import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadGroceries {
    public String path = "C:\\Users\\Meng\\Desktop\\Programming2\\Groceries.txt";
    FileReader filereader;
    BufferedReader reader;
    public String line;

    public void readFile() {
        try {
            filereader = new FileReader(path);
            reader = new BufferedReader(filereader);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String toString(){
        return line;
    }
}
