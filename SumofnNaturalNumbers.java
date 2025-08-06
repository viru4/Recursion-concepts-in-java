package RECURSIONCONCEPTS;

public class SumofnNaturalNumbers {
    // public static void natural(int n, int sum){
    //     if (n==0) {
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum=sum+n;
    //     natural(n-1, sum);
    // }
    public static int natural(int n){
        if (n==0) {
            return n;
        }
        
        int sum =natural(n-1);
        sum=sum+n;
        return sum;
    }
    public static void main(String[] args) {
        // natural(10, 0);
        int result= natural(10);
        System.out.println(result);
    }
}
