import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] Array = {1, 6, 3, 1, 3, 14, 7, 9, 2};
        quickSort(Array, 0, Array.length - 1);

        for (int i = 0; i < Array.length; i++)
            System.out.print(Array[i] + ", ");
    }
    public static void Swap(int point, int i, int[] array)
    {
        int temp = array[point];
        array[point] = array[i];
        array[i] = temp;
    }

    private static void quickSort(int[] array, int left, int right)
    {
        if (left >= right) return;

        int pivot = partition(array, left, right);

        quickSort(array, left, pivot - 1);
        quickSort(array, pivot + 1, right);
    }

    public static int partition(int[] array, int left, int right)
    {
        int pivot = array[right];
        int i = left - 1;

        for (int q = left; q < right; q++)
        {
            if (array[q] < pivot)
            {
                i++;
                Swap(i, q, array);
            }
        }
        Swap(i + 1, right, array);
        return i + 1;
    }

}