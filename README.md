# java-learning

Java 从零起步的学习记录，从 `day01` 的 Hello World 写到 `lesson07` 的数组综合题。

运行环境：JDK 17、Eclipse、文件编码 UTF-8。

## 关于这个仓库

这是我从 2026 年 9 月开始学 Java 之后一课一课敲下来的代码。

放上来的原因有两个。一个是给自己留记录，隔几个月回头看，能发现自己是在哪一步开始走歪的。另一个是如果你也零基础起步，这里的注释是按「我当时卡在哪儿、想通的时候是什么感觉」写的，可能比教材容易读一点。

有件事得先说清楚：**代码都是自己敲的，包括里面那些写错了、后来被我故意留下来的地方。README 和 `docs/` 下的文档是在 AI 助手辅助下整理的** —— 我敲代码还行，写说明书太慢。代码我都能逐行讲清楚；文档你读的时候可以自己判断，觉得和代码对不上，以代码为准。

目录顺序大概是：`day01` → `day02` → `day03` → `lesson01` ~ `lesson07`，是实际的学习顺序。`other/` 里是课程之外自己找的题。

## 怎么跑起来

### 用 Eclipse

1. 菜单 `File` → `Import...` → `General` → `Existing Projects into Workspace`，点 `Next`；
2. `Select root directory` 选这个仓库的文件夹（能看到 `src` 的那一层），点 `Finish`；
3. 左边展开 `src`，找到某一课，双击打开 `.java` 文件；
4. 右键 → `Run As` → `Java Application`（或者按 `Ctrl + F11`）；
5. 程序在下面的 Console 里跑。需要输入时，先点一下 Console 再打字。

### 用命令行

在能看见 `src` 的那一层打开终端，以 `day01/Sum100.java` 为例：

```bash
# 编译，结果输出到 bin 目录
javac -encoding UTF-8 -d bin src/day01/Sum100.java

# 运行，类名前面必须带上包名
java -cp bin day01.Sum100
```

换成别的文件同理，`day01.Sum100` 改成对应的包名加点类名，比如 `lesson06.ArrayTest1`。

### 报错了怎么办

| 屏幕上的提示 | 大概是哪里出的问题 |
| --- | --- |
| 中文变成 `????` 或者乱码 | 编码不一致。Eclipse 里把项目的 Text file encoding 设成 UTF-8；命令行先执行 `chcp 65001` |
| `找不到或无法加载主类` | 类名前面漏了包名。要写 `day01.Sum100`，不是 `Sum100` |
| `错误: 需要 class, interface 或 enum` | 大括号不配对。用 Eclipse 的括号高亮沿着找一遍 |
| `找不到符号` | `import` 没写，或者变量名拼错了 |
| 光标一直停着，像卡住了 | 它在等你输入。点一下控制台再打字、回车 |

## 目录

```
src/
├── day01/      最早的 7 个练习（那时还没用 Eclipse）
├── day02/      转到 Eclipse 之后的 12 个练习
├── day03/      选择结构专题：if-else、多分支、switch
├── lesson01/   猜数字游戏
├── lesson02/   键盘输入
├── lesson03/   判断大小
├── lesson04/   循环猜三次
├── lesson05/   方法的定义与调用
├── lesson06/   数组
├── lesson07/   数组综合题（课堂上跟着敲的）
├── other/      课程之外自己找的练习题
└── utils/      工具类，留给后面的课用

docs/
├── 课程导读.md            每一课在练什么、运行起来会看到什么
└── 如何提交代码.md         Git 提交入门（四条命令）
```

`bin/` 是 Eclipse 自动生成的编译结果，不用手动管，也不会上传。

## 各课在练什么

| 目录 | 覆盖到的知识点 |
| --- | --- |
| day01 | 打印语句、变量与字符串拼接、`if-else`、`for` 循环、累加器 |
| day02 | 四种变量类型、整数除法、取余、`Scanner`、闰年判断、方法抽取、循环嵌套 |
| day03 | `if-else`、`if` 嵌套、`if - else if - else` 多分支、`switch` 与 `case` 穿透 |
| lesson01 | 第一个综合小程序：随机数、`while`、`break` / `continue`、输入校验、标记位 |
| lesson02 | 用 `Scanner` 读一个整数 |
| lesson03 | `if - else if - else` 三分支 |
| lesson04 | `while` 循环 + 次数控制 |
| lesson05 | 方法的定义、调用、`return` 返回值 |
| lesson06 | 数组的声明与初始化、索引、`length`、遍历、常见统计操作 |
| lesson07 | 数组综合题：求最大值、随机数统计 |
| other | 一元二次方程求根、强制类型转换、布尔标志变量、累乘、同一道题的两种解法 |

每一课具体在练什么、运行起来会看到什么、哪儿可以自己动手改，写在 [docs/课程导读.md](./docs/课程导读.md) 里。这份 README 只列到目录级别，不重复那边的细节。

## 工具类 `utils`

初学阶段有个现象：读一个合法整数的代码，几乎每个程序都要重写一遍。所以把这类反复出现的代码收进了 `src/utils/`。

| 类 | 方法 |
| --- | --- |
| `InputUtils` | `readInt`（一直问到是整数为止）、`readIntInRange`（再加范围限制）、`readIntInRangeOrExit`（读到指定值就退出）、`readWord`（读一个不含空格的词） |
| `ArrayUtils` | `sum`、`average`、`max`、`min`、`countDivisibleBy`、`print` |

用法：

```java
Scanner sc = new Scanner(System.in);

int[] scores = new int[5];
for (int i = 0; i < scores.length; i++) {
    scores[i] = InputUtils.readIntInRange(sc, "请输入第" + (i + 1) + "个成绩：", 0, 100);
}

System.out.println("总分：" + ArrayUtils.sum(scores));
System.out.println("平均分：" + ArrayUtils.average(scores));
```

`day01` 到 `lesson07` 的代码没有改成调用工具类，保持独立。那几课是自己一行行写循环和判断才真正学会的，换成调方法就跳过了练习。工具类留给后面的课程。

## 代码约定

- 缩进用 Tab。这是 Eclipse 按 `Ctrl + Shift + F` 排版后的默认结果，跟着工具走，才不会出现「排一次版、提交一堆格式改动」。
- 类名大驼峰（`ArrayDemo1`），变量和方法小驼峰（`maxAttempts`、`readInt`）。
- 左大括号跟在语句同一行末尾，不另起一行。
- 每个类顶部写清这个文件在练什么；方法用 `/** ... */` 写参数和返回值。
- 一个文件一个类，文件名和 `public class` 的名字大小写完全一致。
- `day01` ~ `lesson07`、`other` 里的代码不引入还没学过的语法（不用 `static final` 常量、不用泛型、不用 Lambda），宁可写法朴素一点，保证每一行现在就能看懂。`utils/` 不受这条限制，工具类该有 `final class` 和私有构造。

## 进度

已完成：环境搭建（JDK、Eclipse、GitHub 工作流）、基础语法（变量、运算符、分支、循环）、方法、数组。

接下来：面向对象 → 集合框架与异常处理、IO 流、Maven → MySQL → Spring Boot → Spring AI / LangChain4j。最终想做的事是用 Java 写 AI Agent。

## 许可证

[MIT](./LICENSE)。

## 作者

杨训杰，大数据管理与应用专业，在自学 Java 和 AI Agent 开发。

相关仓库：[python-learning](https://github.com/xissus/python-learning)（Python 部分，专业课程后续要用）。
