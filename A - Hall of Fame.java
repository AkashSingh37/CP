import java.util.Scanner;
 
public class HallofFame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            String s = sc.next();
            int one = 0;
            int a = 0;
            int b = 0;
            for(int i=0; i<n-1; i++){
                if(s.charAt(i) == 'L' && s.charAt(i+1) == 'R'){
                    one++;
                    b =i+1;
                }
                if(s.charAt(i) == 'R' && s.charAt(i+1) == 'L'){
                    a++;
                }
            }
            if(a>0){
                System.out.println(0);
            }else{
                if(one>0){
                    System.out.println(b);
                }else{
                    System.out.println(-1);
                }
            }
            t--;
        }
    }
}

// https://codeforces.com/contest/1779/problem/A

//Test Cases
// Input
// 6
// 2
// LL
// 2
// LR
// 2
// RL
// 2
// RR
// 7
// LLRLLLR
// 7
// RRLRRRL
// Output
// -1
// 1
// 0
// -1
// 0
// 0
// Answer
// -1
// 1
// 0
// -1
// 2
// 3
