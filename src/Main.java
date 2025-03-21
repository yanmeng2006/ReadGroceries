public class Main {
    public static void main(String[] args) throws Exception {
        ReadGroceries readGroceries = new ReadGroceries();
        readGroceries.readFile();
        WriteAFile writeAFile = new WriteAFile();
        writeAFile.writeFile();
        System.out.println(readGroceries);
        System.out.println(writeAFile);
    }
}
