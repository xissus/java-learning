package day05;

public class FriendTest2 {

	public static void main(String[] args) {
		Friend f1 = new Friend();
		f1.name = "小杰";
		f1.age = 18;
		Friend f2 = new Friend("小美",20);
		System.out.println(f1.name + " " + f1.age);
		System.out.println(f2.name + " " + f2.age);
	}

}
