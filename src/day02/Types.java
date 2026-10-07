package day02;

/**
 * day02：变量与数据类型练习。
 * <p>
 * 一次定义四种最常用的类型：整数 {@code int}、小数 {@code double}、
 * 真假值 {@code boolean}、字符串 {@code String}。
 * 并用「字符串 + 变量」的拼接方式把信息打印出来。
 *
 * @author 杨训杰
 */
public class Types {

    /**
     * 程序入口：定义四种类型的变量并拼接输出。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        int age = 18;
        double height = 1.78;
        boolean isStudent = true;
        String name = "杨训杰";

        System.out.println(name + " " + age + "岁" + height + "米");
        System.out.println("还是学生吗？" + isStudent);
    }
}
