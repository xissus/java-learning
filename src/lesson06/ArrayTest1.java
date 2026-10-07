package lesson06;

/**
 * lesson06：数组遍历求和。
 * <p>
 * 题目：定义数组存储 1、2、3、4、5，遍历取出每个元素，求所有元素的和。
 *
 * @author 杨训杰
 */
public class ArrayTest1 {

    /**
     * 程序入口：遍历数组累加求和并打印。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        // 1、定义数组并添加数据
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        // 2、遍历数组取出每一个数据，逐个累加
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // 循环结束后，sum 的值就是所有元素的和

        System.out.println("总和是：" + sum);
    }
}
