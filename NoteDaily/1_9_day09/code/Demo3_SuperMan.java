class Demo3_SuperMan {
	public static void main(String[] args) {
		Person p = new SuperMan(); //父类引用指向子类对象,超人提升为了人
									//父类引用指向子类对象就是向上转型
		System.out.println(p.name);
		p.talkwork(); 
		SuperMan sm = (SuperMan)p;    //向下转型
		sm.fly();
		/*
		基本数据类型自动类型提神和强制类型转换
		*/
		int i = 10;
		byte b = 20;
		i = b; //自动类型提升
		b = (byte)i;//强制类型转换
		
	}
}
class Person {
	String name = "jhon";
public void talkwork () {
	System.out.println("弹生意!");
	}
	
}
class SuperMan extends Person {
	String name = "superMan";
	public void talkwork() {
		System.out.println("弹几个亿的生意!");
	}
	public void fly(){
		System.out.println("飞出去救人");
	}
}