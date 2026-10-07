package day01;

/**
 * day01：自我介绍——变量与字符串拼接的第一课。
 * <p>
 * 这里出现了三种不同的变量类型：
 * <ul>
 *   <li>{@code String}（字符串）：姓名、爱好，要用双引号包起来</li>
 *   <li>{@code int}（整数）：年龄</li>
 * </ul>
 * 再用 {@code +} 把文字和变量拼成一句话打印出来，这也是最容易踩坑的地方——
 * 拼字符串时 {@code +} 是"连接"，算数字时 {@code +} 才是"相加"，写法一样、意思不一样。
 * <p>
 * 运行结果（屏幕上会看到三行）：
 * <pre>
 * 我叫杨训杰,今年18岁
 * 我的爱好是打篮球和运动
 * 我的目标是做出自己的 AI Agent
 * </pre>
 *
 * @author 杨训杰
 */
public class Intro {

    /**
     * 程序入口：拼出三句自我介绍。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        String name = "杨训杰";
        int age = 18;
        String hobby = "打篮球和运动";

        System.out.println("我叫" + name + ",今年" + age + "岁");
        System.out.println("我的爱好是" + hobby);
        System.out.println("我的目标是做出自己的 AI Agent");
    }
}
