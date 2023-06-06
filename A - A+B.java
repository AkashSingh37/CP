import java.util.Scanner;
 
public class AplusB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String a = sc.next();
            System.out.println(Integer.parseInt(String.valueOf(a.charAt(0)))+ Integer.parseInt(String.valueOf(a.charAt(2))));
            t--;
        }
    }
}

//Test Cases
// Input
// 4
// 4+2
// 0+0
// 3+7
// 8+9
// Output
// 6
// 0
// 10
// 17
// Answer
// 6
// 0
// 10
// 17
