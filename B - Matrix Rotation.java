import java.util.Scanner;
 
public class MatrixBeautiful {
    public static void check(int[] arr){
        if (arr[0] < arr[1] && arr[0] < arr[2] && arr[1] < arr[3] && arr[2] < arr[3]){
            System.out.println("YES");
        }else{
            for(int i=0; i<4; i++) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = arr[3];
                arr[3] = arr[2];
                arr[2] = temp;
                if (arr[0] < arr[1] && arr[0] < arr[2] && arr[1] < arr[3] && arr[2] < arr[3]){
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        }
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int[] arr = new int[4];
            for(int i=0; i< arr.length; i++){
                arr[i] = sc.nextInt();
            }
            check(arr);
            t--;
        }
    }
}
// Questions
// https://codeforces.com/contest/1772/problem/B
//Test Cases
// Input
// 6
// 1 3
// 5 7
// 8 10
// 3 4
// 8 10
// 4 3
// 6 1
// 9 2
// 7 5
// 4 2
// 1 2
// 4 3
// Output
// YES
// YES
// NO
// YES
// YES
// NO
