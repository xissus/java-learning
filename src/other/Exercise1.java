package other;

import java.util.Scanner;//使用Scanner时先导包

/**
 * other：按正负给一个数「打折」——输入一个整数，是正数就输出它的 60%，否则原样输出。
 * <p>
 * <b>题目：</b>编写一个程序，输入一个整数，如果整数大于 0，则输出整数的 60%， 否则输出这个整数本身。
 * <p>
 * <b>这一课专门练 {@code boolean} 标志变量：</b>不在 {@code if} 里当场把事情办掉，
 * 而是先把「这个数是不是正数」这个状态记进一个布尔变量（{@code a}）， 再回头看这个变量决定走哪条路。写法上绕了一点，但「先记状态、后面再判断」
 * 在真实项目里非常常见 —— 你在 lesson01 猜数字里记录「有没有猜中」用的就是同一个套路。
 * <p>
 * <b>60% 怎么算：</b>直接乘 {@code 0.6}（60% 就是 0.6）。 之所以不写成 {@code num * 60 / 100}，是因为
 * {@code 60 / 100} 两个数都是整数， 会被整数除法砍成 {@code 0}，结果永远是 0 —— day01、day02 都踩过这个坑。
 * <p>
 * <b>运行后你会看到：</b>
 *
 * <pre>
 * 输入 100  → 结果60.0
 * 输入 0    → 结果为0
 * 输入 -5   → 结果为-5
 * </pre>
 * <p>
 * <b>踩坑记录（已自己改对）：</b>最初 {@code else} 被写在了 {@code if (num > 0)} 的
 * 大括号<b>里面</b>，结果输入 0 或负数时程序什么都不打印 —— 因为外面那个 {@code if} 一旦不成立，里面的 {@code else}
 * 根本轮不到执行， 整段就被跳过去了。后来把 {@code else} 挪出来、跟 {@code if (a)} 写成平级，
 * {@code num <= 0} 这条退路才终于有人管。 一句话记住：<b>{@code else} 只会跟离它最近的那个 {@code if}
 * 配对</b>， 大括号画到哪儿，答案就在哪儿。
 * <p>
 * <b>变量名的小建议：</b>布尔变量最好取个一眼能看出意思的名字（比如 {@code isPositive}）， 同包的
 * {@code Exercise2} 里就是这么起的；这里叫 {@code a}，只要自己回头看得懂也行。
 *
 * @author 杨训杰
 */
public class Exercise1 {

	public static void main(String[] args) {
		// 需求：输入一个整数，如果它大于 0，就输出这个数的 60%；
		// 否则（0 或负数）原样输出这个数

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = sc.nextInt();

		// 标志变量：先默认「它不是正数」，确认 num > 0 之后再改成 true。
		// 这种「先把状态记下来、后面再拿来判断」的写法，
		// 好处是一个 if (a) 就能分出两条路，不用把条件写两遍。
		boolean a = false;
		if (num > 0) {
			a = true; // 确认是正数了，把状态改掉
		}

		// 回头看刚才记下的状态，决定走哪条路。
		// 注意这个 if 要和它下面的 else 平级 —— 位置错了，0 和负数就会没人管。
		if (a) {
			// 60% 就是乘 0.6；用 double 存结果，小数才不会被砍掉
			double result = (double) (num * 0.6);
			System.out.println("结果" + result);
		} else {
			// 不是正数的情况：0 和负数都走到这里，原样输出
			System.out.println("结果为" + num);
		}

		sc.close(); // 用完了把 Scanner 关掉，养成好习惯
	}

}
