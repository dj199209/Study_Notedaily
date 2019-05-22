### html学习笔记
#### html的作用
* 作用:展示
* 文件标签
 ```html
<html>
	<head>
	<tittle></tittle>
	</head>
	<body></body>
</html>
```
* 排版标签
```html
	p段落
	hr水平线
	br换行
```
  * 字体
  ```html
  h1~h6 标题
  font 字体 大小 颜色
  b strong 加粗
  i 斜体
  ```
  * 图片
  ```html
  <img src="图片的路径" alt="替代文字" width="" hight=""/>
  ```
  * 路径写法:
```html
	相对路径:./或者什么都不写____当前目录
	../上一级目录
	绝对路径:常用
	http://www.weibo.com/xx
```
#### 超链接
* a标签
<a herf="跳转的路径 " target="在什么地方打开"></a>
#### 表格标签
* table标签 tr行 th抬头 td列
```html
<table border="" width="" height="" bgcolor="" align="表格对齐方式" >
	<tr align="内容对齐方式">
		<th></th><!--表格单元格-->
		<th></th><!- 普通单元格-->	
	</tr>
</table>

```
* td重要属性:
	* colspan:列合并
	* rowspan:行并列
* 列表
	* <ol></ol>
	* <ul></ul>
		* 字标签:列表项
			*<li></li>

#### 表单页面
* 表单标签
```html
<from></form>
```
* 常用属性
	action:提交的路径
	method提交的方式(get和post)
* 常用的子标签
	input
	select
	textarea


* 作用:用来从浏览器收集用户信息
* 步骤分析
    1.在页面中添加一个表格
    2.10行3列表格
    3.在表格中添加表单子标签

* 表单:
	* 常用属性:
		* action:信息提交的路径 默认是当前页面
		* method:表单提交的方式
	* 只需要掌握两种
		* get(默认)和post
			* get和post的区别:
				1.get请求会把所有的参数追加在地址栏上,post请求不会
				2.get请求参数大小有限制,post请求参数大小没有限制
				3.post相当于get安全些
	* 常见的子标签
		* input
		* select:下拉选
		* textarea:文本域

	* input标签
		* 常用的属性:
			* type:
			* text:文本框 默认
			* password:密码框
			* radio:单选框
			* checkbox:多选框
			* file:文件框
			* submit:提交
			* reset:重置
			* button:普通按钮
			* hidden:隐藏域 在页面上显示 提交的时候可以提交过去
			* image:图片提交 替代submit 
			* name:
				* 可以将几个单选框(复选框)设置为一组
					要想将信息保存到服务器上必须有name属性
				* readonly:
					readonly="readonly" 只读
				* disabled:
					disabled="disabled" 禁用
		select :下拉选
		```html	格式:
				<select name="pro">
					<option>黑龙江</option>
				</select>
		```
		* textarea:文本域
			* 常用的属性:
				* cols:列
				* rows:行
		* 提交到服务器的内容的格式:
			```html
			key=value&
			```
		* 对于文本框 密码框 文本域 手写的内容传递过去了
		* 对于单选框和多选框来说,却没有把值传递过去
		**	要想把值传递过去 必须设置value属性**
		* 若下拉选要想把选中内容的值传递过去,请加上value属性
		* 默认值:
			```html
			文本框 密码框:只需要添加value属性
			单选框 多选框:添加 checked="checked"(默认选择)
			下拉选:添加selected="selected"	
			文本域:标签体
			```
	* 当我们提交的时候 发现地址栏变化
	```html
		?username=tom&password=123&sex=on&hobby=on&hobby=on&photo=&pro=黑龙江&city=哈尔滨&intr=good+girl
	```
	#### 后台页面
	* frameset:框架集
	* frame:具体实现
	* frameset:框架集(了解)
    	* 常用属性:
    		* cols:垂直切割
  ```html
			例如: cols="40%,60%	"
			例如: cols="40%,*,10%"
			```
		* rows:水平切割
	常见的子标签:
		frame
	注意:
		最好和body不要共存
frame:具体实现
	常用属性:
		src:展示的页面的url
		target指向指定路径