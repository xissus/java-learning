package day03;

import java.util.Scanner;

/**
 * day03：switch 列举选项——输入 1~7，打印这一天做什么运动。
 * <p>
 * <b>题目：</b>输入今天是星期几（1~7），输出这一天的运动安排。
 * <p>
 * <b>为什么这里用 {@code switch} 而不是 {@code if}？</b> 这是课堂上专门记下来的一条：
 *
 * <pre>
 * 判断范围（如「95~100 分」）   → 用 if - else if
 * 列举几个固定选项供人挑选     → 用 switch
 * </pre>
 *
 * 「星期一、星期二……」正好是**七个固定的选项**，不是「大于几、小于几」的范围， 所以 {@code switch} 是最合适的写法。同包的
 * {@code Score} 判分数段，用的就是 {@code if - else if}。
 * <p>
 * <b>{@code default} 这里写对了：</b>输入 8 或者 99 这种不存在的星期， 程序会回一句 {@code 没有这个星期} ——
 * 老老实实告诉用户「我不认识这个输入」。 同包的 {@code UserChoose} 在这一点上就写岔了，可以对照着看。
 * <p>
 * <b>{@code break} 一个都不能少：</b>每个 {@code case} 末尾的 {@code break}
 * 负责「办完事就走」。少了它，程序会顺着往下继续执行别的 {@code case}， 这种现象叫「{@code case} 穿透」。不过穿透也有正经用法
 * —— 课堂上那条「利用 case 穿透简化程序（判断一周的工作日 / 休息日）」用的就是它， 想想这个文件该怎么改才能变成「1~5 打印上班、6~7
 * 打印休息」？
 * <p>
 * <b>运行后你会看到：</b>
 *
 * <pre>
 * 请输入今天的星期
 * 打篮球              （输入 5）
 * 没有这个星期        （输入 8）
 * </pre>
 *
 * @author 杨训杰
 */
public class WeekSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入今天的星期");
		int week = sc.nextInt();
		// switch 的标准结构：把「比较的值」放进括号里，
		// 下面一个个 case 列出「可能是什么」，最后用 default 兜住所有没列出来的值。
		switch (week) {
		case 1:
			System.out.println("跑步");
			break;
		case 2:
			System.out.println("做操");
			break;
		case 3:
			System.out.println("踢足球");
			break;
		case 4:
			System.out.println("羽毛球");
			break;
		case 5:
			System.out.println("打篮球");
			break;
		case 6:
			System.out.println("跳绳");
			break;
		case 7:
			System.out.println("游泳");
			break;
		// default：所有 case 都没命中时走这里。
		// 它接的是「用户输错了」——所以要说「没有这个星期」，而不是随便编一个答案。
		default:
			System.out.println("没有这个星期");
			break;

		}
	}

}
