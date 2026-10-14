package utils;

public final class ArrayUtils {

	/**
	 * 私有构造方法：阻止外部通过 {@code new ArrayUtils()} 创建实例。
	 */
	private ArrayUtils() {
		// 工具类不需要实例，什么都不做
	}

	/**
	 * 计算数组中所有元素的和。
	 *
	 * @param array 待计算的数组，不能为 {@code null}
	 * @return 所有元素之和；空数组返回 0
	 */
	public static int sum(int[] array) {
		checkNotNull(array);

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	/**
	 * 计算数组的平均值。
	 * <p>
	 * 注意：求平均前必须先强制转换成 {@code double}，否则整数除法会把小数部分截断 （例如 7 / 2 得到 3 而不是 3.5）。这正是
	 * lesson06 里踩过的坑。
	 *
	 * @param array 待计算的数组，必须至少包含一个元素
	 * @return 平均值
	 * @throws IllegalArgumentException 数组为 {@code null} 或长度为 0 时抛出
	 */
	public static double average(int[] array) {
		checkNotEmpty(array);
		return (double) sum(array) / array.length;
	}

	/**
	 * 找出数组中的最大值。
	 *
	 * @param array 待查找的数组，必须至少包含一个元素
	 * @return 最大的元素
	 * @throws IllegalArgumentException 数组为 {@code null} 或长度为 0 时抛出
	 */
	public static int max(int[] array) {
		checkNotEmpty(array);

		int max = array[0]; // 先假设第 0 个元素最大，再逐个比较更新
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * 找出数组中的最小值。
	 *
	 * @param array 待查找的数组，必须至少包含一个元素
	 * @return 最小的元素
	 * @throws IllegalArgumentException 数组为 {@code null} 或长度为 0 时抛出
	 */
	public static int min(int[] array) {
		checkNotEmpty(array);

		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	/**
	 * 统计数组中能被指定数字整除的元素个数。
	 *
	 * @param array   待统计的数组
	 * @param divisor 除数，不能为 0
	 * @return 能被整除的元素个数
	 * @throws IllegalArgumentException 数组为 {@code null}，或 {@code divisor} 为 0 时抛出
	 */
	public static int countDivisibleBy(int[] array, int divisor) {
		checkNotNull(array);

		if (divisor == 0) {
			throw new IllegalArgumentException("除数不能为 0");
		}

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % divisor == 0) {
				count++;
			}
		}
		return count;
	}

	/**
	 * 按「索引: 元素值」的格式逐行打印数组内容。
	 *
	 * @param array 待打印的数组
	 */
	public static void print(int[] array) {
		checkNotNull(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println("第 " + (i + 1) + " 个元素：" + array[i]);
		}
	}

	/**
	 * 校验数组不为 {@code null}。
	 *
	 * @param array 待校验的数组
	 * @throws IllegalArgumentException 数组为 {@code null} 时抛出
	 */
	private static void checkNotNull(int[] array) {
		if (array == null) {
			throw new IllegalArgumentException("数组不能为 null");
		}
	}

	/**
	 * 校验数组既不为 {@code null} 也不为空。
	 *
	 * @param array 待校验的数组
	 * @throws IllegalArgumentException 数组为 {@code null} 或长度为 0 时抛出
	 */
	private static void checkNotEmpty(int[] array) {
		checkNotNull(array);

		if (array.length == 0) {
			throw new IllegalArgumentException("数组不能为空，至少需要 1 个元素");
		}
	}
}
