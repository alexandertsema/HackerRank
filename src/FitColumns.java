import java.util.*;

/**
 * Created by Alex on 2/27/2017.
 */
public class FitColumns {
    public static void main(String[] args) {
        int w = 70;
//        int w = 10;
//        String[] arr = {"IsAudioBuffer", "GetTimestamp", "SetTimestamp", "GetSampleRate", "GetSampleSize", "GetNumberOfChannels",
//                "GetNumberOfSamples", "GetDataBuffer", "GetChannel", "GetNumberOfChannels", "GetNumberOfChannels"};
//        String[] arr = {};
        // 13 12 12 13
        // 13 19 18 13
        // 10
//        String[] arr = {"IsAudioBuffer", "GetTimestamp", "SetTimestamp8787", "GetSampleRate", "GetSampleSize", "GetNumberOfChannels", "G", "GetDataBuffer", "GetChannel"};
        String[] arr = {"A", "A", "G", "C", "D", "5555555555555555666666666666666666666666666666666666666666666666666666F"};

        System.out.println(getColumnsBinarySearch(arr, w));
        System.out.println(getColumnsRandomSearch(arr, w));
//        try {
//            System.out.println(willFit(arr, w, 1));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
    /**
     * O(n log(n))
     * */
    static int getColumnsBinarySearch(String arr[], int w) {
        int left = 0;
        int right = arr.length;
        try {
            while(left <= right) {
                int mid = left + ((right - left) / 2);
                if(!willFit(arr, w, mid)) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
        } catch (Exception e) {
            System.err.println(e);
            return 0;
        }
        return right;
    }

    /**
     * O(n^2)
     * */
    static int getColumnsRandomSearch(String arr[], int w) {
        Random rand = new Random(1024);
        int index = 0;
        if (arr.length > 1)
            index = rand.nextInt(arr.length - 1);
        if (arr.length == 0)
            return 0;
        int avgElementLng = arr[index].length();
        int avgColumns = w / avgElementLng;

        if (avgColumns > arr.length)
            avgColumns = index;

        try {
            if (willFit(arr, w, avgColumns)) {
                // move right / increase number of columns
                int col = avgColumns + 1;
                for (int i = avgColumns + 1; i < arr.length + 1; i++) {
                    if (!willFit(arr, w, i))
                        return --i;
                    else col = i;
                }
                return col;
            } else {
                // move left / decrease number of columns
                for (int i = avgColumns - 1; i > 0; i--) {
                    if (willFit(arr, w, i))
                        return i;
                }
            }
        } catch (Exception e) {
            System.err.println(e);
            return 0;
        }
        return avgColumns;
    }

    /**
     * O(n)
     * */
    static boolean willFit(String arr[], int w, int columns) throws Exception {
        int totalRowLng = 0;
        for (int i = 0; i < columns; i++) {
            int maxColLng = arr[i].length();
            if (maxColLng > w)
                throw new Exception(String.format("Element %1$s length (%2$d) is greater than max table row length (%3$d)", arr[i], arr[i].length(), w));
            for (int j = i + columns; j < arr.length; j += columns) {
                if (arr[j].length() > maxColLng)
                    maxColLng = arr[j].length();
                if (maxColLng > w)
                    throw new Exception(String.format("Element %1$s length (%2$d) is greater than max table row length (%3$d)", arr[j], arr[j].length(), w));
            }
            totalRowLng += maxColLng;
            if (totalRowLng > w)
                return false; // too many columns, need less columns
        }
        return true; // enough columns, can be even more
    }
}
