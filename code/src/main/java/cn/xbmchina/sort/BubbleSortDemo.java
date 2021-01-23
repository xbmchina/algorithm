package cn.xbmchina.sort;

/**
 * 冒泡排序
 */
public class BubbleSortDemo {

    public static void main(String[] args) {
        int[] myArray = {18, 91, 38, 77, 36, 55, 74, 30, 2, 41};
        System.out.println("排序前的数组为:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        //冒泡排序算法
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - 1 - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组为:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
