package day03;

import java.util.Scanner;

/**
 * day03：付款够不够——读入付款金额，600 元及以上算支付成功，否则失败。
 * <p>
 * <b>题目：</b>输入付款金额，如果大于等于 600 就提示付款成功，否则提示付款失败。
 * <p>
 * <b>和 {@code EatFood} 对着看，重点在那一对符号：</b> 这里用的是「大于等于」{@code >=}，{@code EatFood}
 * 用的是「大于」{@code >}。
 *
 * <pre>
 * Money &gt;= 600   →  正好 600 元算「付款成功」
 * Money &gt;  100   →  正好 100 元算「吃沙县小吃」
 * </pre>
 *
 * 两个程序长得几乎一模一样，只差一个等号，结果却不一样 —— 这就是写判断时「等于归哪边」这个问题的重要性。
 * <p>
 * <b>运行后你会看到：</b>
 *
 * <pre>
 * 请输入付款金额
 * 付款成功            （输入 600）
 * 付款失败            （输入 599）
 * </pre>
 * <p>
 * <b>一个真实的思考题：</b>现在的模型是「钱够就成功」。 那如果付款金额是 {@code -100} 呢？程序会告诉你「付款失败」，
 * 可「负数金额」根本不是一个正常的输入 —— 真正做产品时， 得先挡住这种「不可能的值」，再判断够不够。想想该怎么加。
 *
 * @author 杨训杰
 */
public class Pay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入付款金额");
		// 读入付款金额
		int Money = sc.nextInt();

		// 注意这里是「大于等于」>= ：正好 600 元也算付款成功。
		// 和 EatFood 的 > 比一比，只差一个等号 —— 等于归哪边，写之前先定好。
		if (Money >= 600) {
			System.out.println("付款成功");
		} else {
			System.out.println("付款失败");
		}
	}
}
