package RECURSIONCONCEPTS;

public class Armstrong {
    // public static void isarmstrong(int n, int result, int org){
    //     if (n==0) {
    //         if (result==org) {
    //             System.out.println("isarmstrong");
                
    //         } else {
    //             System.out.println("not armstrong");
    //         }
    //         return;
    //     }
    //     int digit=n%10;
    //     result=result+(int) Math.pow(digit, 3);
    //     isarmstrong(n/10, result, org);
    // }
    public static boolean  isarmstrong(int n, int result, int org){
        //not done
        if (n==0) {
            return true;
        }
        int digit=n%10;
        result=result+(int) Math.pow(digit, 3);
        if(n==org) return true;
        
        return isarmstrong(n/10, result, org);
        // return result;
        
        
    }
    public static void main(String[] args) {
        // isarmstrong(153, 0, 153);
        boolean result=isarmstrong(154, 0, 154);
        if(result){
            System.out.println("is armstrong");
        }
        else System.out.println("not armstrong");
    }
}
