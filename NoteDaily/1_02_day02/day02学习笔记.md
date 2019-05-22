# 常量

* 字符串常量	用双引号括起来的内容
* 整数常量		所有整数
* 小数常量		所有小数
* 字符常量		用单引号括起来的内容,里面只能放单个数字,单个字母或单个符号
* 布尔常量		较为特殊，只有true和false
* 空常量		    null(数组部分讲解)
		
```java
class Demo1_Constant {						//constant 常量
	public static void main(String[] args) {
		
		System.out.println("abc");		//字符串常量
		System.out.println(123);		//整数常量
		System.out.println(12.3);		//小数常量
		System.out.println('10');		//''中必须放的是单个字符,10代表的是1字符和0字符
		//System.out.println('');		//''中什么也不放,也是不可以的,因为代表不了任何字符
		System.out.println(' ');		//带表空格字符
		System.out.println(true);		//boolean类只有两个值,true和false
		System.out.println(false);
	}
}
```
# java任意进制之间的转换
```JAVA
class Demo1_Scale {								//scale 进制
	public static void main(String[] args) {
		/*
		* 0b100
		* 0100
		* 100
		* 0x100
		*/
		System.out.println(0b100);				//4	二进制表示形式前面加0b(b可以大写也可以小写)
		System.out.println(0100);				//64	八进制表示形式前面加0
		System.out.println(100);
		System.out.println(0x100);				//256	十六进制表示形式前面加0x(可以大写也可以小写)
	}
}
```
# 变量的概述
## 什么是变量
在执行的过程中,在某个范围内其值可以发生改变的量
## 变量的定义格式
数据类型 变量名 = 变量值
## 为什么要定义变量
用来不断的存放同一类型的常量,并可以重复使用
```java
class Demo1_DateType {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		//整数类型
		byte b = 10;// 占一个字节 ,-128到127
		short s = 20; // 占两个字节		
		int i = 30;   // 占四个字节   		整数的数据类型就是int类型
		long x = 8888888888L; //占八个字节如果long类型后面L进行标识最好加大L,因为小l太像一了
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(x);
		//浮点类型
		float f  = 12.3f; //占四个字节
		double d = 33.4;
		System.out.println(f);
		System.out.println(d);
		//字符类型
		char c = 'a';
		System.out.println(c);
		//布尔类型
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
	}
}
```
# 示例
 a:作用域问题
	*同一个区域不能使用相同的变量名 
 b:初始化值问题
	* 局部变量在使用之前必须赋值 
 c:一条语句可以定义几个变量
	* int a,b,c...; 
```java
class Demo2_DataType {
	public static void main(String[] args) {
		/*
		* a:作用域问题
			* 同一个区域不能使用相同的变量名 
		* b:初始化值问题
			* 局部变量在使用之前必须赋值 
		* c:一条语句可以定义几个变量
			* int a,b,c...; 
		*/
		/*int x = 10;
		int x = 20;

		System.out.println(x);

		int y;

		y = 10;
		System.out.println(y);*/

		int a,b,c,d,e;

		a = 10;
		b = 20;
		c = 30;
		d = 40;
		e = 50;

		System.out.println(a);

		int x = 10;
		int y = 20;
		int z = 30;
	}
}
```
# 数据类型转换之隐式转换
* A:案例演示
	* a:int + int
	* b:byte + int 
* B:Java中的默认转换规则
	* 取值范围小的数据类型与取值范围大的数据类型进行运算,会先将小的数据类型提升为大的,再运算 
* C:画图解释byte+int类型的问题
```java
class Demo3_DateTypeConversion {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int x = 3;
		byte b =4;
		x= x+b;
		System.out.println(x);
	}
}
```
# 数据类型转换之强制转换
```java
class Demo3_1_DateTypeConversion {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int x =3;
		byte b= 4;
		b = (byte)(x+b);
		System.out.println(b);
	}
}
```
# 变量相加和常量相加的区别
	* 面试题:看下面的程序是否有问题，如果有问题，请指出并说明理由。
	* byte b1 = 3;
	* byte b2 = 4;
	* byte b3 = b1 + b2;
		* 从两方面去回答这个题
		* b1和b2是两个变量,变量里面存储的值都是变化的,所以在程序运行中JVM是无法判断里面具体的值
		* byte类型的变量在进行运算的时候,会自动类型提升为int类型 
	* byte b4 = 3 + 4;
		* 3和4都是常量,java有常量优化机制,就是在编译的的时候直接把3和4的结果赋值给b4了 
		```java
		class Dome4_DateTypeconversion {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		System.out.println("hello"+'a'+1);
		System.out.println('a'+1+"hello");
		System.out.println("5+5="+(5+5));
	}
}
		```
# longhe1float取值范围大小
byte,short,char -- int -- long -- float -- double
# char的数据类型
* A:char c = 97;	0到65535
* B:Java语言中的字符char可以存储一个中文汉字吗?为什么呢?
	* 可以。因为Java语言采用的是Unicode编码。Unicode编码中的每个字符占用两个字节。中文也是占的两个字节
	* 所以，Java中的字符可以存储一个中文汉字
```java
class Demo5_Char {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		char c = 'a';
		System.out.println(c);
		byte b =100;
		char c1 =97;
		System.out.println(c1);
	char c2 = 3;
	char c3 = 4;
	char c4 = 5;
	char c5 = 6;
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	//char;类型是否可以存储中文
	char c6 = '中';
	System.out.println(c6);
		}
}

```
# 算术运算符++和--的练习
```java
class Test1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int a = 10;
		int b = 10;
		int c = 10;
		
		a= b++; //a=10,b=11(先把b=10赋值给a,b自身在加1)
		System.out.println(a);
		System.out.println(b);
		c=--a;//a=9 c=9
		b=++a;//b=10,a=10
		a=c--;//a=9c=8
		System.out.println("a = " + a + ",b = " + b + ",c = " + c);
		//System.out.println("x="+x+",y="+y);
	}

```
```java
int a = 10;
		int b = 10;
		int c = 10;
		
		a= b++; //a=10,b=11(先把b=10赋值给a,b自身在加1)
		System.out.println(a);
		System.out.println(b);
		c=--a;//a=9 c=9
		b=++a;//b=10,a=10
		a=c--;//a=9c=8
		System.out.println("a = " + a + ",b = " + b + ",c = " + c);
		//System.out.println("x="+x+",y="+y);
```
```java
int x =4;
		//int y =x++;
		//int y =++x;
		int y = (x++)+(++x)+(x*10);
		System.out.println(y);
```
```java
byte b= 10;
		//b = b + 1;	当byte与int进行混合运算的时候,会提升为int类型,两个int相加的结果还是int,赋值给byte会损失精度
		b=(byte)(b+1);
		System.out.println("b="+b);
```


