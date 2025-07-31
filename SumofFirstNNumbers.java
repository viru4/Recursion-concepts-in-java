import java.util.Scanner;

public class SumofFirstNNumbers {
    public static void print(int sum,int count, int n) {
        //printing sum of numbers from 1 to n using recursion
        if (count > n) {
            System.out.println(sum);
            return; 
        }
        
        sum=sum+count;
        //System.out.println(sum);
        //count++;
        print(sum, count+1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        print(0, 1, n);
    }
}
