package ueb07;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SortierenTest {
    @Test
    void testSwap() {
        Integer[] a = {1, 2, 3};
        Sortieren.swap(a, 0, 1);
        assertEquals(1, (int) a[1]);
        assertEquals(2, (int) a[0]);
        assertEquals(3, (int) a[2]);
    }

    @Test
    void testBubble1() {
        Integer[] a1 = {4, 2, 3, 1};
        Integer[] ref1 = {1, 2, 3, 4};

        Sortieren.bubbleSort(a1);

        assertArrayEquals(ref1, a1);

        Student s1 = new Student(1, "Sarah");
        Student s2 = new Student(2, "Peter");
        Student s3 = new Student(3, "Anna");
        Student s4 = new Student(4, "Hans");

        Student[] a2 = {s4, s2, s3, s1};
        Student[] ref2 = {s1, s2, s3, s4};

        Sortieren.bubbleSort(a2);
        assertArrayEquals(ref2, a2);
    }}
