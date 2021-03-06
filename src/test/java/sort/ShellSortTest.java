package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ShellSortTest {

    @Test
    public void sort() {
        int[] array = {3, 1, 4, 6, 5, 8, 7, 9, 2};
        System.out.println("排序前：" + Arrays.toString(array));

        ShellSort shellSort = new ShellSort();
        shellSort.sort(array);
        System.out.println("排序后：" + Arrays.toString(array));
    }
}