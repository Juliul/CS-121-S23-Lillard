package AssignWeek11;
//BubbleSort
public class Sorting {
    public void ascendingBubbleSort(int[] array) {
        // variable to temporarily hold a value during switch
        int temp;
        // loop through the whole array once for each element in the array
        for (int i = 0; i < array.length - 1; i++) {
            // for each unsorted element, loop through and compare to next element
            // length - i - 1 because we only need to loop through unsorted elements
            for (int index = 0; index < array.length - i - 1; index++) {
                // compares unsorted element to next element
                if (array[index] > array[index + 1]) {
                    //temporarily holds value
                    temp = array[index];
                    // assigns next value to current index
                    array[index] = array[index + 1];
                    // assigns current value to next index
                    array[index + 1] = temp;
                }
            }
        }
    }

    public void descendingBubbleSort(int[] array) {
        // variable to temporarily hold a value during switch
        int temp;
        // loop through the whole array once for each element in the array
        for (int i = 0; i < array.length - 1; i++) {
            // for each unsorted element, loop through and compare to next element
            // length - i - 1 because we only need to loop through unsorted elements
            for (int index = 0; index < array.length - i - 1; index++) {
                // compares unsorted element to next element
                if (array[index] < array[index + 1]) {
                    // temporarily holds value
                    temp = array[index];
                    // assigns next value to current index
                    array[index] = array[index + 1];
                    // assigns current value to next index
                    array[index + 1] = temp;
                }
            }
        }
    }

    public void mergeSort(int[] array) {
        // if array has 1 element, return:
        // base case: stops recursive call -- mergeSort method stops
        if (array.length <= 1) {
            return; // a method will stop when it reaches a return statement
        }

        // initialize array with size of left half of the original array
        int[] leftHalf = new int[array.length / 2];
        // initialize array with size of right half of the original array
        int[] rightHalf = new int[array.length - leftHalf.length];

        // assigning values from the left half of the original array to leftHalf array
        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = array[i];
        }

        // assigning values from second half of original array to secondHalf array
        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = array[leftHalf.length + i];
        }

        // recursive call until arrays reach base case: 1 element
        mergeSort(leftHalf); // recursive call: divides leftHalf array into smaller arrays
        mergeSort(rightHalf); // recursive call: divides rightHalf array into smaller arrays

        // call merge method to merge the divided arrays
        merge(leftHalf, rightHalf, array);
    }

    private void merge(int[] leftHalf, int[] rightHalf, int[] array) {
        int leftIndex = 0;
        int rightIndex = 0;
        int arrayIndex = 0;

        //advance leftHalf array index or rightHalf array index accordingly
        while ((leftIndex < leftHalf.length) && (rightIndex < rightHalf.length)) {
            if (leftHalf[leftIndex] < rightHalf[rightIndex]) {
                array[arrayIndex] = leftHalf[leftIndex];
                leftIndex++;
                arrayIndex++;
            } else {
                array[arrayIndex] = rightHalf[rightIndex];
                rightIndex++;
                arrayIndex++;
            }
        }

        //copy the rest of leftHalf array to original array
        while (leftIndex < leftHalf.length) {
            array[arrayIndex] = leftHalf[leftIndex];
            arrayIndex++;
            leftIndex++;
        }

        //copy the rest of rightHalf array to original array
        //--note only one of these while loops will be true
        while (rightIndex < rightHalf.length) {
            array[arrayIndex] = rightHalf[rightIndex];
            arrayIndex++;
            rightIndex++;
        }
    }

    public void selectionSort(int[] array) {
        // loop to move boundary of unsorted array
        for (int i = 0; i < array.length - 1; i++) {
            // assume element at first index [i] is the minimum or lowest value
            int min = 1;
            // loop through unsorted array
            // start with j at i + 1 so wee can compare, in first loop, [0] with [1], etc
            for (int j = i + 1; j < array.length; j++) {
                // see if element at index j is less than the minimum
                if (array[j] < array[min]) {
                    // if it is, we set minimum value to that index number
                    min = j;
                }
            }
            // swap the element at the minimum with the
            // element at the beginning of the unsorted array
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    public void insertionSort(int[] array) {
        int temp; // temporary variable for swapping elements
        // loop through array starting at the second index [1],
        // assuming [0] is already sorted
        for (int i = 1; i < array.length; i++) {
            // loop while j > 0 (could use a while loop instead of for)
            // decrement j each loop
            for (int j = i; j > 0; j--) {
                // check if element at j is less than the preceding element
                if (array[j] < array[j - 1]) {
                    // if less, swap
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
    public void quickSort(int[] array, int start, int end) {
        // call partition method to divide the array
        int pivot = partition(array, start, end);
        if (start < pivot - 1) {
            // call quickSort recursively
            quickSort(array, start, pivot - 1);
        }
        if (pivot < end) {
            // call quickSort recursively
            quickSort(array, pivot, end);
        }
    }
    private int partition(int[] array, int start, int end) {
        int i = start;
        int j = end;
        int temp;
        // pivot is middle index
        int pivot = array[(start + end) / 2];
        // make left less than pivot and right greater than pivot
        while (i <= j) {
            // check until all values on left side are than pivot
            while (array[i] < pivot) {
                i++;
            }
            // check until all values on right side are higher than pivot
            while (array[j] > pivot) {
                j--;
            }
            // compare values from both sides of pivot to see if they
            // should swap. After swap, move to next element on both sides.
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return i; // return i as new pivot
    }
    public int linearSearch(int key, int[] array)
    {
        int counter = 0;
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("comparison: " + ++counter);
            if (key == array[i]){
                return i;
            }
        }
        return -1;
    }
}
