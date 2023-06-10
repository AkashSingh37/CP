import java.util.Scanner;
 
public class Vasya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0){
                System.out.println(1);
            }else{
                System.out.println(a+1+b*2);
            }
            t--;
        }
    }
}
// Question
// https://codeforces.com/contest/1660/problem/A

//Test Cases
// Input
// 5
// 1 1
// 4 0
// 0 2
// 0 0
// 2314 2374
// Output
// 4
// 5
// 1
// 1
// 7063
// Answer
// 4
// 5
// 1
// 1
// 7063
