package RECURSIONCONCEPTS;

public class EvenOdd {
    // static void countevenodd(int n , int even, int odd){
    //     if(n==0){
    //         System.out.println("Even: " + even + ", Odd: " + odd);
    //         return;
    //     }
    //     if(n%2==0){
    //         even++;
    //     }else{
    //         odd++;
    //     }
    //     countevenodd(n-1, even, odd);
    // }
    static int[] countevenodd1(int n){
       if(n==0){
        int[] result=new int[2];
        return result;
       }
       int[] result=countevenodd1(n-1);
       if(n%2==0){
        result[0]++;
       }
       else{
        result[1]++;
       }
       return result;
    }
    public static void main(String[] args) {
        // countevenodd(101, 0, 0);
        int[] result = countevenodd1(101);
        System.out.println("Even: " + result[0] + ", Odd: " + result[1]);
    }
}
