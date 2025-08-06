package RECURSIONCONCEPTS;

public class SumofDigits {
    // public static void summison(int n, int sum){
    //     if(n==0){
    //         System.out.println("sum is "+sum);
    //         return;
    //     }
    //     sum=sum+n%10;
    //     summison(n/10,sum);
    // }
    public static int summison1(int n){
        if(n==0){
            return n;
        }
        // n=n/10;
        int result=summison1(n/10);
        result=result+n%10;
        return result;
    }
    public static void main(String[] args) {
        int result=summison1(3678);
        System.out.println(result);
    }
}
