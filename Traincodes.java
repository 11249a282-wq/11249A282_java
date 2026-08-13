import java.util.Scanner;

public class Traincodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] trainCodes = {"12760", "12627", "12841", "17644", "12007"};

        System.out.print("Enter the index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Train code: " + traincodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter an index between 0 and 4.");
        }

        sc.close();
    }
}