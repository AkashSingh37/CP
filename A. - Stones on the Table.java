import java.util.*;
public class Solved{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String str = sc.next();
        int count = 0;
        for(int i=0; i<number-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }
        }
        System.out.print(count);
    }
}
