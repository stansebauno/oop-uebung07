package ueb07;

import java.util.Comparator;

class Sortieren {
	static <T> void swap(T[] a, int i, int j) {
		T h = a[i];
		a[i] = a[j];
		a[j] = h;
	}

	static <T extends Comparable<T>> void bubbleSort(T[] a) {
		for (int n = a.length; n > 1; n--) {
			for (int i = 0; i < n - 1; i++) {
				if (a[i].compareTo(a[i + 1]) > 0)
					swap(a, i, i + 1);
			}
		}
	}

	static <T> void bubbleSort(T[] a, Comparator<T> c) {
		for (int n = a.length; n > 1; n--) {
			for (int i = 0; i < n - 1; i++) {
				if (c.compare(a[i], a[i + 1]) > 0)
					swap(a, i, i + 1);
			}
		}
	}
}
