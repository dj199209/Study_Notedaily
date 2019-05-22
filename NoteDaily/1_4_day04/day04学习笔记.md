# 循环语句for语句
## 循环语句for语句的格式:
```java
for(初始表达式;条件表达式;循环后的操作表达式){
循环体;
	}
```
## for循环的执行流程
a.执行初始条件语句
b.执行判断条件语句,看其返回值是true还是false
	*如果是true,就继续执行
	*如果是false,就结束循环体
c.执行条件语句;
d.执行循环后的操作表达式
e.回到B继续执行
## 在控制台输出10次"helloworld"
```javaclass Demo1_For {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		for (int i = 1 ;i <= 10; i++){
			System.out.println("hello,world");
		}
	}
}
```
## 请在控制台输出数据1-10
```java
class Test1_1_For {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		for (int i = 1; i <=10 ;i++){
		System.out.println("i=" +i);
		}
	}
}
```
## 请在控制台输出数据10-1
```java
class Test1_2_For {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		for (int i = 10; i >=1 ;i--){
		System.out.println("i=" +i);
		}
	}
}
```
## 求出1-10之间数据之和
```java
class Test_2_1_For {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int sum = 0;
		for(int i=1 ;i <=10;i++){
			sum=sum+i;
		}
		System.out.println("sum="+sum);
	}
}
```
## 求出1-100之间偶数和
```java
class Test_2_2_For {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int sum = 0;
		for(int i=1;i<=100;i++){
			if(i % 2== 0) {
			sum=sum+i;
			}
		}
		System.out.println("偶数和为"+sum);
	}
}
```
## 求出1-100之间奇数和
```java
class Test_2_3_For {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int sum = 0;
		for(int i = 1;i<=100;i++){
			if(i % 2 == 1){
				sum = sum +i;
			}
		}
		System.out.println("奇数和位"+sum);
	}
}
```
## 在控制台输出所有的”水仙花数”
	* 所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
	* 举例：153就是一个水仙花数。
	* 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

	分析:
	1,100 - 999
	2,获取每一个位数的值,百位,十位,个位
	3,判断各个位上的立方和是否等于这个数,如果等于打印
```java
class Test3_Flower {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		for (int i = 100; i<=999;i++ ){
			int ge = i %10;
			int shi = i/10%10;
			int bai = i /100%10;
			if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				System.out.println(i);
			}
		}
	}
}
```
## 统计”水仙花数”共有多少个
```java
class Test14_Flowercount {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		 int count = 0;
		for(int i= 100;i<=999;i++){
			int ge = i % 10;
			int shi = i /10 %10;
			int bai = i /100 %10;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				count++;
			}
		}
		System.out.println(count);
	}
}
```
# 循环结构while
## 语句的格式
```java
while循环的基本格式：
		while(判断条件语句) {
			循环体语句;
		}
		
完整格式：

初始化语句;
while(判断条件语句) {
	 循环体语句;
	 控制条件语句;
}
```
## 执行流程
* a:执行初始化语句
* b:执行判断条件语句,看其返回值是true还是false
	* 如果是true，就继续执行
	* 如果是false，就结束循环
* c:执行循环体语句;
* d:执行控制条件语句
* e:回到B继续。
## 请在控制台输出数据1-10
```java
class Demo1_While {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int x = 1;
		while (x <= 10){
			System.out.println("x="+x);
			x++;
		}
	}
}
```
## 求和思想
* 求1-100之和
```java
class Test1_1_while {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int sum = 0;
		int i = 1;
		while (i <= 100){
			sum +=1;
			i++;
		}
		System.out.println(i);
	}
}
```
## :统计思想
* 统计”水仙花数”共有多少个
```java
class Test1_2_while {
	public static void main(String[] args) {
		//Test1_2_whileSystem.out.println("Hello World!");
		int count = 0;
		int i = 100;
		while (i<=999){
			int ge = i %10;
			int shi =i/10%10;
			int bai = i/100%10;
			if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
}
```
# 循环结构do...while
## 语句的格式
```java
do {
			循环体语句;
		}while(判断条件语句);
		
		完整格式；
		初始化语句;
		do {
			循环体语句;
			控制条件语句;
		}while(判断条件语句);
```
## 执行流程
* a:执行初始化语句
* b:执行循环体语句;
* c:执行控制条件语句
* d:执行判断条件语句,看其返回值是true还是false
	* 如果是true，就继续执行
	* 如果是false，就结束循环
* e:回到b继续。
## 请在控制台输出数据1-10

