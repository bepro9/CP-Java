package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

class Xmas {
    public static void main(String args[]) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int sum = 0;
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[m];
            for (int i = 0; i < m; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) arr[i] = n - arr[i];
            for (int i = 0; i < m; i++) sum +=arr[i];
            System.out.println(sum);
        }
        sc.close();
    }
}