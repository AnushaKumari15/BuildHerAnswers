//The idea is to start incrementing the count when you encounter the first alphabet from the last and stop when you
// encounter a space after those alphabets.

import java.util.Scanner;

public class easy1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String x = str.trim();
        int n = x.length();
        int len = 0;
        boolean char_flag = false;

        while (n > 0) {
            if(Character.isLetter(x.charAt(n-1))) {
                // Once the first character from last is encountered, set char_flag to true.
                char_flag = true;
                len++;
            } else {
                // When the first space after the character (from the last) is encountered, return
                // the length of the last word
                if (char_flag)
                    break;
            }
            n--;


        }

        System.out.println(len);
    }
}
