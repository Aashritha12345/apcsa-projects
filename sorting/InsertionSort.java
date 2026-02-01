package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        for (int i = 1; i < input.length; i++) {
            // The current value to be inserted into the sorted portion
            int key = input[i];
            // The index of the last element in the sorted portion
            int j = i - 1;

            // Move elements of the sorted portion that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            // Insert the key at its correct position
            input[j + 1] = key;
        }
    }
}
