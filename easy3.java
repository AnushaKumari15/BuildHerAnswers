import java.util.Scanner;

public class easy3 {
    public static int factorial(int i) {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {

                // for left spacing
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

                // nCr formula
                System.out.print(" " + factorial(i) / (factorial(i - j) * factorial(j)));
            }

            // for newline
            System.out.println();
        }
    }
}

