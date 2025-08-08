package RECURSIONCONCEPTS;

public class BinaryToDecimal {
    // public static void decimal(int n, int result, int count){
    //     if (n==0) {
    //         System.out.println(result);
    //         return;
    //     }
    //     int digit=n%10;
    //     if (digit==1) {
    //         result=result+(int) Math.pow(2, count);
    //     }
        
    //     decimal(n/10, result, count+1);
    // }
    public static int decimal(int n, int count){
        if (n==0) {
            return 0;
        }
        int result=decimal(n/10, count+1);
        int digit=n%10;
        if (digit==1) {
            result=result+(int) Math.pow(2, count);
        }
        return result;
    }
    public static void main(String[] args) {
        // decimal(101010, 0, 0);
        int result=decimal(101010, 0);
        System.out.println(result);
    }
}
