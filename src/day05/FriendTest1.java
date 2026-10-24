package day05;

public class FriendTest1 {

	public static void main(String[] args) {
		Friend f1 = new Friend();
		f1.name = "小杰";
		f1.age = 18;
		f1.gender = "boy";
		f1.place = "陕西";
		f1.hobby = "学习";
		System.out.println(f1.name + "今年" + f1.age + " " +  f1.gender + " " + "来自" + f1.place + "喜欢" + f1.hobby);

		
		
		f1.eat();
		f1.sleep();
		f1.playGame();
		System.out.println("  ");
		Friend f2 = new Friend();
		f2.name = "小美";
		f2.age = 18;
		f2.gender = "girl";
		f2.place = "山西";
		f2.hobby = "跳舞";
		System.out.println(f2.name + "今年" + f2.age + " " +  f2.gender + " " + "来自" + f2.place + "喜欢" + f2.hobby);
		
		f2.eat();
		f2.sleep();
		f2.playGame();
	}

}
