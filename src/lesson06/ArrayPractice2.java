package lesson06;

/**
 * lesson06：数组求最大值（课堂随练版）。
 * <p>
 * 数组内容写死为 {@code {1, 2, 3, 4, 5}}，用「先假设第一个元素最大，再逐个比较更新」
 * 的方式找出最大值。
 * <p>
 * 对比参考：lesson07 的 {@code ArrayMax} 是同一个题目的留白版本。
 *
 * @author 杨训杰
 */
public class ArrayPractice2 {

    /**
     * 程序入口：遍历数组找出并打印最大值。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int max = arr[0]; // 临时认为 0 索引上的元素最大
        for (int i = 0; i < arr.length; i++) {
            // 依次取出每个元素与 max 比较，比 max 大就把 max 更新掉
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
