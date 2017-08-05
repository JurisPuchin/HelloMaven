public class Sorting {

    /**
     * Sorts the input array in place using quicksort.
     * @param ar An array to sort.
     */
    public static void quickSort(int[] ar)
    {
        quickSortHelper(ar, 0, ar.length - 1);
    }

    /**
     * Recursive in-place quicksort implementation.
     * @param ar array to be sorted
     * @param start start of the section to be sorted
     * @param fin end of the section to be sorted
     */
    private static void quickSortHelper(int[] ar, int start, int fin)
    {
        int pivot = ar[(start + fin) / 2];
        int i = start;
        int j = fin;

        while (i <= j) {
            while (ar[i] < pivot) i++;
            while (ar[j] > pivot) j--;

            if ( i <= j)
            {
                int tmp = ar[i];
                ar[i++] = ar[j];
                ar[j--] = tmp;
            }
        }
        if (start < j) quickSortHelper(ar, start, j);
        if (fin > i) quickSortHelper(ar, i, fin);
    }
}
