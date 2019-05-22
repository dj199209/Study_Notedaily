# 逻辑运算符的基本用法
	*&,|,^,!	
	*&&,|| 
## &&与&的区别
	* a:最终结果一样。
	* b:&&具有短路效果。左边是false，右边不执行。

## ||与|的区别
	* a:最终的结果是一样
	* b:||具有短路效果,左边为true,右边不执行
	```java
	class Demo2_Operator {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println((++x==3)&(++y == 4));
		System.out.println("x="+x);
		System.out.println("y="+y);
		int x1 =3;
		int y1 =4;
		System.out.println((++x1 == 3)&&(++y1 ==4));
		System.out.println("x1="+x1);
		System.out.println("y1="+y1);
	}
}
	```
# 位运算符
## 位异或运算符的特点
	* ^的特点：一个数据对另一个数据位异或两次，该数本身不变。
	```java
	class Demo2_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		System.out.println(5^10^10);//一个数异或两次,是该数本身不变.-----5
		System.out.println(5^10^5);//一个数异或两次,是该数本身不变.------10
	}
}
```
## 例:
	* 请自己实现两个整数变量的交换
	* 注意：以后讲课的过程中，我没有明确指定数据的类型，默认int类型。
	```java
	class Demo2_1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int x= 10;
		int y =5;
		//方法1:引入第三方变量
		/*int  temp;
		temp = x;
		x = y;
		y =temp;*/
		//方法2:不需要引入第三变量方法一
		x = x +y;  //x=15
		y = x -y;  //y=10
		x = x -y;  //x=5
		//此方法可能会超出int的取值方位
		//方法3 用^来做
		/*x= x^y;
		y=x^y;
		x=x^y;*/
		System.out.println("x="+x+",y="+y);
	}
}
```
# 三元运算符
```java
class Demo1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int x = 10;
		int y = 165;
		int z;
		z= (x >y)?x:y;
		System.out.println("z= "+z);
	}
}
```
# 键盘录入
* 先照格式来
```java
* a:导包
	* 格式：
		* import java.util.Scanner; 
		* 位置： 在class上面。
* b:创建键盘录入对象
		* 格式：
		* Scanner sc = new Scanner(System.in);
* c:通过对象获取数据	
	* 格式：
		* int x = sc.nextInt();
```
```java
import java.util.Scanner;
class Demo2_Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int x = sc.nextInt();
		System.out.println("x = "+x);
	}
}
```
## 获取三个整数中的最大值
```java
class Test1_1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		//获取三个整数中的最大值
		int a = 10;
		int b = 20;
		int c = 30;
		int temp =(a>b)?a:b;
		int max =(temp>c)?temp:c;
		System.out.println("max="+max);
	}
}
```
## 比较两个整数是否相同
```java
class Test1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		//比较两个整数是否相同
		int x = 10;
		int y = 10;
		boolean b = (x==y) ? true :false;
		//boolean b =(x==y);
		System.out.println("两个数" +b);
	}
}
```
## 键盘录入练习：键盘录入两个数据，并对这两个数据求和，输出其结果
```java
import java.util.Scanner;
class Text2_1_Scaner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();
		int max = (x>y)?x:y;
		System.out.println("最大值为:"+max);
	}
}
```
## 键盘录入练习：键盘录入两个数据，获取这两个数据中的最大值
```java
import java.util.Scanner;
class Text2_2_Scaner {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个值");
		int x = sc.nextInt();
		System.out.println("请输入第二个值");
		int y =sc.nextInt();
		int max =(x>y) ? x:y;
		System.out.println("你输入的最大值为:"+max);
	}
}
```
## 键盘录入练习：键盘录入两个数据，比较这两个数据是否相等
```java
import java.util.Scanner;
class Text3_1_Scaner {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要比较的的第一个值");
		int x = sc.nextInt();
		System.out.println("请输入需要比较的第二个值");
		int y = sc.nextInt();
		boolean b = (x==y) ;
		System.out.println(b);
		
	}
}
```
## 键盘录入练习：键盘录入三个数据，获取这三个数据中的最大值
```java
import java.util.Scanner;
class Text3_2_Scaner {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个值");
		int x = sc.nextInt();
		System.out.println("请输入第二个值");
		int y = sc.nextInt();
		System.out.println("请输入第三个值");
		int z = sc.nextInt();
		int temp = (x>y) ? x:y;
		int max = (temp>z) ? temp:z;
		System.out.println(max);
	}
}
```
# 选择结构if
## 选择结构的分类
	* if语句
	* switch语句
## if语句有几种格式
	* 格式1
	* 格式2
	* 格式3
## 语句的格式1
```java
	if(比较表达式) {
		语句体;
	}
```
 D:执行流程：
	* 先计算比较表达式的值，看其返回值是true还是false。
	* 如果是true，就执行语句体；
	* 如果是false，就不执行语句体；
```java
class Demo1_If {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int age = 19;
		
		if (age >= 18){
			System.out.println("可以浏览本网站");
			
		}
		System.out.println("完了");
		
	}
}
```
## 案例演示
* a:比较表达式无论简单还是复杂，结果必须是boolean类型
* b:if语句控制的语句体如果是一条语句，大括号可以省略；
* 如果是多条语句，就不能省略。建议永远不要省略。
* c:一般来说：有左大括号就没有分号，有分号就没有左大括号
```java
class Dmeo2_If {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int age = 17;
		if(age >= 18 && age <= 69){
			System.out.println("可以浏览本网页");
			
		}
		System.out.println("完了");
	}
}
```
## if语句的格式2
```java
if(比较表达式) {
			语句体1;
		}else {
			语句体2;
		}
```
##  执行流程：
* 首先计算比较表达式的值，看其返回值是true还是false。
* 如果是true，就执行语句体1；
* 如果是false，就执行语句体2；
## 案例演示
* a:获取两个数据中较大的值
* b:判断一个数据是奇数还是偶数,并输出是奇数还是偶数
* 注意事项：else后面是没有比较表达式的，只有if后面有。
```java
class Demo3_If {
	public static void main(String[] args) {
		int x = 0;
		if (x ==1){
			System.out.println("男厕所欢迎你");
		}
		else{
			System.out.println("女厕所欢迎你");
		}
		
	}
}
```
```java
class Dmoe3_1_If {
	public static void main(String[] args) {
		//获取两个数据中较大的值
		int x = 10;
		int y = 20;
		int z;
		if(x>y){
			z=x;
		}
		else{
			z=x;
		}
		System.out.println(z);
	}
}
```
```java
class Dmoe3_2_If {
	public static void main(String[] args) {
		//判断一个数据是奇数还是偶数,并输出是奇数还是偶数
	int num = 11;
		if(num%2==0){
			System.out.println(num +"是一个偶数");
		}
		else{
			System.out.println(num+"是一个奇数");
		}
	}
}
```
## if语句和三元运算符完成同一个效果
## if语句和三元运算符的区别
	*三元运算符实现的，都可以采用if语句实现。反之不成立。
## if语句的嵌套使用
```java
class Demo6_If {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int a =40;
		int b =50;
		int c =30;
		if(a>b){
			if (a>c){
			System.out.println(a + "是最大值");}
			else{
				System.out.println(c +"是最大值");
		}}
		else{
			if(b>c){
				System.out.println(b +"是最大值");
		}
			else{
				System.out.println(c + "是最大值");
			}
		}
	}
}
```
### 练习1键盘录入一个成绩，判断并输出成绩的等级。
90-100 优
80-89  良
70-79  中
60-69  及
0-59   差
```java
import java.util.Scanner;
class Text1_If {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		//键盘录入一个成绩，判断并输出成绩的等级。
		// 90-100 优
		// 80-89  良
		// 70-79  中
		// 60-69  及
		// 0-59   差
		System.out.println("请输入你要查询成绩的等级,请输入0-100的数值");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x > 90 && x <= 100){
			System.out.println("优");
		}
		else if(x>80 && x<=89){
			System.out.println("良");
		}
		else if(x>70 && x<=79){
			System.out.println("中");
			
		}
		else if(x>60 && x<69){
			System.out.println("及格");
		}
		else if(x>0 && x<=59){
			System.out.println("差");
		}
		else{
			System.out.println("输入错误");
		}
	}
}
```
## switch语句的格式
```java
switch(表达式) {
		      case 值1：
				语句体1;
				break;
			    case 值2：
				语句体2;
				break;
			    …
			    default：	
				语句体n+1;
				break;
	    }
```
```java
class Demo1_Switch {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
	String name = "rose";
	String gender = "人妖";
	switch(gender) {
	case "男士":
		System.out.println(name +"是一个"+gender +"喜欢吃饭睡觉打dota");
	break;
	case "女士":
		System.out.println(name + "是一位"+ gender +"喜欢逛街购物美容");
	break;
	default:
		System.out.println(name + "是一位"+ gender+ "打雌性激素维持美貌");
	break;
	}
}
}
	
```
```java
class Tset2_Switch {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int x = 2;
		int y = 3;
	switch(x){
	

		
			default:
				y++;
			case 3:
				y++;
			case 4:
				y++;
	}

System.out.println("y= "+y);
	}
}
```
