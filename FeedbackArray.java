import java.util.Scanner;

public class FeedbackArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rating = new int[5];
        int sum = 0;
        double average;

        System.out.println("Enter 5 feedback ratings:");

        for (int i = 0; i < 5; i++) {
            rating[i] = sc.nextInt();
            sum += rating[i];
        }

        average = (double) sum / 5;

        System.out.println("Average Rating = " + average);

        sc.close();
    }
}