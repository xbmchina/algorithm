package cn.xbmchina.sort;

/**
 * 插入排序算法
 * https://blog.csdn.net/qq_42857603/article/details/81605124
 */
public class InsertSortDemo {

    public static void insertionSort(int[] a) {
        int i, j, k, temp;
        for (i = 1; i < a.length; i++) {
            temp = a[i];
            j = i - 1;
            while (j >= 0 && temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }


    public static void main(String[] args) {
        int[] myArray = {18, 91, 38, 77, 36, 55, 74, 30, 2, 41};
        System.out.println("排序前的数组为:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        insertionSort(myArray);
        System.out.println();
        System.out.println("排序后的数组为:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

    }
}


