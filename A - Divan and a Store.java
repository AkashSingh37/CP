import java.util.Arrays;
import java.util.Scanner;
 
public class DivanStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int number = 0;
            for(int i=0; i<n; i++){
                if(arr[i]>=l && arr[i]<=r && k-arr[i]>=0){
                    number++;
                    k -= arr[i];
                }
            }
            System.out.println(number);
            t--;
        }
    }
}

// Question
// https://codeforces.com/contest/1614/problem/A

//Test Case
// inputCopy
// 8
// 3 1 100 100
// 50 100 50
// 6 3 5 10
// 1 2 3 4 5 6
// 6 3 5 21
// 1 2 3 4 5 6
// 10 50 69 100
// 20 30 40 77 1 1 12 4 70 10000
// 3 50 80 30
// 20 60 70
// 10 2 7 100
// 2 2 2 2 2 7 7 7 7 7
// 4 1000000000 1000000000 1000000000
// 1000000000 1000000000 1000000000 1000000000
// 1 1 1 1
// 1
// outputCopy
// 2
// 2
// 3
// 0
// 0
// 10
// 1
// 1
