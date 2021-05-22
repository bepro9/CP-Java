package HackerRank;

import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int cost = sc.nextInt();
            int min_wrap = sc.nextInt();
            int wrapper = n/cost;  // 3
            int choco = n/cost;     // 3
            while (wrapper>=min_wrap) {  // 3>2
                int added_choco = wrapper/min_wrap; //
                choco += added_choco;  // 3+1= 4
                wrapper = added_choco+wrapper%min_wrap;
            }
            System.out.println(choco);
        }
    }
}
