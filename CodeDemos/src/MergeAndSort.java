public class MergeAndSort {
    public static void main(String[] args) {

        int[] array1 = {5, 3, 9, 7};
        int[] array2 = {8, 6, 2, 4};

        // Step 1: Create a new array to hold all elements
        int[] mergedArray = new int[array1.length + array2.length];

        // Step 2: Copy elements from both arrays into the new array
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        // Step 2: Sort the merged array using Bubble Sort
        for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = 0; j < mergedArray.length - 1 - i; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    // Swap mergedArray[j] and mergedArray[j + 1]
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = temp;
                }
            }
        }

        // Print the merged and sorted array
        System.out.print("Merged and sorted array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
