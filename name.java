package RECURSIONCONCEPTS;
public class name {
    public static void show(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("viru"+n);//pre logic
        show(n - 1); // recursive call
        System.out.println("prajapati"+n);//post logic-backtracking
        // show(n - 1);
    }
    public static void main(String[] args) {
        show(5);
    }
}
