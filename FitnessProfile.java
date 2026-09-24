import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FitnessProfile {
    public static void main(String[] args) {
        String fileName = "profile.txt";

        String profile = "Name: ishwarya\n"
                       + "Age: 20\n"
                       + "Weight: 55 kg\n"
                       + "Fitness Goal: Weight Loss\n";

        try {
            // Writing profile data to the file
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write(profile.getBytes());
            fos.close();
            System.out.println("User profile written successfully.");
            // Reading profile data from the file
            FileInputStream fis = new FileInputStream(fileName);
            int ch;
            System.out.println("\nUser Profile:");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
