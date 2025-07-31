
import java.util.Scanner;

public class FibonacciOf_nthTerm{
    public static int fibonacci(int n) {
        if(n<=1){
            return n;
        }
        // Recursive case: calculate the nth Fibonacci number
        int last =fibonacci(n-1);
        int last1 =fibonacci(n-2);
        return last+last1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(fibonacci(n));
    }
}