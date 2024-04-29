public class Practice {
    // 划分
    private static int partition(int low, int high, int[] arr) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot)
                high--;

            arr[low] = arr[high];

            while (low < high && arr[low] <= pivot)
                low++;
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }

    // 快排
    private static void quickSort(int low, int high, int[] arr) {
        if (low < high) {
            int position = partition(low, high, arr);
            quickSort(low, position - 1, arr);
            quickSort(position + 1, high, arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 76, 13, 27, 49};
        quickSort(0, arr.length - 1, arr);
        for (int num : arr) {
            System.out.print(num + "\t");
        }
    }

}