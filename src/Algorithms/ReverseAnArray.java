package Algorithms;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};

        System.out.println("Original Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Reversed Array: ");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
