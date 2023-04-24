package Week11;

import java.util.ArrayList;

public class BinarySearchArray {
    int binarySearch(ArrayList<Integer> array, int key) {
        int left = 0, right = array.size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (array.get(mid) == key)
                return mid;

            if (array.get(mid) <key)
                left = mid + 1;

            else
                right = mid - 1;
        }
        return -1;
    }
}

