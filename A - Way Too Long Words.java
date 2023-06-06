import java.util.Scanner;
 
public class WordsMinimizedProbA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String str = sc.next();
            int mini = str.length()-2;
            if(str.length()>10){
                System.out.println(str.charAt(0)+String.valueOf(mini)+str.charAt(str.length()-1));
            }else{
                System.out.println(str);
            }
            t--;
        }
    }
}

// https://codeforces.com/contest/71/problem/A
