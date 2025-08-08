package RECURSIONCONCEPTS;

public class Prime {
    //method 1 by returning no value
    // public static void prime(int n, int count){
    //     if(n==0||n==1){
    //         System.out.println("not a prime number");
    //         return;
    //     }
    //     if(count==n/2){
    //         if(n%count==0){
    //         System.out.println("not prime number");
    //         return;
    //         }
    //         else{
    //         System.out.println("is prime number");
            
    //         }
    //         return;
    //     }
        
    //     prime(n, count+1);
    // }
    // method 2 using boolean method 
    public static boolean  prime(int n, int count){
        if(count==n/2){
            return true;
        }
        if(n%count==0){
            return false;
        }
        return prime(n, count+1);
        
    }
    public static void main(String[] args) {
        // prime(7);
        boolean result=prime(14, 2);
        if (result) {
            System.out.println("is prime");
        } else {
            System.out.println("not a prime");
        }
    }
}


