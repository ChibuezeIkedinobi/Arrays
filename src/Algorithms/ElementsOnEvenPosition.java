package Algorithms;

public class ElementsOnEvenPosition {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int oddCount = 0;
        int maxOdd = arr[0];
        int oddSum = 0;

        int evenCount = 0;
        int maxEven = arr[0];
        int evenSum = 0;

        for (int i = 1; i < arr.length; i=i+2) {
            System.out.print(arr[i] + ",");
            evenCount++;
            evenSum += arr[i];
            if (maxEven < arr[i]) {
                maxEven = arr[i];
            }
        }
        System.out.println();
        System.out.println("Maximum even number: " + maxEven);
        System.out.println("Even Count: "+ evenCount);
        System.out.println("Even sum: "+ evenSum    );
        System.out.println();

        for (int i = 0; i < arr.length; i=i+2) {
            System.out.print(arr[i] + ",");
            oddCount++;
            oddSum += arr[i];
            if (maxOdd < arr[i]) {
                maxOdd = arr[i];
            }
        }
        System.out.println();
        System.out.println("Maximum odd number: " + maxOdd);
        System.out.println("Odd Count: "+ oddCount);
        System.out.println("Odd sum: "+ oddSum);
    }
}
