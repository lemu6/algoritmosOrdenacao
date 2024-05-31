package AlgoritmosDeOrdenacao;

public class Merge {
    public static void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int[] temp = new int[array.length];
        mergeSort(array, temp, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, temp, left, mid);
            mergeSort(array, temp, mid + 1, right);
            merge(array, temp, left, mid, right);
        }
    }

    private static void merge(int[] array, int[] temp, int left, int mid, int right) {
        // Copia os elementos para o array temporário
        for (int i = left; i <= right; i++) {
            temp[i] = array[i];
        }

        // Índices iniciais para o primeiro, segundo e merged arrays
        int i = left;
        int j = mid + 1;
        int k = left;

        // Mescla os dois arrays temporários de volta no array original
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes do primeiro array temporário, se houver
        while (i <= mid) {
            array[k] = temp[i];
            k++;
            i++;
        }
    }
}
