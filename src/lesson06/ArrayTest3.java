package lesson06;

/**
 * lesson06：数组遍历 + 分支修改。
 * <p>
 * 题目：定义数组存储 1~10，遍历取出每个元素：
 * 奇数扩大 2 倍，偶数缩小为原来的一半，然后逐个打印结果。
 * <p>
 * 注意：这里只改变打印出来的结果，原数组元素本身并未被修改。
 *
 * @author 杨训杰
 */
public class ArrayTest3 {

    /**
     * 程序入口：按奇偶规则换算数组元素并打印。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            int result;

            // 奇数：扩大二倍；偶数：缩小二分之一
            if (arr[i] % 2 != 0) {
                result = arr[i] * 2;
            } else {
                result = arr[i] / 2;
            }

            System.out.println(result);
        }
    }
}
