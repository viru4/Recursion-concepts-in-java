package RECURSIONCONCEPTS;

public class CountEvenOddDigits {
    // public static void evenodd(int n, int even, int odd){
    //     if(n==0){
    //         System.out.println("even digits: "+even + "\nodd digits: "+ odd);
    //         return;
    //     }
    //     int digit=n%10;
    //     if (digit%2==0) {
    //         even++; 
    //     } else {
    //         odd++;
    //     }
    //     evenodd(n/10,even, odd);
    // }
    public static  int[] evenodd(int n){
        if(n==0){
            int arr[]=new int[2];
            return arr;
        }
        int arr[]= evenodd(n/10);
        if(n%2==0){
            arr[0]++;
        }
        else arr[1]++;
        return arr;
    }
    public static void main(String[] args) {
        // evenodd(1234, 0, 0);
        int[] arr=evenodd(12345);
        System.out.println("even digits: "+arr[0] + "\nodd digits: "+ arr[1]);
    }
}
