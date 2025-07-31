import java.util.Scanner;

public class PrintingNto1 {
    public static void print(int n){
        //printing from n to 1 using recursion
        if (n<1) {
            return;
        }
        System.out.println(n);
        //n--;
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        print(n);
    }
}
