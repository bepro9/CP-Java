package CodeChef;

import java.util.Scanner;

public class Carvans {
    static int Solve(int arr[], int n) {
        int count = 1;
        int current_speed = arr[0];
        for(int i=1;i<n;i++) {
            if (arr[i]<=current_speed){
                count++;
                current_speed=arr[i];
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
            System.out.println(Solve(arr, N));
        }
    }
}
