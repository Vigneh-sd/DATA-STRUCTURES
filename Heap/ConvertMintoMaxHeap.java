public class ConvertMintoMaxHeap {

    public static void heapify(int[] a, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && a[left] > a[largest]) largest = left;
        if (right < n && a[right] > a[largest]) largest = right;

        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            heapify(a, n, largest);
        }
    }


    public static void convertToMaxHeap(int[] a) {
        int n = a.length;

        for (int i = (n - 2) / 2; i >= 0; i--) {
            heapify(a, n, i);
        }
    }

    public static void main(String[] args) {
        int[] minHeap = {1, 3, 5, 7, 9, 6}; 

        convertToMaxHeap(minHeap);  

        System.out.print("Max-Heap: ");
        for (int val : minHeap) {
            System.out.print(val + " ");
        }
    }
}
