#### 构造方法
##### 构造方法的概述和作用
* 给对象的数据(属性)进行初始化
##### 构造方法格式特点
* 方法名与类名相同(大小也要与类名一致)
* 没有返回值类型,连void都没有
* 没有具体的返回值
	在创建对象的时候,系统就帮我调用了构造方法
	构造方法不能用对象调用
	![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2cd0guoylj20hs04mq2w.jpg)
```java
class Demo1_Constructor {
	public static void main(String[] args) {
		Person p = new Person();
		p.show();
		//p.Person();//构造方法不能用对象调用
		Person p1 = new Person();
		p1.show();
		
	}
}
class Person {
	private String name;
	private int age;
	public Person() {
		name = " 张三";
		age = 23;
	}
	public void show() {
		System.out.println(name + "----"+ age);
	}
}
```
![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2cd28l879j20hs01g742.jpg)
##### 构造方法的重载
* 重载:方法名相同,与放回值无关(构造方法没有放回值),只看参数列表
* 构造方法的注意事项
	1.如果我们没有给出构造方法,系统将自动提供一个无参构造方法
	2.如果我们给出了一个构造函数,系统将不再给出默认的无参构造方法
		注意:这个时候,如果我们还想使用无参构造方法,就必须自己给出.建议永远自己给出无参构造方法.
		
```java
class Demo2_Person {
	public static void main(String[] args) {
		Person p1 =new Person();
		p1.show();
		System.out .println("-----------------");
		Person p2 = new Person("张三",23);
		p2.show();
		System.out.println("------------------");
		Person p3 = new Person("李四",24);
		p3.show();
	}
}
class Person {
	private String name;
	private int age;
	public Person() {
		System.out.println("空参构造");
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参构造");
	}
	public void show() {
		System.out .println(name + "----"+ age);
	}
}
```
![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2cdgmj456j20hs04fa9x.jpg)
##### 构造方法
* 给属性进行初始化
	
* setXxx方法
	
	* 修改属性值
	
	* 这两种方式,在开发中用setXxx更多一些,因为比较灵活

```java
class Demo3_Person {
	public static void main(String[] args) {
		Person p1 = new Person("张三",23);
		p1 = new Person("张诶大",25);
		//这种方式看运行结果貌似是改名字了,其实是将原对象变为垃圾
		System.out.println(p1.getName()+"-----------"+p1.getAge());
		System.out.println("---------------");
		Person p2 = new Person();
		p2.setName("李四");
		p2.setAge(24);
		p2.setName("liyi");
		System.out.println(p2.getName()+"-----------"+p2.getAge());
	}
}
class Person {
	private String name;
	private int age;
	public Person() {   //空参构造
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
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
```
##### 案例演示

* 学生类：
	* 成员变量：
		* name，age
	* 构造方法：
		* 无参，带两个参
	* 成员方法：
		* getXxx()/setXxx()
		* show()：输出该类的所有成员变量值
* B:给成员变量赋值：
	* a:setXxx()方法
	* b:构造方法
* C:输出成员变量值的方式：
	* a:通过getXxx()分别获取然后拼接
	* b:通过调用show()方法搞定
```java
class Demo4_Student {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("张三");
		s1.setAge(25);
		System.out.println("我的名字是"+s1.getName()+",我的年龄是"+s1.getAge());
		Student s2 = new Student("李四",24);
		s2.show();
	}
}
class Student {
	private String name;
	private int age;
	public Student() {
		
	}
	public Student(String name,int age) {
		this.name =name;
		this.age = age;
	}
	public void setName(String name) {
		this.name =name;
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
	public void show() {
		System.out.println("我的名字是" + name +",我的年龄是:"+ age);
	}
}
```
![image](https://ws1.sinaimg.cn/large/9df884d2gy1g2clmcif32j20hs01ot8j.jpg)
##### 手机类案例
* 成员变量:
	* 品牌brand,价格price
* 构造方法
	* 无参,有参
* 成员方法
	* setXxx和getXxx
	* show
```java
class Demo5_Phone {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setBrand("iphone");
		p1.setPrice(9999);
		System.out.println(p1.getbrand()+"-----"+p1.getPrice());
		Phone p2 = new Phone("xiaomi",999);
		p2.show();
	}
}
class Phone {
	private String brand;
	private int price;
	public Phone() {	//无参构造	
	}
	public Phone(String brand,int price) {
		this.brand = brand;
		this.price = price;		
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getbrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void show() {
		System.out.println(brand + "---"+ price);
	}
}
```
##### 案例演示
* 定义一个长方形类,定义 求周长和面积的方法，
* 然后定义一个测试类进行测试。
* 分析:
	* 成员变量:
		* 宽width,高high
	* 空参有参构造
	* 成员方法:
		* setXxx和getXxx
		* 求周长:getLength()
		* 求面积:getArea()
```java
class Test1_Rectangle {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,20);
		System.out.println(r.getLength());
		System.out.println(r.getArea());
	}
}
class Rectangle {
	private int width; //宽
	private int hight; //高
	public Rectangle() {  //空参构造
		
	}
	public Rectangle(int width,int hight) {
		this.width = width;
		this.hight = hight;
	}
	public void setWidth(int width) {
		this.width = width;		
	}
	public int getWidth() {
		return width;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getHight() {
		return hight;
	}
	public int getLength() {
		return 2*(width+hight);
	}
	public int getArea() {
		return width*hight;
	}
}
```
![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2cnh5vqjhj20hs01v0si.jpg)
##### 案例分析
* 定义一个员工类Employee
* 自己分析出几个成员，然后给出成员变量
	* 姓名name,工号id,工资salary 
* 构造方法，
	* 空参和有参的
* getXxx()setXxx()方法，
* 以及一个显示所有成员信息的方法。并测试。
	* work 
```java
class Test2_Employee {
	public static void main(String[] args) {
		Employee e = new Employee("dj",5585,5522.5) ;
		e.work();
	}
}
class Employee {
	private String name;
	private int id;
	private double salary;
	public Employee() {
	}
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id =id;
	}
	public int getId() {
		return id;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalery() {
		return salary;
	}
	public void work() {
		System.out.println("我的姓名是"+name+",我的工号是:"+id+",我的工资是"+salary+"我的工作是敲代码");
	}
}
```
#### Static
##### static关键字的特点
* 1.随着类的加载而加载
* 2.优先于对象存在
* 3.被类的所有对象共享
    - 举例：咱们班级的学生应该共用同一个班级编号。
    - 其实这个特点也是在告诉我们什么时候使用静态?
      
      - 如果某个成员变量是被所有对象共享的，那么它就应该定义为静态的。
    - 举例：
      - 饮水机(用静态修饰)
      - 水杯(不能用静态修饰)
    - **共性用静态,特性用非静态**
    
* 4.可以通过类名调用
    - 其实它本身也可以通过对象名调用。
    - 推荐使用类名调用。
    - 静态修饰的内容一般我们称其为：与类相关的，类成员
##### 面向对象(static的注意事项)(掌握)

- A:static的注意事项
  - a:在静态方法中是没有this关键字的
    - 如何理解呢?
      - 静态是随着类的加载而加载，this是随着对象的创建而存在。
      - 静态比对象先存在。
  - b:静态方法只能访问静态的成员变量和静态的成员方法
    - 静态方法：
      - 成员变量：只能访问静态变量
      - 成员方法：只能访问静态成员方法
    - 非静态方法：
      - 成员变量：可以是静态的，也可以是非静态的
      - 成员方法：可是是静态的成员方法，也可以是非静态的成员方法。
    - 简单记：
      - 静态只能访问静态。

* 静态多了一种调用方式,可以通过类名
```java
class Demo1_Static {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "苍老师";
		p1.country = "日本";
		Person p2 = new Person();
		p2.name = "小泽老师";
		p2.country = "日本";
		p1.speak();
		p2.speak();
		Person.country = "日本";//静态多了一种调用方式,可以通过类名.
		System.out.println(Person.country);
	}
}
class Person {
	String name;
	static String country;
	public void speak() {
		System.out.println(name + "----"+country);
	}
}
```
![image](https://ws1.sinaimg.cn/large/9df884d2gy1g2dg5yyfraj21gv0nctb4.jpg)
![image](https://ws1.sinaimg.cn/large/9df884d2gy1g2cokfjt1uj20rn0pjq5d.jpg)

```java
class Demo2_Static {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.print1();
		Demo2.print2();
	}
}
class Demo2 {
	int num1 = 10;
	static int num2 = 20;
	public void print1() {
		System.out.println(num1);
		System.out.println(num2);
	}
	public static void print2() {
		System.out.println(num1);
		System.out.println(num2);
	}
}
```



![image](https://ws2.sinaimg.cn/large/9df884d2gy1g2dgsl0g4mj20rn0pjgnw.jpg)