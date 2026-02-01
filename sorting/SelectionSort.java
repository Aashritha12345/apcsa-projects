package sorting;

public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");


        for (int i=0; i<input.length-1; i++){
            //it ilterates through the whole array and use the smallest element to swap with the current index so that every ilteration the smallest element is placed at the front of the unsorted part of the array
            int minIndex = i;
            //min index is the index of the smallest element
            for (int j=i+1; j<input.length; j++){
                //so j is the index of the element we are comparing to the smallest element
                if (input[j] < input[minIndex]){
                    //if the element at j is smaller than the element at minIndex
                    minIndex = j;
                    //then we update minIndex to be j
                }
            }
            //after we finish the inner loop, we swap the smallest element with the element at index i
            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }
    }
}
