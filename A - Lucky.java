import java.util.*;
public class LuckyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String str = sc.next();
            int num1=0;
            int num2 =0;
            String str1 = str.substring(0,str.length()/2);
            String str2 = str.substring(str.length()/2,str.length());
            for(int i=0; i<str.length()/2; i++){
                char ch1 = str1.charAt(i);
                num1 += Integer.parseInt(String.valueOf(ch1));
 
                char ch2 = str2.charAt(i);
                num2 += Integer.parseInt(String.valueOf(ch2));
            }
            if(num1==num2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}

// Question
// https://codeforces.com/contest/1676/problem/A

//Test Cases
// Input
// 5
// 213132
// 973894
// 045207
// 000000
// 055776
// Output
// YES
// NO
// YES
// YES
// NO
// Answer
// YES
// NO
// YES
// YES
// NO
