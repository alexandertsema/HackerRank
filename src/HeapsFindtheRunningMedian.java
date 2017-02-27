import java.util.*;
import java.util.Comparator;

/**
 * Created by Alex on 2/26/2017.
 */

class MaxHeapComparator implements Comparator<Integer>
{
    public int compare(Integer x, Integer y)
    {
        return y - x;
    }
}

public class HeapsFindtheRunningMedian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(n);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(n, new MaxHeapComparator());

        double median = 0;
        for(int a_i=0; a_i < n; a_i++){
            // init
            int element = in.nextInt();
            if (minHeap.size() == 0 && maxHeap.size() == 0) {
                minHeap.add(element);
                median = element;
                System.out.println(median);
                continue;
            }
            // insert new element
            if (element < median)
                maxHeap.add(element);
            else
                minHeap.add(element);
            // re-balancing
            if (Math.abs(minHeap.size() - maxHeap.size()) > 1){
                if (minHeap.size() > maxHeap.size())
                    maxHeap.add(minHeap.poll());
                else
                    minHeap.add(maxHeap.poll());
            }
            // find median
            if (Math.abs(minHeap.size() - maxHeap.size()) >= 1) {
                if (minHeap.size() > maxHeap.size())
                    median = minHeap.peek();
                else if (minHeap.size() < maxHeap.size())
                    median = maxHeap.peek();
            }
            else if (Math.abs(minHeap.size() - maxHeap.size()) == 0){
                median = (double)(minHeap.peek() + maxHeap.peek()) / 2;
            }

            System.out.println(median);
        }
    }
}
