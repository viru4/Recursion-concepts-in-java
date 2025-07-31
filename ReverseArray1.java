import java.util.Scanner;
public class ReverseArray1 {
    //reverse an array using one pointer
    //reverse an array using recursion
    //this method is not efficient as it uses O(n) space
    public static void reverse1(int i,int n, int arr[]){
        //n is the size of the array
        //i is the pointer that goes from 0 to n/2
        if (i >= n / 2) {
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = temp;
        reverse1(i + 1, n, arr);
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
        //taking input for the array
        //n is the size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        reverse1(0, n, arr);
    }
}
