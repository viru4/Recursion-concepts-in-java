package RECURSIONCONCEPTS;

public class count0s {
    // public static int[] count0s(int n){
    //     if(n==0){
    //         int[] arr= new int[10];
    //         return arr;

    //     }
    //     int digit=n%10;
    //     int arr[]=count0s(n/10);
    //     if (digit==0) {
    //         arr[0]++;
    //     }
    //     return arr;
    // }
    public static void count0s(int n, int count){
        if(n==0){
            System.out.println("number of 0s is : "+count);
            return;
        }
        int digit=n%10;
        if (digit==0) {
            count++;
        }
        count0s(n/10, count);
        
    }
    public static void main(String[] args) {
        // int arr[]= count0s(1000000);
        // System.out.println(arr[0]);
        count0s(1000003, 0);
    }
}
