# API 文档（类与方法清单）

> 这份文档列出项目里**所有的类**和**每个类的公开方法**，方便快速查「某个方法是干什么的、怎么调」。
> 想看每课的详细讲解和运行效果，请读 [课程导读](./课程导读.md)。

## 目录

- [day01](#day01--最早期的七个练习)
- [day02](#day02--eclipse-时代的十二个练习)
- [lesson01](#lesson01--guessnumber)
- [lesson02](#lesson02--guessmini)
- [lesson03](#lesson03--guesscompare)
- [lesson04](#lesson04--guessthreetimes)
- [lesson05](#lesson05--digitmethods)
- [lesson06](#lesson06--数组专题)
- [lesson07](#lesson07--数组综合题)
- [other（自己练手）](#other自己练手)
- [utils（工具类）](#utils工具类)

## 速查表

| 类 | 包 | 公开方法 | 一句话说明 |
| --- | --- | --- | --- |
| `Hello` | `day01` | `main` | 第一个程序：两行打印 |
| `Intro` | `day01` | `main` | 变量 + 字符串拼接的自我介绍 |
| `Check` | `day01` | `main` | 按温度给出 if-else 提示 |
| `Loop` | `day01` | `main` | for 循环三要素演示 |
| `Sum100` | `day01` | `main` | 1~100 累加求和 |
| `Sum100Practice` | `day01` | `main` | 同一题的练习记录（原留白版，已补完） |
| `Sum200` | `day01` | `main` | 累加练习（保留踩坑写法） |
| `Types` | `day02` | `main` | 变量四种类型 |
| `Divide` | `day02` | `main` | 整数除法 vs 小数除法 |
| `Odd` | `day02` | `main` | 取余判断奇偶 |
| `Carpeople` | `day02` | `main` | 变量顺序累加 |
| `Calculation` | `day02` | `main` | 四则运算 |
| `ScannerDemo1` | `day02` | `main` | 两个 Scanner 对象 |
| `Temperature1` | `day02` | `main` | 华氏度转摄氏度 |
| `MyInformation` | `day02` | `main` | 录入个人信息（`nextLine` 坑） |
| `LeapYear` | `day02` | `main` | 闰年判断（Scanner 版） |
| `LeapYear2` | `day02` | `main`、`isLeapYear` | 闰年判断（方法化 + 数组批量） |
| `Table99` | `day02` | `main` | 打印九九乘法表 |
| `Test1` | `day02` | `main` | 取三位数的各位 |
| `GuessNumber` | `lesson01` | `main` | 猜数字游戏（1~50，5 次机会） |
| `GuessMini` | `lesson02` | `main` | 读取并打印一个整数 |
| `GuessCompare` | `lesson03` | `main` | 单次判断大小 |
| `GuessThreeTimes` | `lesson04` | `main` | 最多猜 3 次 |
| `DigitMethods` | `lesson05` | `main`、`readThreeDigitNumber`、`getOnesPlace`、`getTensPlace`、`getHundredsPlace`、`sumTo` | 取数位 + 累加求和 |
| `ArrayDemo1` | `lesson06` | `main` | 数组的地址值现象 |
| `ArrayDemo2` | `lesson06` | `main` | 索引取值与改值 |
| `ArrayDemo3` | `lesson06` | `main` | 遍历的三种写法 |
| `ArrayPractice` | `lesson06` | `main` | 录入 5 个成绩并统计 |
| `ArrayPractice2` | `lesson06` | `main` | 求数组最大值 |
| `ArrayTest1` | `lesson06` | `main` | 数组求和 |
| `ArrayTest2` | `lesson06` | `main` | 统计能被 3 整除的个数 |
| `ArrayTest3` | `lesson06` | `main` | 奇数翻倍 / 偶数减半 |
| `ArrayTest4` | `lesson06` | `main` | `String[]` 存姓名 |
| `ArrTest5` | `lesson07` | `main` | 求数组最大值 |
| `ArrTest6` | `lesson07` | `main` | 随机数求和 / 平均 / 统计 |
| `QuadraticFormula` | `other` | `main` | 解一元二次方程（判别式分支 + a=0 检查） |
| `InputUtils` | `utils` | `readInt`、`readIntInRange`、`readIntInRangeOrExit`、`readWord` | 控制台输入工具 |
| `ArrayUtils` | `utils` | `sum`、`average`、`max`、`min`、`countDivisibleBy`、`print` | 数组操作工具 |

---

## day01 · 最早期的七个练习

**包：** `day01` —— 写在还没用 Eclipse 的时候，最朴素的一批练习。

| 类 | `main` 的行为 | 典型输出 |
| --- | --- | --- |
| `Hello` | 打印两行问候语 | `你好，我的 Agent 之路从这里开始` |
| `Intro` | 用三个变量拼出自我介绍 | `我叫杨训杰,今年18岁` |
| `Check` | 判断温度写死的变量（34）并输出提示 | `今天真热，注意防暑` |
| `Loop` | for 循环：从 10 开始每次减 2 | `这是第10遍` … `这是第2遍`（5 行） |
| `Sum100` | for 循环累加 1~100 | `总和是5050` |
| `Sum100Practice` | 同上的**练习记录**：原为留白版，循环体已自己补完 | `总和是5050` |
| `Sum200` | 从 5 开始累加 1~50，**打印写在循环里** | 50 行逐步递增的结果 |

> 这些类都只有一个 `main` 方法，没有对外提供可复用的方法——
> 它们的作用是**记录学习过程**，不是提供功能。
>
> `Sum100Practice` 比较特别：它最初是作为**留白版**放进去的，循环体里只有一句 `// TODO`，
> 需要自己补上「把 i 加到 sum 上」。**后来已经补完了**，所以它现在和 `Sum100` 输出一致，
> 留着是为了记录「从留白到自己写出来」的过程。

---

## day02 · Eclipse 时代的十二个练习

**包：** `day02` —— 转到 Eclipse 之后的一批练习（原来的包名是 `demo2`）。

| 类 | `main` 的行为 | 典型输出 |
| --- | --- | --- |
| `Types` | 定义四种类型的变量并拼接打印 | `杨训杰 18岁1.78米`、`还是学生吗？true` |
| `Divide` | 对比整数除法和小数除法 | `3`、`3.3333333333333335` |
| `Odd` | 判断 2027 的奇偶 | `2027是奇数` |
| `Carpeople` | 变量按顺序累加 4 步 | `6` |
| `Calculation` | 读两个整数，输出和差商积 | 依输入而定 |
| `ScannerDemo1` | 用两个 Scanner 各读一个整数求和 | 依输入而定 |
| `Temperature1` | 读华氏度，按 `(f-32)*5.0/9.0` 换算 | 如输入 212 → `摄氏度为:100.0` |
| `MyInformation` | 读入姓名/学号/性别/年龄/寄语并打印 | 依输入而定 |
| `LeapYear` | 读年份判断闰年 | `2024是闰年` |
| `LeapYear2` | 遍历数组批量判断 4 个年份 | `2026 不是闰年`、`2024 是闰年`… |
| `Table99` | 两层循环打印 9×9 乘法表 | 标准乘法表 |
| `Test1` | 读三位整数输出个/十/百位 | 输入 456 → `个位是6`、`十位是5`、`百位是4` |

### `LeapYear2` 的公开方法

| 方法 | 参数 | 返回 | 说明 |
| --- | --- | --- | --- |
| `main(String[] args)` | 命令行参数 | `void` | 遍历 `{2026, 2024, 2000, 1900}` 逐个判断 |
| `isLeapYear(int year)` | 年份 | `boolean` | 闰年判断公式：`year % 4 == 0 && year % 100 != 0 \|\| year % 400 == 0` |

```java
boolean result = LeapYear2.isLeapYear(2024);   // true
```

> 注意：`isLeapYear` 前面没有 `public`，属于「包内可见」，
> 所以在 `day02` 包内可以直接调用；其他包想调用就需要加上 `public`。

---

## lesson01 · `GuessNumber`

**包：** `lesson01`

猜数字游戏：程序随机生成 1~50 的整数，玩家最多猜 5 次。输入 `0` 退出；非整数和越界输入不计次数。

```java
public static void main(String[] args)
```

| 项目 | 说明 |
| --- | --- |
| 参数 | `args` —— 命令行参数，本程序未使用 |
| 返回值 | `void`（无返回值） |
| 输出 | 提示语、「太大了喵~」/「太小了喵~」/「恭喜！你用了 N 次猜中了。」、机会用完时公布答案 |
| 依赖 | 需要键盘输入；直接双击运行会在控制台等待输入 |

---

## lesson02 · `GuessMini`

**包：** `lesson02`

```java
public static void main(String[] args)   // 读取一个整数并原样打印
```

---

## lesson03 · `GuessCompare`

**包：** `lesson03`

```java
public static void main(String[] args)   // 把输入的整数与固定答案 25 比较，输出三种反馈之一
```

---

## lesson04 · `GuessThreeTimes`

**包：** `lesson04`

```java
public static void main(String[] args)   // 最多猜 3 次，猜中即结束
```

---

## lesson05 · `DigitMethods`

**包：** `lesson05`

| 方法 | 参数 | 返回 | 说明 |
| --- | --- | --- | --- |
| `main(String[] args)` | 命令行参数 | `void` | 程序入口：读入三位数并输出结果 |
| `readThreeDigitNumber(Scanner sc)` | 已创建好的 Scanner | `int` | 反复提示，直到读到 100~999 的整数；**永不返回非法值** |
| `getOnesPlace(int number)` | 任意整数 | `int` | 取个位，实现为 `number % 10` |
| `getTensPlace(int number)` | 任意整数 | `int` | 取十位，实现为 `number / 10 % 10` |
| `getHundredsPlace(int number)` | 任意整数 | `int` | 取百位，实现为 `number / 100 % 10` |
| `sumTo(int max)` | 累加终点 | `int` | 返回 1 + 2 + ... + max |

调用示例：

```java
Scanner sc = new Scanner(System.in);
int number = DigitMethods.readThreeDigitNumber(sc);   // 例如 456
int ones = DigitMethods.getOnesPlace(number);         // 6
int sum = DigitMethods.sumTo(50);                     // 1275
```

---

## lesson06 · 数组专题

**包：** `lesson06`

| 类 | `main` 的行为 | 典型输出 |
| --- | --- | --- |
| `ArrayDemo1` | 打印数组名 | `[I@2f92e0f4`（地址值，每次运行不同） |
| `ArrayDemo2` | 演示索引取值与赋值 | `1` / `1` / `100` |
| `ArrayDemo3` | 对比三种遍历写法 | `1 2 3 4 5`（打印两遍） |
| `ArrayPractice` | 读取 5 个成绩，输出每个成绩、总分、平均分 | `总分是：433`、`平均分是：86.6` |
| `ArrayPractice2` | 求 `{1,2,3,4,5}` 的最大值 | `5` |
| `ArrayTest1` | 求 `{1,2,3,4,5}` 的和 | `总和是：15` |
| `ArrayTest2` | 统计 1~10 中能被 3 整除的个数 | `3 6 9`、`数组中能被3整除的数字有3个` |
| `ArrayTest3` | 奇数×2、偶数÷2 后打印 | `2 1 6 2 10 3 14 4 18 5` |
| `ArrayTest4` | 录入并打印 50 个姓名（建议临时改成 3 个再看） | 逐行打印姓名 |

> 这些类都只有一个 `main` 方法，没有对外提供可复用的方法——
> 它们的作用是**记录学习过程**，不是提供功能。

---

## lesson07 · 数组综合题

**包：** `lesson07` —— 课堂上跟着老师敲的两道数组综合题。

### `ArrTest5` · 求数组最大值

```java
public static void main(String[] args)
```

| 项目 | 说明 |
| --- | --- |
| 数组 | `{ 33, 5, 22, 44, 55 }`（静态初始化） |
| 核心变量 | `max`，初值取 `arr[0]` |
| 输出 | `55` |
| 关键点 | 初值**不能**写 `0`——数组全是负数时会出错 |

### `ArrTest6` · 随机数综合练习

```java
import java.util.Random;

public static void main(String[] args)
```

| 项目 | 说明 |
| --- | --- |
| 数组 | `new int[10]`（动态初始化） |
| 随机数 | `new Random().nextInt(100) + 1` → 1~100 |
| 输出 1 | `随机数的总和为` + 十个数的和 |
| 输出 2 | `数组的平均数为` + 平均数 |
| 输出 3 | `一共有N个数据比平均数小` |
| 输出 4 | 把数组逐个打印出来验证 |
| ⚠️ 踩坑点 | `sum / arr.length` 是整数除法，会丢小数；正确写法是 `(double) sum / arr.length` |

---

## other（自己练手）

**包：** `other` —— 课程之外自己找来做的小练习。

### `QuadraticFormula` · 解一元二次方程

```java
import java.util.Scanner;

public static void main(String[] args)
```

| 项目 | 说明 |
| --- | --- |
| 输入 | 依次读入三个整数系数 `a`、`b`、`c` |
| 公式 | `x = (-b ± √(b²-4ac)) / 2a` |
| 判别式 | `double delta = (b * b) - (4 * a * c)` |
| a=0 处理 | 读完 `a` 立即检查，等于 0 则提示并 `return` 结束程序（避免除以 0 得到 `NaN` / `Infinity`） |
| 分支 1 | `delta > 0` → 输出 `X1=`、`X2=` 两个根 |
| 分支 2 | `delta == 0` → 输出 `X1=X2=` 一个根（**注意写 `2.0` 而非 `2`，避免整数除法**） |
| 分支 3 | `delta < 0` → 输出 `方程无解` |
| 用到的类 | `Scanner`（输入）、`Math.sqrt()`（开平方）、`return`（提前结束程序） |

---

## utils（工具类）

**包：** `utils` —— 与 `lessonNN` 平级的独立包，可被任何课程代码导入。

> 这两个类是 `final`（不能被继承）且构造方法被私有化，目的是**只允许通过类名直接调用静态方法**，
> 不需要也不应该写 `new InputUtils()`。

### `InputUtils` · 控制台输入

```java
import java.util.Scanner;
import utils.InputUtils;
```

| 方法 | 参数 | 返回 | 说明 |
| --- | --- | --- | --- |
| `readInt(Scanner scanner, String prompt)` | Scanner、提示文字 | `int` | 一直提示，直到读到**整数** |
| `readIntInRange(Scanner scanner, String prompt, int min, int max)` | 加区间上下限（含） | `int` | 一直提示，直到读到 `min`~`max` 之间的整数 |
| `readIntInRangeOrExit(Scanner scanner, String prompt, int min, int max, int exitValue)` | 加退出值 | `int` | 同上；读到 `exitValue` 时**原样返回**，由调用方决定是否退出 |
| `readWord(Scanner scanner, String prompt)` | Scanner、提示文字 | `String` | 读一个不含空格的词（如姓名） |

```java
Scanner sc = new Scanner(System.in);

int age = InputUtils.readInt(sc, "请输入年龄：");                       // 只接受整数
int score = InputUtils.readIntInRange(sc, "请输入成绩：", 0, 100);      // 只接受 0~100
int guess = InputUtils.readIntInRangeOrExit(sc, "猜一个 1~50（0 退出）：", 1, 50, 0);
String name = InputUtils.readWord(sc, "请输入姓名：");

sc.close();   // 注意：Scanner 由调用方负责关闭，工具类内部不关
```

> ⚠️ 使用注意：**Scanner 的关闭由调用方负责**。工具类内部不会 `close()`，
> 因为一旦关闭，同一个 Scanner 后面就不能再用了。

### `ArrayUtils` · 数组操作

```java
import utils.ArrayUtils;
```

| 方法 | 参数 | 返回 | 说明 |
| --- | --- | --- | --- |
| `sum(int[] array)` | 数组 | `int` | 求和；空数组返回 0 |
| `average(int[] array)` | 数组 | `double` | 求平均分。**内部已做 `(double)` 转换**，不会丢掉小数 |
| `max(int[] array)` | 数组 | `int` | 最大值 |
| `min(int[] array)` | 数组 | `int` | 最小值 |
| `countDivisibleBy(int[] array, int divisor)` | 数组、除数 | `int` | 统计能被 `divisor` 整除的元素个数 |
| `print(int[] array)` | 数组 | `void` | 按「第 N 个元素：值」逐行打印 |

```java
int[] scores = {88, 92, 76, 95};

int total = ArrayUtils.sum(scores);              // 351
double avg = ArrayUtils.average(scores);         // 87.75
int top = ArrayUtils.max(scores);                // 95
int low = ArrayUtils.min(scores);                // 76
int even = ArrayUtils.countDivisibleBy(scores, 2); // 2（92 和 76）
ArrayUtils.print(scores);
```

**异常约定：**

| 触发条件 | 抛出异常 |
| --- | --- |
| 数组为 `null` | `IllegalArgumentException("数组不能为 null")` |
| `average` / `max` / `min` 传入长度为 0 的数组 | `IllegalArgumentException("数组不能为空，至少需要 1 个元素")` |
| `countDivisibleBy` 的 `divisor` 为 0 | `IllegalArgumentException("除数不能为 0")` |

这些校验的存在，是为了让错误**在出问题的那一行就暴露出来**，
而不是在后面某个莫名其妙的地方才报错。

---

## 附：用 javadoc 命令自动生成网页版文档

代码里的 `/** ... */` 注释可以被 JDK 自动整理成网页：

```bash
javadoc -encoding UTF-8 -charset UTF-8 -d docs/api \
  -sourcepath src \
  -subpackages day01:day02:lesson01:lesson02:lesson03:lesson04:lesson05:lesson06:lesson07:other:utils
```

生成后用浏览器打开 `docs/api/index.html` 即可查看。
输出目录 `docs/api/` 属于产物，已在 `.gitignore` 中忽略。
