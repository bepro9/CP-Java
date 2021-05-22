package CodeChef;

import java.util.Scanner;

public class LeadGame {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s1=0,s2=0,max=0,p=0;
        while (n-- != 0)
        {
            int t1=sc.nextInt();    //turn-wise score of player1
            int t2=sc.nextInt();    //turn-wise score of player2
            s1+=t1;
            s2+=t2;
            if(s1-s2>max)
            {
                max=s1-s2;
                p=1;
            }
            if(s2-s1>max)
            {
                max=s2-s1;
                p=2;
            }
        }
        System.out.println(p+" "+max);
        sc.close();
    }
}
