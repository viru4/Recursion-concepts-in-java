import java.util.Scanner;

public class Factorial {
    public static void factorial(int f, int n) {
        //printing factorial of number n using recursion
        if (n < 1) {
            System.out.println(f);
            return; 
        }
        
        f=f*n;
        //System.out.println(sum);
        //n--;
        factorial(f, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        factorial(1,n);
    }
}


