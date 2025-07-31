public class PrintingName {
    public static void name(int i, int n) {
        //printing the name using recursion
        if (i > n) {
            return;
        }
        System.out.println("VIRENDRA KUMAR");
        //i++;
        name(i + 1, n); // recursive call
    }
    public static void main(String[] args) {
        name(1, 5);
    }
}

        