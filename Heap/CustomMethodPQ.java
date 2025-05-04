class MinHeap {
    int[] heap;
    int size;

    public MinHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int val) {
        heap[size] = val;
        int i = size;
        size++;
        while (i > 0 && heap[i] < heap[(i - 1) / 2]) {
            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public int remove() {
        if (size == 0) return -1;
        int min = heap[0];
        heap[0] = heap[--size];
        heapify(0);
        return min;
    }

    private void heapify(int i) {
        int smallest = i;
        int left = 2 * i + 1, right = 2 * i + 2;
        if (left < size && heap[left] < heap[smallest]) smallest = left;
        if (right < size && heap[right] < heap[smallest]) smallest = right;
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        int t = heap[i];
        heap[i] = heap[j];
        heap[j] = t;
    }
}
