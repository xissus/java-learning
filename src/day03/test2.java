package day03;

/**
 * day03：三个并列的 {@code if}——用布尔变量表示红绿灯，看程序输出什么。
 * <p>
 * <b>这个文件在演示什么：</b>三个 {@code if} 是**各判断各的**， 谁的条件成立谁就打印，跟别的 {@code if} 没有关系。
 * 现在只有 {@code isLightGreen} 是 {@code true}，所以只打印一句 {@code GO}。
 * <p>
 * <b>但这里藏着一个值得想的问题：</b>万一有一天 {@code isLightGreen} 和 {@code isLightRed} 同时是
 * {@code true} 呢？ 那三行就会打印出两句，甚至三句 ——「GO」和「Stop」一起出现。
 * <p>
 * 红灯绿灯明明是**互斥的**（同一时刻只能是其中一种）， 所以更贴合现实的写法是 {@code if - else if - else}：
 * 那样只要有一条成立，后面的就自动跳过，不可能出现两句。 <b>什么时候该用并列 {@code if}、什么时候该用
 * {@code if - else if}， 判据就是：这几件事能不能同时发生？</b>
 * <p>
 * <b>运行后你会看到：</b>
 *
 * <pre>
 * GO
 * </pre>
 * <p>
 * <b>两个小建议（不影响运行）：</b>
 * <ul>
 * <li>类名 {@code test2} 按 Java 规范要**大写开头**，写成 {@code Test2}。 这一批里
 * {@code EatFood}、{@code FilmSeat} 都是这么写的。</li>
 * <li>这个文件里没有用 {@code Scanner}，所以也不需要导包 —— 正好和别的文件对比一下： 只有真正用到 {@code Scanner}
 * 的文件才写 {@code import java.util.Scanner;}。</li>
 * </ul>
 *
 * @author 杨训杰
 */
public class test2 {

	public static void main(String[] args) {
		boolean isLightGreen = true;
		boolean isLightRed = false;
		boolean isLightYellow = false;
		// 三个并列的 if：各判断各的，互不排斥。
		// 现在只有 isLightGreen 是 true，所以只有第二个 if 会打印。
		// 想想看：万一两个变量同时是 true，屏幕上会出现什么？
		if (isLightYellow) {
			System.out.println("Wait");
		}
		if (isLightGreen) {
			System.out.println("GO");
		}
		if (isLightRed) {
			System.out.println("Stop");
		}
	}

}
