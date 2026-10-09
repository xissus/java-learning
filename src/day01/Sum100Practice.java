package day01;

/**
 * day01：求和练习——把 1 加到 100（我的练习记录）。
 * <p>
 * 这个文件原本是<b>留白版</b>：循环体里只有一句 TODO，留着自己动手补。
 * 后来我自己把「把 i 加到 sum 上」这一步写了出来（就是循环体里那句），
 * 所以它现在<b>已经写完了</b>，运行结果是「总和是5050」。
 * <p>
 * 为什么还留着它？因为它记录了「从留白到自己写出来」的过程 ——
 * 对比同目录的 {@code Sum100.java}，你会看到两者现在一模一样，
 * 这说明我当时确实写对了。
 *
 * @author 杨训杰
 */
public class Sum100Practice {

	/**
	 * 程序入口：循环 1 到 100 累加并输出总和。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i = i + 1) {
			// 这一句原本是个 TODO，留着自己写；我写出来的就是下面这一行
			sum = sum + i;
		}

		System.out.println("总和是" + sum);
	}
}
