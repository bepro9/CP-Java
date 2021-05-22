package CodeChef;

import java.util.*;
import java.lang.*;

class LuckFour
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--!=0) {
            String str = sc.next();
            System.out.println(count4(str));
        }
        sc.close();
    }
    static int count4(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='4') count++;
        }
        return count;
    }
}
