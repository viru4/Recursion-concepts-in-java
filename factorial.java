package RECURSIONCONCEPTS;

public class factorial {
    public static void fact(int num, int result) {
        if(num==1){
            System.out.println("Factorial: " + result);
            return;
        }
        // num=num-1;
        // result=result*num;
        fact(num-1,result*num); // recursive call
    }
    public static int fact1(int num) {
        if(num==1){
            // System.out.println("Factorial: " + result);
            return 1;
        }
        // num=num-1;
        // result=result*num;
        int smallresult=fact1(num-1); // recursive call
         return smallresult*num;
    }
    public static void main(String[] args) {
        int r=fact1(5);
        System.out.println(r);
        // fact(5, 1);
    }
}
