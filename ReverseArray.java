import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int l,int r, int arr[]) {
        //reversing an array using recursion double pointer
        //l is the left pointer and r is the right pointer
        if (l >= r) {
            System.out.println("Reversed array:");
            //printing the reversed array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            return;
        }
        
        //swap elements at l and r
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        
        //recursive call
        reverse(l+1, r-1, arr);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        reverse(0, n-1, arr);
    }
}
