import java.util.Arrays;
import java.util.Scanner;
 
public class VladCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if(n==1){
                if(arr[0]>1){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }else{
                if(arr[n-1] - arr[n-2] >=2){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
            t--;
        }
    }
}

//Question
// https://codeforces.com/contest/1660/problem/B

//Test Cases
// Input
// 6
// 2
// 2 3
// 1
// 2
// 5
// 1 6 2 4 3
// 4
// 2 2 2 1
// 3
// 1 1000000000 999999999
// 1
// 1
// Output
// YES
// NO
// NO
// YES
// YES
// YES
