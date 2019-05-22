#### 代码块的概述和分类
![image](https://ws1.sinaimg.cn/large/9df884d2gy1g2dhmmbypkj217m0p8don.jpg)

![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2dhsxnjxrj217v0s6tg4.jpg)
```java
class Student {
	static {
		System.out.println("Student 静态代码块");
	}
	
	{
		System.out.println("Student 构造代码块");
	}
	
	public Student() {
		System.out.println("Student 构造方法");
	}
}

class Demo2_Student {
	static {
		System.out.println("Demo2_Student静态代码块");
	}
	
	public static void main(String[] args) {
		System.out.println("我是main方法");
		
		Student s1 = new Student();
		Student s2 = new Student();
	}
}
```
![image](https://ws2.sinaimg.cn/large/9df884d2gy1g2dqvvurevj20hs03za9z.jpg)
#### 继承
* A:Java中类的继承特点
	* a:Java只支持单继承，不支持多继承。(一个儿子只能有一个爹)
		* 有些语言是支持多继承，格式：extends 类1,类2,...
	* b:Java支持多层继承(继承体系)
* B:案例演示
	* Java中类的继承特点
		* 如果想用这个体系的所有功能用最底层的类创建对象
		* 如果想看这个体系的共性功能,看最顶层的类 
```java
class Demo2_Extends {
	public static void main(String[] args) {
		DemoC c = new DemoC();
			c.show();
			c.printss();
	}
}
class DemoA {
	public void show() {
		System.out.println("DemoA");
	}
}

class DemoB extends DemoA {
	public void method() {
		System.out.println("DemoB");
	}
}
class DemoC extends DemoA {
	public void prints() {
		System.out.print("DemoC");
	}
} 
```
子类只能继承父类所有非私有的成员(成员方法和成员变量)
```java
class Demo_Extends {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
	}
}
class Father {
	private String name;
	private void show() {
		Systyem.out.println("这是父类的show方法");
	}
}
class Son extends Father {
	
} 
```
![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2drp9m4vaj20hs049748.jpg)
```java
class Demo4_Extends {
	public static void main(String[] args) {
		Son s = new Son();
		s.print();
	}
}
class Father {
	int num1 = 10;
	int num2 = 30;
}
class Son extends Father {
	int num2 =20;
	public void print() {
		System.out.println(this.num1);
		System.out.println(this.num2);
		System.out.println(super.num2);
	}
}
```
![image](https://ws2.sinaimg.cn/large/9df884d2gy1g2druwbwwrj20hs02fgle.jpg)
子类中所有的构造方法默认都会访问父类中空参数的构造方法
```java
class Demo5_Extends {
	public static void main(String[] args) {
		Son s = new Son();
	}
}
class Father extends Object {
	public Father() {
		super();
		System.out.println("Father的构造方法");
	}
}
class Son extends Father {
	public Son() {
		super();
		System.out.println("Son的构造方法");
	}
}

```
![image](https://wx1.sinaimg.cn/large/9df884d2gy1g2ds1sc2jhj20hs01gq2q.jpg)
##### 
* 父类没有无参构造方法,子类怎么办?
	* super解决
	* this解决
* 注意事项
* super(…)或者this(….)必须出现在构造方法的第一条语句上

```java
class Demo6_extends {
	public static void main(String[] args) {
		Son s1 = new Son();
		System.out.println(s1.getName()+"-----"+s1.getAge());
		System.out.println("------------------");
		Son s2 = new Son("张三",23);
		System.out.println(s2.getName()+"----------"+s2.getAge());
		
	}
}
class Father {
	private String name;
	private int age;
	/*public Father() {
		System.out.println("Father的空参构造");
	}*/
	public Father(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("Father的有参构造");
	}
	public void setName() {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
class Son extends Father {
	public Son() {
		this("王五",25);
		//super("李四",24);
		System.out.println("Son的空参方法");
	}
	public Son(String name, int age) {
		super(name,age);
		System.out.println("Son的有参构造");
	}
	
}
```
![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2f0963f3vj20hs04ajra.jpg)
##### 当子类需要父类的功能，而功能主体子类有自己特有内容时，可以重写父类中的方法。
```java
class Demo7_Phone {
	public static void main(String[] args) {
		Ios8 i = new Ios8();
		i.siri();
		
	}
}
class Ios7 {
	public void call() {
		System.out.println("打电话");
	}
	public void siri() {
		System.out.println("speak English");
	}
}
class Ios8 extends Ios7 {
	public void siri() {
		System.out.println("说中文");
		super.siri();
	}
}
```
![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2f0boqunqj20hs01qdfm.jpg)
##### 静态只能覆盖静态,其实不算重写
```java
class Demo8_Shuang_Jiang {
	public static void main(String[] args) {
		DayOne d = new DayOne();
		d.paoniu();
		
	}
}
class Shuang_JIang {
	public void sing() {
		System.out.println("唱红歌");
	}
	public void paoniu() {
		System.out.println("唱红歌搞定玲女士");
	}
	
}
class DayOne extends Shuang_JIang {
	public void paoniu() {
		System.out.println("霸王硬上弓");
		super.paoniu();
	}
}
```
#### final概述
##### final修饰特点
* 修饰类，类不能被继承
* 修饰变量，变量就变成了常量，只能被赋值一次
* 修饰方法，方法不能被重写
**final修饰变量叫做常量,一般会与public static共用**常量需要被公用,可以用类名.调用
##### final的调用方式
* 基本类型，是值不能被改变
* 引用类型，是地址值不能被改变,对象中的属性可以改变
```java
class Demo2_Final {
	public static void main(String[] args) {
		final int num = 10;
		//num = 20;
		System.out.println(num);

		final Person p = new Person("张三",23);
		//p = new Person("李四",24);
		p.setName("李四");
		p.setAge(24);

		System.out.println(p.getName() + "..." + p.getAge());

		method(10);
		method(20);
	}
//方法声明上
	public static void method(final int x) {
		System.out.println(x);
	}
}


class Person {
	private String name;			//姓名
	private int age;				//年龄

	public Person(){}				//空参构造

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {	//设置姓名
		this.name = name;
	}

	public String getName() {		//获取姓名
		return name;
	}

	public void setAge(int age) {	//设置年龄
		this.age = age;
	}

	public int getAge() {			//获取年龄
		return age;
	}
}
```
##### final修饰变量的初始化时机
* 显示初始化 
* 在对象构造完毕前即可
```java
class Demo3_Final {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
	}
}
class Demo {
	final int num;						//成员变量的默认初始化值是无效值
	
	public Demo() {
		num = 10;
	}
	public void print() {
		System.out.println(num);
	}
}
```