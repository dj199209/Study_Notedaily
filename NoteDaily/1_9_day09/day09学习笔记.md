![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2bno4cw9vj211y0lcn4b.jpg)

#### 多态的概述
事物存在的多种形态
##### 多态的前提
* 要有继承关系
* 要有方法重写
* 要有父类引用指向子类对象
  编译看左边(父类),运行看左边(父类)

##### 成员变量
编译看左边(父类),运行看左边(父类)
##### 成员方法
编译看左边(父类),运行看右边(子类)------------动态绑定
##### 静态方法
* 编译看左边(父类),运行看左边(父类)
* 静态和类相关,算不算重写,所以,访问还是左边的
* 只有非静态的成员方法,编译看左边运行看右边
##### 超人的故事
```java
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
```
![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2g4sgvjngj21140eb0vu.jpg)
#### 多态的好处和弊端
![image](https://wx2.sinaimg.cn/large/9df884d2gy1g2g4uzynzpj20gn064tac.jpg)
##### 多态的弊端
* 不能使用子类特有的属性和行为
##### 多态的好处
* 提高代码的维护性
* 提高代码的扩展性
* ![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2g57f3t73j20vw0pegpb.jpg)

![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2g59s4zm2j20qg0pjtb9.jpg)

![image](https://wx1.sinaimg.cn/large/9df884d2gy1g2g5d7ee7tj20q20pcdis.jpg)
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2g5hghb6uj218l0ovn2d.jpg)
![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2g5pjeeugj20o70bnmxy.jpg)
#### 抽象类(Abstarct)
![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2g5x0bnauj20p106q40s.jpg)
抽象类是无法实例化的
抽象方法必须定义在抽象类中
![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2g62p87mjj20qg09iq3v.jpg)

##### 抽象类的成员特点
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2g64hhbsxj20vd07bgo8.jpg)
![image](https://wx1.sinaimg.cn/large/9df884d2gy1g2g657scd3j20vf0dydjw.jpg)  
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2g66qe92vj20lt0e6421.jpg)
![image](https://ws1.sinaimg.cn/large/9df884d2gy1g2g67vn9r4j20je0dy76p.jpg)
##### 葵花宝典

抽象类里面的方法必须全部 重写 (因为他是规则)

![image](https://wx1.sinaimg.cn/large/9df884d2gy1g2g6fkhchuj20p30cn0v9.jpg)

##### abstract不能和static/ final /private 

![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2i6mbtej5j20xj0hkq7b.jpg)

![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2i6oxnhs4j20sv08zn04.jpg)

![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2i6qytseaj20t109vtd0.jpg)

#### 接口(全部是抽象方法的)

从狭义的角度来讲java中的接口及时interface

广义的角度对外提供规则都是接口

![image](https://wx2.sinaimg.cn/large/9df884d2gy1g2i6wgep59j20gp05c3zq.jpg)

![image](https://wx2.sinaimg.cn/large/9df884d2gy1g2i6zgbzmjj20s102emxj.jpg)

![1556422641593](https://ws4.sinaimg.cn/large/9df884d2gy1g2i9l1fy28j211y0lcn53.jpg)

![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2i72ies9cj20w30500tv.jpg)

![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2i74423msj20v00as413.jpg)

继承是亲爹,接口(实现_也是父类)是干爹

##### 接口的成员方法

![image](https://wx1.sinaimg.cn/large/9df884d2gy1g2i77dkftbj20d703sq3m.jpg)

在接口里面定义的变量都是常量

![image](https://ws2.sinaimg.cn/large/9df884d2gy1g2i8ywn21ej20ss0da418.jpg)

![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2i90x2849j20js0bimzt.jpg)

![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2i937e4cuj20ow0by0vm.jpg)

三个关键字可以互相交换位置,建议写的时候要加上 

![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2i964vybsj20s60gftco.jpg)

![image](https://wx2.sinaimg.cn/large/9df884d2gy1g2i985s8wmj20q20ekjuy.jpg)



![1556427324672](https://wx2.sinaimg.cn/large/9df884d2gy1g2i9h20voyj20vj0fkdiy.jpg))

![1556427368620](https://wx2.sinaimg.cn/large/9df884d2gy1g2i9k4vpi9j20uy0bxwgo.jpg)

![image](https://ws1.sinaimg.cn/large/9df884d2gy1g2i9exfeiqj20w20dnjur.jpg)

##### 类与类,类与接口,接口与接口的关系

![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2i9g25djvj20cw04pwf9.jpg)

![image](https://wx1.sinaimg.cn/large/9df884d2gy1g2i9p9n4tlj20u60bcq50.jpg)

没有方法体所以可以多实现

##### 接口与接口

![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2i9rfp1pgj20qr0armz7.jpg)

![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2i9tkp0xwj20oe087gn0.jpg)

![image](https://ws2.sinaimg.cn/large/9df884d2gy1g2i9ugv761j20bn084mxz.jpg)

![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2i9vdfnlaj20gk01n0t3.jpg)

接口编译之后也是.class

```Java
class Test1_Animal {
	public static void main(String[] args) {
		Cat c = new Cat("111",8);
		c.eat();
		c.sleep();
		JumpCat jc = new JumpCat("hh",3);
		jc.eat();
		jc.sleep();
		jc.jump();
	}
}
abstract class Animal {
	private String name;
	private int age;
	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
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
	public abstract void eat();
	public abstract void sleep();
}
interface Jumping {
	public void jump();
}
class Cat extends Animal {
	public Cat() {}
	public Cat(String name, int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void sleep() {
		System.out.println("侧着睡");
	}
}class JumpCat extends Cat implements Jumping {
	public JumpCat() {}
	public JumpCat(String name, int age) {
		super(name,age);
	}
	public void jump() {
		System.out.println("猫调高");
	}
}
```

##### 亲爹单继承,干爹是多实现(干爹也是爹)

```java
class Deno4_interface {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
//亲爹单继承,干爹是多实现
interface 某干爹 {
	public void 关系() ;
	public void 潜规则() ;
}
class 某女星 interface implements {
	public void 关系 () {
		System.out.println("借助干爹关系上位");
	}
	public void 潜规则() {
		System.out.println("你们懂得");
	}
}
```

