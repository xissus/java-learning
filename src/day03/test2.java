package day03;

public class test2 {

	public static void main(String[] args) {
		boolean isLightGreen = true;
		boolean isLightRed = false;
		boolean isLightYellow = false;
		// 三个并列的 if：各判断各的，互不排斥。
		// 现在只有 isLightGreen 是 true，所以只有第二个 if 会打印。
		// 想想看：万一两个变量同时是 true，屏幕上会出现什么？
		if (isLightYellow) {
			System.out.println("Wait");
		}
		if (isLightGreen) {
			System.out.println("GO");
		}
		if (isLightRed) {
			System.out.println("Stop");
		}
	}

}
