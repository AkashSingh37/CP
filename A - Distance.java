import java.util.Scanner;
 
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int num1,num2;
            if ((x + y) % 2 == 0) {
                if (x > y)
                {
                    if (y % 2 != 0) {
                        num1 = (x + y) / 2 - y;
                        num2 = y;
 
                    } else {
                        num1 = x / 2;
                        num2 = y / 2;
 
                    }
                } else {
                    if (x % 2 != 0) {
                        num2 = (x + y) / 2 - x;
                        num1 = x;
                    } else {
                        num1 = x / 2;
                        num2 = y / 2;
                    }
                }
            }
            else
            {
                num1=-1;
                num2=-1;
            }
            System.out.println(num1 + " " + num2);
            t--;
        }
    }
}

//Question




// Test Cases
// Input
// 10
// 49 3
// 2 50
// 13 0
// 0 41
// 42 0
// 0 36
// 13 37
// 42 16
// 42 13
// 0 0
// Output
// 23 3
// 1 25
// -1 -1
// -1 -1
// 21 0
// 0 18
// 13 12
// 21 8
// -1 -1
// 0 0
// Answer
// 26 0
// 2 24
// -1 -1
// -1 -1
// 21 0
// 0 18
// 13 12
// 29 0
// -1 -1
// 0 0
