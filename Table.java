package RECURSIONCONCEPTS;

public class Table {
    static void printTable(int num, int i){
        if(i==0){
            return;
        }
        printTable(num, i-1);
        System.out.println(num+" X "+i+" = "+num*i);
    }
    static String printTable1(int num, int i){
        if(i==11){
            String str= new String();
            return str;
            // return "";
        }
        String str =printTable1(num, i+1);
        return num+" X "+ i +" = "+num*i+"\n"+str;
    }

    public static void main(String[] args) {
        // printTable(5, 10);
        // String r =printTable1(5, 1) ;
        // System.out.println(r);
        System.out.println(printTable1(5, 1));
        
    }
}
