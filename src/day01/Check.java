package day01;

/**
 * day01：if-else 分支练习——根据温度给出提示。
 * <p>
 * 这是最早期写的一批练习之一，当时还没用 Eclipse，所以文件在命令行里直接编译运行。
 * 温度写死为 34，大于 30 就提示「注意防暑」，否则提示「天气还不错」。
 *
 * @author 杨训杰
 */
public class Check {

    /**
     * 程序入口：判断温度并输出提示。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        int temperature = 34;

        if (temperature > 30) {
            System.out.println("今天真热，注意防暑");
        } else {
            System.out.println("今天天气还不错");
        }
    }
}
