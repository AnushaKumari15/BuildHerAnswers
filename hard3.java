import java.util.Scanner;

public class hard3 {
    static int countDigitOne(int n){
        int count = 0;
        for (int i = 0; i <= n ; i++) {
//            Convert i to string and count ’1’ in each integer string.
            String str = String.valueOf(i);
//            Add a count of ’1’ in each string to the sum.
            count += str.split("1",-1).length - 1;

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigitOne(n));
    }
}
