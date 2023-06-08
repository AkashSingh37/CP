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
