package RECURSIONCONCEPTS;

public class pallindromenumber {
    // static boolean ispallindrome(int num, int org, int reverse){
    //     if(org==reverse){
    //         return true;
    //     }
    //     if(num==0){
    //         return false;
    //     }
    //     reverse= reverse*10+num%10;

    //     return ispallindrome(num/10, org, reverse);
    // }
    static int ispallindrome1(int num){
        return ispallindrome1(num, 0);
    }
    static int ispallindrome1(int num, int reverse){
        if(num==0){
            return reverse;
        }
        reverse= reverse*10+num%10;
        return ispallindrome1(num/10, reverse);
    }
    public static void main(String[] args) {
        int num=123;
        // boolean result=ispallindrome(num, num, 0);
        // System.out.println(result);
        int reverse=ispallindrome1(num);
        if(reverse==num){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }

}
