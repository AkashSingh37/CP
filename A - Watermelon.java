import java.util.*;
public class Watermelon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        if(weight == 2){
            System.out.println("NO");
        }else{
            if(weight%2 == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

//Question
// https://codeforces.com/contest/4/problem/A

//test cases
// Input
// 8
// Output
// YES
// Answer
// YES
