import java.util.Arrays;

/**
 * Created by Alex on 2/26/2017.
 */
public class BinarySearchIceCreamParlor {
    public BinarySearchIceCreamParlor() {
    }

    public void findIterative(E value) {
        // Initial values
        int left = 0;
        int right = array.length - 1;
        int index = -1;

        // While there is a section having length > 0 to search
        while(left <= right && index < 0) {
            int mid = left + ((right - left) / 2);

            // If value is found
            if(array[mid] == value) {
                index = mid;
                break;
            }
            // If value < array[mid], search left
            else if(value.compareTo(array[mid]) < 0) {
                // search left
                right = mid - 1;
            }
            else { // If value > array[mid], search right
                left = mid + 1;
            }
        }
    }
}
