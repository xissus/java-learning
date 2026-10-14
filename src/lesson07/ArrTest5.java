package lesson07;

public class ArrTest5 {

	public static void main(String[] args) {
		// 定义数组求最大值：33，5，22，44，55
		// 扩展问题：
		// 1、根据求最大值，改写求最小值
		// 2、为什么max记录为arr[0],默认值不可以为0吗
		// 一定要为数组里的值

		// 1、定义数组用来存储5个值
		int[] arr = { 33, 5, 22, 44, 55 };// 已知5个值，选择静态初始化
		// 2、定义变量max，存储最大值
		// 临时认为0索引是最大的
		int max = arr[0];
		// 3、循环获取数组中的每一个元素
		// 拿着每一个元素跟max比较
		for (int i = 0; i < arr.length; i++) {// 循环遍历
			// i索引 arr[i]元素
			if (arr[i] > max) {
				max = arr[i];
//4、当循环结束后，max即为数组最大值

			}

		}
		System.out.println(max);// 55

		// 最小值

	}

}
