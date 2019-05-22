### 类的定义及使用
####  创建对象的格式
```java
类名 对象名 = new 类名();
```
* 对象名:其实就是合法的标识符(如果是一个单词所有单词小写,如果是多个单词,从第二个单词开始首字母大写)
* 如何使用成员变量
	对象名.变量名
* 如何使用成员方法呢:
	对象名.方法名(...)
##### 学生类
```java
class Demo1_Student {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "张三";
		s.age = 23;
		System.out.println(s.name + "..."+s.age);
		s.study();
		s.sleep();
	}
}
class Student {
	String name;
	int age;
	String gender;
	public void study() {		//定义学习的方法
		System.out.println("学生学习");
	}
	public void sleep() {		//定义睡觉的方法
		System.out.println("学生睡觉");
	}
}
```
![image](https://ws1.sinaimg.cn/large/9df884d2gy1g2bep0n3sjj20hs01wt8i.jpg)
##### 手机类
```java
class Demo2_Phone {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.Brand = "华为";
		p.price = 3999;
		System.out.println(p.Brand+"....."+p.price);
		p.call();
		p.sendMessage();
		p.playgame();
	}
}
class Phone {
	String Brand;
	int price;
	public void call() {
		System.out.println("打电话");
	}
	public void sendMessage() {
		System.out.println("发信息");
	}
	public void playgame() {
		System.out.println("玩游戏");
	}
}
```
![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2bf1zhws4j20hs02lglf.jpg)
### 面向对象内存图
#### 汽车类
```java
class Demo1_Car {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "red";
		c1.num = 8;
		c1.run();
		Car c2= new Car();
		c2.color = "black";
		c2.num = 4;
		c2.run();
		Car c3 = c2;
		c3.run();
	}
}
class Car {
	String color;//车身的颜色
	int num; //轮胎的个数
	public void run() {
		System.out.println(color + "...."+num);
	}
}
```
![image](https://wx1.sinaimg.cn/large/9df884d2gy1g2bfki2fjsj21gv0nc40g.jpg)
![image](https://ws1.sinaimg.cn/large/9df884d2gy1g2bfupmk0nj21gv0ncgo4.jpg)
![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2bg2z29hxj21gv0ncmzf.jpg)
#### 成员变量和局部变量的区别
##### 1.在类中的位置不同
* 成员变量:在类中的方法外
* 局部变量:在方法定义中或者方法声明上
##### 2.在内存中的位置不同
* 成员变量:在堆内存(成员变量属于对象,对象进入堆内存)
* 局部变量:在栈内存(局部变量属于方法,方法进入栈内存)
##### 3.生命周期不同
* 成员变量:随着对象的的创建而存在,随着对象的消失而消失
* 局部变量:随着方法的调用而存在,随着方法的调用完毕而消失
##### 4.初始值不同
* 成员变量:有默认初始值
* 局部变量:没有默认初始值,必须定义.赋值,然后才能使用
##### 注意事项
* 局部变量名称可以包括成员变量名称一样,在方法使用的时候,采用的是就近原则
* 基本数据类型包括哪些:byte,short,int,long,float,.double,boolean,char
*引用数据类型包括哪些:数组,类,接口,枚举
```java
class Demo2_Person {
	public static void main(String[] args) {
		Person p = new Person();
		p.speak();
	}
}
class Person {
	String name;
	int num;// 成员变量
	public void speak() {
		int num = 10;//局部变量
		System.out.println(name);
		System.out.println(num);
	}
}
```
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2bh4pt0v4j20hs01t0si.jpg)
#### 匿名对象
##### 什么是匿名对象
* 没有名字的对象
##### 匿名对象应用场景
* 调用方法,仅调用一次的时候
	优点:节省代码
	注意:调用多次的时候,不适合.匿名对象调用完毕后就是垃圾,可以被垃圾回收器回收
* 匿名对象可以作为世界参数传递
```java
class Demo2_Car {
	public static void main(String[] args) {
		new Car().color = "red";
		new Car().num = 4;
		new Car().run();
	}
}
class Car {
	String color;
	int num;
	public void run() {
		System.out.println(color +"..."+num);
	}
}
```
![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2bgfh3radj21gv0nc401.jpg)
```java
class Demo3_Car {
	public static void main(String[] args) {
	//匿名对象可以当作参数传递
		method(new Car());//Car c2 = new Car();//method(new Car());
	}
	public static void method(Car cc){
		cc.color = "red";
		cc.num = 8;
		cc.run();
	}
}
class Car {
	String color;
	int num;
	public void run() {
		System.out.println(color +"...."+num);
	}
}
```
#### 封装
* private关键字特点
	a.是一个权限修饰符
	b.可以修饰成员变量和成员方法
	c.被修饰的成员只能在本类中被访问
```java
class Demo1_Person {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "张三";
		p1.setAge(17);
		System.out.println(p1.getAge());
	}
}
class Person {
	String name;
	private int age;
	
	public void setAge(int a) {
		if (a > 0 && a < 200) {
			age = a;
		}
		else {
			System.out.println("xxxxx");
		}
	}
	public int getAge() {
		return age;
	}
	public void speak() {
		System.out.println(name + "...."+ age);
	}
}
```
![image](https://ws1.sinaimg.cn/large/9df884d2gy1g2bj3b3w9jj20hs026742.jpg)