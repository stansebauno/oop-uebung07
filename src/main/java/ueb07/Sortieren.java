package ueb07;

import java.util.Comparator;

public class Sortieren {
    static <T> void swap(T[] a, int i, int g) {
        T h = a[i];
        a[i] = a[g];
        a[g] = h;
    }

    static <T extends Comparable<T>> void bubbleSort(T[] a) {
        for (int n = a.length; n > 1; --n) {
            for (int i = 0; i < n - 1; ++i) {
                if (a[i].compareTo(a[i + 1]) == 1) {
                    swap(a, i, i + 1);
                }
            }
        }
    }

    static <T extends Comparable<T>> void bubblesort(T[]a, Comparator<T> b)
    {
        for (int n = a.length; n > 1; --n) {
            for (int i = 0; i < n - 1; ++i) {
                if (b.compare(a[i], a[i+1]) == 1) {
                    swap(a, i, i + 1);
                }
            }
        }
    }
}