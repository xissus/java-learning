package day03;

public class test2 {

	public static void main(String[] args) {
		boolean isLightGreen = true;
		boolean isLightRed = false;
		boolean isLightYellow = false;
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
