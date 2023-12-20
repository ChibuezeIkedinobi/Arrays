package Algorithms;

public class SmallestNumberInAnArray {

    public static void min(int arr[]) {
        int minimum = arr[0];
        for (int i=1; i< arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }
        System.out.println(minimum);
    }

    public static void main(String[] args) {
        int arr[] = {33,3,4,5,2,50};
        min(arr);
    }
}
