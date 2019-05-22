#### 内部类的概述
##### 内部类的特点
	* 内部类可以直接访问外部类的成员,包括私有.
	* 外部类要访问内部类的成员,包括私有.
	* 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
```java
class Demo1_InterClass {
	public static void main(String[] args) {
		//Inner i = new Inner();
		//i.method();这种调用时错误的
		Outer.Inner oi = new Outer().new.Inner();
		oi.method();
	}
}
class Outer {
	private int num = 10;
	class Inter {
		public void method() {
			System.out.println(num);
		}
	}	
}
```