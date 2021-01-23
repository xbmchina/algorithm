package cn.xbmchina.sort;

/**
 * 排序算法
 */
public class SelectSortDemo {

    public static void main(String[] args) {

        int[] myArray = {18, 91, 38, 77, 36, 55, 74, 30, 2, 41};
        System.out.println("排序前的数组为:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        //选择排序算法
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                int min = myArray[i];
                if (min > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
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
