package Algorithms;

public class CopyAllElementsFromOneArrayToAnother {

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int[] arrCopy = new int[arr.length];

        System.out.println("Original Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            arrCopy[i] = arr[i];
        }
        System.out.println();

        System.out.println("Duplicate Array: ");
        for (int i = 0; i < arrCopy.length; i++) {
            System.out.print(arrCopy[i] + " ");
        }
    }
}
