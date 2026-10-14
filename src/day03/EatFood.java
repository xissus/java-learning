package day03;

import java.util.Scanner;

/**
 * day03：用 {@code if - else} 做最简单的二选一——钱多去网红餐厅，钱少去吃沙县小吃。
 * <p>
 * <b>题目：</b>输入身上带的钱，大于 100 元就提示去网红餐厅，否则提示吃沙县小吃。
 * <p>
 * <b>这里最值得盯住的是那个 {@code >} 号：</b>写成 {@code >}，表示「正好 100 元」的人走
 * {@code else}，也就是去吃沙县小吃。等于（边界值）到底算哪一边，写之前先想好 ——
 * 这是后面做分数段、年龄段判断时最容易出错的地方。
 * <p>
 * <b>和 {@code Pay} 对着看：</b>两个程序长得几乎一模一样，只差一个等号而已。
 *
 * <pre>
 * Money &gt;  100   →  正好 100 元算「吃沙县小吃」
 * Money &gt;= 600   →  正好 600 元算「付款成功」
 * </pre>
 * <p>
 * <b>运行后你会看到：</b>
 *
 * <pre>
 * 请输入身上的钱
 * 去网红餐厅          （输入 101）
 * 吃沙县小吃          （输入 100）
 * </pre>
 * <p>
 * <b>一句小提醒：</b>变量名 {@code Money} 首字母大写不太符合 Java 的习惯 —— 变量名应该用小驼峰
 * {@code money}，大写开头留给类名。程序能正常跑，等写顺了再改过来就行。
 *
 * @author 杨训杰
 */
public class EatFood {

	public static void main(String[] args) {
		// 创建一个 Scanner 用来读键盘输入（写这一行之前要先 import java.util.Scanner;）
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入身上的钱");
		// 读入一个整数，存进变量 Money
		int Money = sc.nextInt();

		// 钱「大于」100 才去网红餐厅。
		// 注意是 > 不是 >=，所以正好 100 元的人会走下面的 else —— 等于算哪边，先想清楚再写。
		if (Money > 100) {
			System.out.println("去网红餐厅");
		} else {
			// 剩下的情况全都会进这里：钱 <= 100
			System.out.println("吃沙县小吃");
		}
	}
}
