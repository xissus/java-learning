package day05;

public class Friend {
	String name;
	int age;
	String gender;
	String place;
	String hobby;
	public Friend() { }
	public Friend(String name,int age) {
		this.name = name;
		this.age = age;
	}
		
	
	
	
	public void sleep() {
		System.out.println(name + "在睡觉");
	}
	public void eat() {
		System.out.println(name + "在吃饭");
	}
	public void playGame() {
		System.out.println(name + "在打游戏");
	}
}





