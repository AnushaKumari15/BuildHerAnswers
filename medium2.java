import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class medium2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int answer = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (ans.containsKey(arr[i])) {
            //fetch the value of the key ( array[i] ), and increase the value by 1
                ans.put(arr[i], ans.get(arr[i]) + 1);
            } else {
                //insert the element in the hashmap if the element does not exist as a key
                ans.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> hm : ans.entrySet()) {
            if (hm.getValue() > n / 3) {
                answer = hm.getKey();
            }
        }
        System.out.println(answer);

    }
}

