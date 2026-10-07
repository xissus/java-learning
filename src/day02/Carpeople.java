package day02;

/**
 * day02：变量累加练习（模拟车上人数变化）。
 * <p>
 * 用一个 count 变量记录人数，然后按顺序执行几步增减，最后打印结果。
 * 考察的是「变量会记住上一次的值」这件事——每一行都是在上一步的结果上继续算。
 * <p>
 * 计算过程：0 → 1 → (1+3-2)=2 → (2+6)=8 → (8+2-4)=6，所以最终输出 6。
 *
 * @author 杨训杰
 */
public class Carpeople {

    /**
     * 程序入口：按顺序累加人数并打印最终结果。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        int count = 0;
        count = count + 1;
        count = count + 3 - 2;
        count = count + 6;
        count = count + 2 - 4;

        System.out.println(count);
    }
}
