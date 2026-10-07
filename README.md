# java-learning

> 一个「大数据管理与应用」专业大一学生的 Java 入门代码仓库。
> 从 `Hello World` 到数组遍历，每一课的代码、踩过的坑、写在注释里的思考，都留在这里。

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/)
[![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255.svg)](https://www.eclipse.org/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](./LICENSE)

---

## 一、这个仓库是给谁看的

写给**刚开始学 Java 的初学者**，也写给未来的自己。

如果你也是零基础起步，这里可能是你需要的：

- 每一课都是**一个能跑起来的小程序**，不是抽象的概念，运行一下就知道它干什么；
- 代码里的注释**按初学者的思路写**，包括「为什么这么写」和「哪些写法是坑」；
- 目录**按学习顺序排列**，`day01` → `day02` → `lesson01` ~ `lesson07`，可以照着顺序看下去；
- 学到的每个知识点都在下面的[课程导航](#四课程导航)里列清楚了，配着代码一起看最快。

**如果你是初学者，建议的阅读方式：**

1. 先看下面的[课程导航表](#四课程导航)，了解每课在学什么；
2. 按顺序打开 `src/` 里的代码，**先看类顶部的注释**（讲这课在练什么）；
3. 按[第三节](#三怎么把它跑起来)的方法把程序跑起来，改几个数字试试，看结果怎么变；
4. 看不懂的地方先别急，去看注释——代码里的注释就是给这里的你准备的。

> 关于为什么会有这个仓库、为什么坚持写注释、以及一路踩过的坑，
> 可以读一读 [docs/我的成长故事.md](./docs/我的成长故事.md)。

---

## 二、项目结构

```
java-learning/
├── src/                            # 所有源代码
│   ├── day01/                      # 最早期的练习（还没用 Eclipse，文件都没有包名）
│   │   ├── Check.java              #   if-else：按温度给提示
│   │   ├── Loop.java               #   for 循环：倒着数、每次减 2
│   │   ├── Sum100.java             #   for 循环 + 累加：1 加到 100
│   │   └── Sum200.java             #   累加练习（保留了当时「打印写在循环里」的坑）
│   ├── day02/                      # 转到 Eclipse 之后的练习（原来的包名叫 demo2）
│   │   ├── Types.java              #   变量与四种基本类型
│   │   ├── Divide.java             #   整数除法 vs 小数除法（重要的一课）
│   │   ├── Odd.java                #   取余判断奇偶
│   │   ├── Carpeople.java          #   变量的累加变化
│   │   ├── Calculation.java        #   四则运算
│   │   ├── ScannerDemo1.java       #   Scanner 基础练习
│   │   ├── Temperature1.java       #   华氏度转摄氏度
│   │   ├── MyInformation.java      #   录入个人信息（nextLine 的坑）
│   │   ├── LeapYear.java           #   判断闰年
│   │   ├── LeapYear2.java          #   闰年判断「方法化」
│   │   ├── Table99.java            #   九九乘法表（循环嵌套）
│   │   └── Test1.java              #   取三位数的个/十/百位
│   ├── lesson01/
│   │   └── GuessNumber.java        #   猜数字游戏
│   ├── lesson02/
│   │   └── GuessMini.java          #   最简单的键盘输入
│   ├── lesson03/
│   │   └── GuessCompare.java       #   if-else 判断大小
│   ├── lesson04/
│   │   └── GuessThreeTimes.java    #   while 循环猜 3 次
│   ├── lesson05/
│   │   └── DigitMethods.java       #   方法 + 取数字的各位
│   ├── lesson06/                   #   数组专题（本课文件较多）
│   │   ├── ArrayDemo1.java         #     数组的地址值现象
│   │   ├── ArrayDemo2.java         #     用索引取值和改值
│   │   ├── ArrayDemo3.java         #     遍历数组的三种写法
│   │   ├── ArrayPractice.java      #     录入成绩求总分、平均分
│   │   ├── ArrayPractice2.java     #     求数组最大值
│   │   ├── ArrayTest1.java         #     数组求和
│   │   ├── ArrayTest2.java         #     统计能被 3 整除的个数
│   │   ├── ArrayTest3.java         #     奇数翻倍、偶数减半
│   │   └── ArrayTest4.java         #     String 类型数组（存姓名）
│   ├── lesson07/
│   │   └── ArrayMax.java           #   求最大值（练习留白，待完成）
│   └── utils/                      # 通用工具类（可复用的「零件库」）
│       ├── ArrayUtils.java         #   数组求和 / 平均 / 最值 / 统计
│       └── InputUtils.java         #   安全地读取键盘输入
├── docs/
│   ├── 课程导读.md                 # 逐课讲解：练什么、跑起来看到什么、可以改什么
│   ├── API文档.md                  # 所有类和方法清单
│   └── 我的成长故事.md             # 为什么开始学 Java、踩过哪些坑
├── .gitignore                      # 告诉 Git 哪些文件不用上传
├── .classpath / .project           # Eclipse 工程配置
├── LICENSE                         # MIT 开源协议
└── README.md                       # 你正在看的这个文件
```

> `bin/` 是 Eclipse 自动生成的编译结果目录，不需要手动管理，也不会被上传到 GitHub。

---

## 三、怎么把它跑起来

### 环境准备

| 项目 | 版本 / 说明 |
| --- | --- |
| JDK | 17（或 8 以上都可以，代码只用到最基础的语法） |
| IDE | Eclipse（本项目带 `.project` / `.classpath`，可直接导入） |
| 编码 | UTF-8（项目里包含中文，编码不对会变乱码） |

### 方法一：用 Eclipse 运行（推荐初学者）

1. 打开 Eclipse，菜单选 `File` → `Import...`；
2. 选择 `General` → `Existing Projects into Workspace`，点 `Next`；
3. 在 `Select root directory` 里选择本项目文件夹（也就是包含 `src` 的这一层），点 `Finish`；
4. 在左侧 `Package Explorer` 里展开 `src` → 找到某个课程 → 打开 `.java` 文件；
5. 右键点击文件 → `Run As` → `Java Application`（或者直接按 `Ctrl + F11`）；
6. 程序会在下方的 `Console`（控制台）里运行，需要输入时点一下控制台再打字。

### 方法二：用命令行运行（想更了解底层可以试）

在项目根目录（能看到 `src` 的那一层）打开终端，以 day01 的 Sum100 为例：

```bash
# 1. 编译：把 .java 编译成 .class，输出到 bin 目录
javac -encoding UTF-8 -d bin src/day01/Sum100.java

# 2. 运行：注意类名前要带上包名 day01
java -cp bin day01.Sum100
```

其他课程同理，把 `day01.Sum100` 换成对应课程的类和文件名即可，
例如 lesson06 的 ArrayTest1 就是 `lesson06.ArrayTest1`。

**小提示：** 直接运行 `HelloWorld.class` 时要写 `java HelloWorld`（不带 `.class`），
而本项目每个文件都在包（`package xxx;`）里，所以必须写成 `java -cp bin xxx.类名`。

### 遇到问题怎么办

| 现象 | 原因和解决办法 |
| --- | --- |
| 控制台中文变成 `????` 或乱码 | 编码不一致。Eclipse 里检查项目的 `Text file encoding` 设为 `UTF-8`；命令行可以先用 `chcp 65001` 切换成 UTF-8 再运行 |
| `找不到或无法加载主类` | 类名前忘了写包名。要写 `day01.Sum100`，不是 `Sum100` |
| `错误: 需要 class, interface 或 enum` | 大括号 `{}` 不配对，或者某个括号多写、少写了。用 Eclipse 的括号配对高亮检查一下 |
| `找不到符号 scanner` / `cannot find symbol` | `import` 没写、变量名拼错了，或者定义和使用的名字不一致 |
| 程序一直等输入、像卡住了 | 程序在等你从键盘输入，点一下控制台区域再输入数字、按回车即可 |

---

## 四、课程导航

### 入门阶段

| 课程 | 文件 | 学到的知识点 | 状态 |
| --- | --- | --- | --- |
| day01 | `Check.java` | `if - else` 分支判断 | 已完成 |
| day01 | `Loop.java` | `for` 循环的三要素（起始值 / 结束条件 / 每轮变化） | 已完成 |
| day01 | `Sum100.java` | `for` 循环 + **累加器**（先设 0，再逐个加） | 已完成 |
| day01 | `Sum200.java` | 累加练习（保留了「打印写在循环里」的踩坑记录） | 已完成 |
| day02 | `Types.java` | 变量的四种类型：`int` / `double` / `boolean` / `String` | 已完成 |
| day02 | `Divide.java` | **整数除法会截断小数**，`10/3` 得 3、`10.0/3` 得小数 | 已完成 |
| day02 | `Odd.java` | 用 `%` 取余判断奇偶 | 已完成 |
| day02 | `Carpeople.java` | 变量会记住上一次的值（顺序累加） | 已完成 |
| day02 | `Calculation.java` | Scanner + 四则运算 | 已完成 |
| day02 | `ScannerDemo1.java` | Scanner 创建多个对象的练习 | 已完成 |
| day02 | `Temperature1.java` | 华氏转摄氏，体会 `5.0 / 9.0` 与 `5 / 9` 的区别 | 已完成 |
| day02 | `MyInformation.java` | `nextLine()` 和 `nextInt()` 混用的经典坑 | 已完成 |
| day02 | `LeapYear.java` | 闰年判断，`&&` 和 `\|\|` 的组合使用 | 已完成 |
| day02 | `LeapYear2.java` | 把判断逻辑**抽成方法**，再用数组批量判断 | 已完成 |
| day02 | `Table99.java` | **循环嵌套** + `print` / `println` / `\t` | 已完成 |
| day02 | `Test1.java` | 用 `%` 和 `/` 取出三位数的个位、十位、百位 | 已完成 |

### 猜数字游戏系列

| 课程 | 文件 | 学到的知识点 | 状态 |
| --- | --- | --- | --- |
| lesson01 | `GuessNumber.java` | 猜数字游戏：`Random` 随机数、`while` 循环、`break` / `continue`、输入校验、`boolean` 标记位 | 已完成 |
| lesson02 | `GuessMini.java` | `Scanner` 读入一个整数，最基础的输入输出 | 已完成 |
| lesson03 | `GuessCompare.java` | `if - else if - else` 三分支判断，比较两个数的大小 | 已完成 |
| lesson04 | `GuessThreeTimes.java` | `while` 循环 + 次数控制，用标记位记录「有没有猜中」 | 已完成 |
| lesson05 | `DigitMethods.java` | 方法的**定义与调用**、`return` 返回值、用 `%` 和 `/` 取出各位数字 | 已完成 |

### 数组专题

| 课程 | 文件 | 学到的知识点 | 状态 |
| --- | --- | --- | --- |
| lesson06 | `ArrayDemo1~3` | 数组的声明与初始化、索引、`length`、遍历的三种写法 | 已完成 |
| lesson06 | `ArrayPractice`、`ArrayPractice2` | 录入成绩求总分/平均分、求最大值 | 已完成 |
| lesson06 | `ArrayTest1~4` | 求和、条件统计、按规则换算、`String[]` | 已完成 |
| lesson07 | `ArrayMax.java` | 求数组最大值（练习留白版，三个 `TODO` 待自己动手完成） | **练习中** |

> lesson07 是留给自己动手的练习题，所以代码里**故意没有写答案**，只保留了题目和思路提示。

每课的详细讲解（运行后会看到什么、哪几行最关键、可以自己动手改哪里）在
[docs/课程导读.md](./docs/课程导读.md)。

---

## 五、通用工具类 `utils`

初学阶段会发现：**「读取一个合法的整数」这件事，每个程序都要重写一遍**。
所以在 `src/utils/` 里把这类反复出现的代码整理成了工具类，需要用的时候直接调用。

### InputUtils —— 安全地读键盘输入

| 方法 | 作用 |
| --- | --- |
| `readInt(scanner, prompt)` | 一直提示，直到读到**整数**为止 |
| `readIntInRange(scanner, prompt, min, max)` | 一直提示，直到读到**指定范围内**的整数 |
| `readIntInRangeOrExit(scanner, prompt, min, max, exitValue)` | 同上，但读到 `exitValue`（比如 0）就退出 |
| `readWord(scanner, prompt)` | 读取一个不含空格的词语（如姓名） |

### ArrayUtils —— 数组常见操作

| 方法 | 作用 |
| --- | --- |
| `sum(array)` | 求和 |
| `average(array)` | 求平均分（返回值是 `double`，不会丢掉小数） |
| `max(array)` / `min(array)` | 求最大值 / 最小值 |
| `countDivisibleBy(array, divisor)` | 统计能被某个数整除的元素个数 |
| `print(array)` | 逐行打印数组内容 |

### 怎么用

```java
package lesson08;   // 假设你新建了第 8 课

import java.util.Scanner;
import utils.ArrayUtils;   // 从自己的项目里 import 工具类
import utils.InputUtils;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 读成绩：不用再手写 while + hasNextInt 那一套校验了
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = InputUtils.readIntInRange(sc, "请输入第" + (i + 1) + "个成绩：", 0, 100);
        }

        System.out.println("总分：" + ArrayUtils.sum(scores));
        System.out.println("平均分：" + ArrayUtils.average(scores));
        System.out.println("最高分：" + ArrayUtils.max(scores));

        sc.close();
    }
}
```

> 说明：`day01` ~ `lesson07` 的代码**保持各自独立、没有改用工具类**。
> 因为那几课是学习过程中的原始记录，自己一行行写出来的循环和判断，
> 比调用一个现成方法更有价值。工具类留给后面的课程使用。

---

## 六、代码规范约定

本项目统一遵守下面几条，方便阅读也方便以后自己回看：

- **缩进**：统一用 4 个空格（不用 Tab，因为 Tab 在不同地方显示宽度不同）；
- **命名**：类名用大驼峰 `ArrayDemo1`，变量和方法用小驼峰 `maxAttempts` / `readInt`；
- **大括号**：左括号 `{` 跟在语句同一行的末尾，不换行；
- **注释**：每个类顶部写清楚「这课在练什么」，每个方法用 `/** ... */` 写参数和返回值；
- **一个文件一个类**：文件名必须和 `public class` 的名字完全一致（大小写也要一致）；
- **面向初学者的取舍**：代码里**不引入还没学过的语法**（比如 `static final` 常量、泛型、Lambda），
  宁可写法朴素一点，也要保证每一行现在就能看懂。

---

## 七、学习进度与后续路线

**目前已完成：**

- [x] 环境搭建：JDK 17、Eclipse、GitHub 与 Eclipse 的工作流
- [x] Java 基础语法：变量与类型、运算符、`if` / `switch` 分支、`for` / `while` 循环
- [x] 方法：定义、调用、参数、返回值
- [x] 数组：声明、索引、遍历、常见统计操作

**接下来的目标（大一下 ~ 大二上）：**

- [ ] Java 面向对象：类与对象、封装、继承、多态
- [ ] 集合框架（`ArrayList`、`HashMap`）、异常处理、IO 流、Maven
- [ ] MySQL 增删改查，写一个带本地记忆的 Java 聊天程序
- [ ] 引入 Spring AI / LangChain4j，实现最基础的「函数调用（工具调用）」
- [ ] 做一个「文本到 SQL 代理」：听懂自然语言，自动查库并生成报表

> 最终方向：**用 Java 做 AI Agent**。基础语法 → 面向对象 → 数据库 → 框架，一步一步来。

---

## 八、相关仓库

| 仓库 | 内容 |
| --- | --- |
| **java-learning**（本仓库） | Java 各课练习代码 |
| [python-learning](https://github.com/xissus/python-learning) | Python 学习笔记 |

> 本项目为个人学习记录，代码以「能读懂、能跑通、能记录成长」为第一目标，
> 不一定符合工程最佳实践。欢迎交流，但如果用来做生产项目，请自行斟酌取舍。

---

## 九、许可证

本项目采用 [MIT License](./LICENSE) 开源，你可以自由地学习、修改和分发。

## 十、作者

**杨训杰** —— 大数据管理与应用专业，正在自学 Java 与 AI Agent 开发。

如果这个仓库对你有帮助，欢迎点个 ⭐ Star。
