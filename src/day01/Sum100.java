package day01;

/**
 * day01：for 循环 + 累加求和——计算 1 加到 100。
 * <p>
 * 这是最经典的循环入门题，也是第一次接触「累加器」这个思路：
 * 先把 sum 设为 0，然后每轮循环把 i 加进去。
 * <p>
 * 运行结果：总和是 5050。
 *
 * @author 杨训杰
 */
public class Sum100 {

    /**
     * 程序入口：计算 1~100 的累加和。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i = i + 1) {
            sum = sum + i;
        }

        System.out.println("总和是" + sum);
    }
}
