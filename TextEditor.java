import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class TextEditor {
    public static void main(String[] args) {
        String fileName = "textfile.txt";
        String content = "Hello! This is a text editor program.\n"
                       + "FileWriter is used to write content.\n"
                       + "FileReader is used to read content.";

        try {
            // Writing content to file
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Content written successfully.");
            // Reading content from file
            FileReader reader = new FileReader(fileName);
            int ch;
            System.out.println("\nFile Content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
