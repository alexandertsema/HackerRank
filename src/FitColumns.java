import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Alex on 2/27/2017.
 */
public class FitColumns {
    public static void main(String[] args) {
        int w = 70;
//        int w = 10;
        String[] arr = {"IsAudioBuffer", "GetTimestamp", "SetTimestamp", "GetSampleRate", "GetSampleSize", "GetNumberOfChannels", "GetNumberOfSamples", "GetDataBuffer", "GetChannel", "GetNumberOfChannels", "GetNumberOfChannels"};
        // 13 12 12 13 13 19 18 13 10
//        String[] arr = {"IsAudioBuffer123123121212123123", "GetTimestamp", "SetTimestamp8787", "GetSampleRate", "GetSampleSize", "GetNumberOfChannels", "G", "GetDataBuffer", "GetChannel"};
//        String[] arr = {"Longer", "A", "B", "Longer", "C", "D"};
        System.out.println(getColumns(arr, w));
        willFit(arr, w,4);
    }
    /**
     * returns the maximum number of columns
     * which can be built from the given Array of strings arr
     * where the maximum number of characters in the row is w
     **/
    static int getColumns(String arr[], int w){
        int counterMax = 1;
        for (int i = 0; i < arr.length; i++) {
            int counter = 1;
            String element = arr[i];
            int maxColumnLength = element.length();

            if (maxColumnLength > w)
                return 0;
            if (maxColumnLength == w)
                return 1;

            int totalLength = maxColumnLength;
            for (int j = i + 1; j < arr.length; j++) {
                String nextElement = arr[j];
                int elementLength = nextElement.length();
                totalLength += elementLength;
                if (totalLength < w)
                    counter++;
                else break;
            }
            counterMax = counter < counterMax ? counter : counterMax;
            i += counterMax - 1;
        }
        return counterMax;
    }

    static boolean willFit(String arr[], int w, int columns){
        int maxColumnLength = arr[0].length();
        int maxTotalLength = maxColumnLength;
        int i = 0;
        while (maxTotalLength <= w){
            if(arr[i].length() > maxColumnLength)
                maxColumnLength = arr[i].length();

        }
        return true;
    }
}
