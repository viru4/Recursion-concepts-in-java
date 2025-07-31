
import java.util.Scanner;

public class Printing1TOn {
    public static void print(int count, int n) {
        //printing numbers from 1 to n using recursion
        if (count > n) {
            return; 
        }
        System.out.println(count);
        //count++;
        print(count+1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        print(1, n);
    }
}
