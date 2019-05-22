回顾:
js:
	组成部分:
		ECMAScript
		BOM
		DOM
变量声明 var 变量名=初始化值;
数据类型:
		原始类型
			Undefined Null
			String Number Boolean:伪对象
			通过typeof运算符可以判断出属于那种原始类型
				typeof 值|变量
		引用类型
			Boolean Number
			String 
				常用属性:length
				常用方法:
					substring
					split
					replace
			Array
				常用属性:length
				注意:
					array长度可以变化
					array可以存放任意值
			Math
			Date
			RegExp	常用方法:test()
				直接量语法:
					/正则表达式/
			全局
				decodeURI 解码
				eval 计算字符串,解析成js代码执行
运算符:
	关系运算符
	等性运算符 ==  ===
语句:
	选择 循环
////////////////////////////////
BOM(浏览器对象模型)
	window:窗口
		常用属性:
			获取其他的四个对象
				window.location....
		常用方法:
			消息框
				alert confirm prompt
			定时器
				setInterval 周期
				setTimeout 延迟
			打开关闭 
				open close
	location:定位
		location.href:设置或者获取url
	history:历史
		go()
///////////////////////////////
事件和函数
	掌握的事件:
		焦点:
			onfocus
			onblur
		表单事件
			onsubmit
			onchange 改变
		页面或者元素加载
			onload 
				最常用的方式:
					window.onload=function(){};
		单击
			onclick
	函数:
		方式1:
			function 函数名(参数列表){
				函数体
			}
		方式2:
			匿名函数
			例如:window.onload=function(){};
		
事件绑定函数:
	方式1:通过元素的事件属性
		<xxx onxxx="函数名(参数)">  若参数为this:是将当前的dom对象传递给了函数
	方式2:派发事件
		dom对象.onxxx=function(){};
///////////////////////////////////////////
DOM(文档对象模型)
	就是我们的html代码加载到内存中会形成一棵document树
	节点:
		文档节点 document
		元素节点 element
		属性节点 attribute
		文本节点 text
	获取一个元素节点:通过document获取
		四个
	操作元素的属性
		dom对象.属性
	操作元素的标签体
		dom对象.innerHTML
////////////////////////
以前通过js获取对象的时候
	var obj=document.getElementById("id");
	
	funtion getId(id){
		return document.getElementById("id");
	}
	
	$("选择器")===>获取元素
//////////////////////////
js类库:
	对常用的方法和对象进行封装,方便我们使用.
jQuery:
案例1-弹出广告
技术:
	定时器
	jQuery
///////////////////////////
jquery和html的整合
	jquery是单独的js文件
		通过script标签的src属性导入即可
获取一个jquery对象
	$("选择器")  或者 jQuery("选择器")
dom对象和jquery对象之间的转换
	dom对象===>jquery对象	
		$(dom对象)
	jquery对象===>dom对象
		方式1:
			jquery对象[index]
		方式2:
			jquery对象.get(index)
页面加载:
	js:
		window.onload=function(){}//在一个页面中只能使用一次
	jquery 在一个页面中可以使用多次
		方式1:
			$(function(){...})
		方式2:
			$(document).ready(function(){});
派发事件:
	$("选择器").click(function(){...});
	等价于 原生js中
		dom对象.onclick=function(){....}
	掌握事件:
		focus
		blur
		submit
		change
		click
jquery中效果:
	隐藏或展示
		show(毫秒数) hide(毫秒数)
	滑入或滑出
		slideDown(毫秒数):向下滑入
		slideUp(毫秒数):向上滑出
	淡入或淡出
		fadeIn(int):淡入
		fadeOut(int):淡出
/////////////////////
案例1-步骤分析
	1.页面加载成功之后$(function(){...}) 开始一个定时器 setTimeout();
	2.编写展示广告方法 
		获取div,然后调用效果方法
		设置另一个定时器 隐藏
	3.编写隐藏广告的方法
		获取div,然后调用效果方法
////////////////////////////////////
选择器总结:
	基本选择器★
		$("#id值")  $(".class值")  $("标签名")  
		
		了解:$("*")
		理解:获取多个选择器 用逗号隔开
			$("#id值,.class值")
	层次选择器 ★
		a b:a的所有b后代
		a>b:a的所有b孩子
		a+b:a的下一个兄弟(大弟弟)
		a~b:a的所有弟弟
	基本过滤选择器:★
		:frist 第一个
		:last 最后一个
		:odd  索引奇数
		:even 索引偶数
		:eq(index) 指定索引
		:gt(index) >
		:lt(index) <
	内容过滤:
		:has("选择器"):包含指定选择器的元素
	可见过滤:
		:hidden   在页面不展示元素 一般指 input type="hidden" 和 样式中display:none
		:visible 
	属性过滤器:★
		[属性名]
		[属性名="值"]
	表单过滤:
		:input  所有的表单子标签  input select textarea button
		//input
////////////////////////
案例2-隔行换色
技术分析:
	1.页面加载成功
	2.获取所有的奇数行 添加一个css
	3.获取所有的偶数行 添加一个css

属性和css操作总结:
	对属性的操作:
		attr():设置或者获取元素的属性
			方式1:获取
				attr("属性名称")
			方式2:设置一个属性
				attr("属性名称","值");
			方式3:设置多个属性  json
				attr({
					"属性1":"值1",
					"属性2":"值2"
				})
		removeAttr("属性名称"):移除指定属性
	//添加class属性的时候 
	//	attr("class","值");
	addClass("指定的样式值"); 相当于 attr("class","指定的样式值");
	removeClass("指定的样式值");

	对css操作:操作元素的style属性
		css():获取或者设置css样式
			方式1:获取	
				css("属性名")
			方式2:设置一个属性
				css("属性名","值")
			方式3:设置多个
				css({
					"属性1":"值1",
					"属性2":"值2"
				});
	获取元素的尺寸:
		width()
		height()
/////////////////////////////
案例3-全选或者全不选
需求:
	就是将内容中复选框的选中状态和最上面的复选框状态保持一致
步骤分析:
	1.确定事件 复选框的单击事件
	2.函数中
		a.获取该复选框的选中状态  attr(获取不了checked属性)|prop
		b.获取所有的复选框修改他们的状态
注意:
	若jquery版本>1.6 统一使用 prop操作元素的属性
/////////////////////////
/////////////////////////
/////////////////////////
/////////////////////////
案例4-省市联动
步骤分析:
	1.确定事件 省份的下拉选变化的时候  change
	2.编写函数
		a.获取当前省份的value值
		b.通过数组获取该省下的所有市 返回值:数组
		c.遍历数组,拼装成option元素 追加到市下拉选即可
		注意:每次改变的时候初始化市的值.
///////////////////////////
技术:
	遍历数组
		数组.each(function(){});
		$.each(遍历数组,function(){});
		
	注意:
		each的function中可以加两个参数 index和dom
			index是当前遍历的索引值
			dom指代的是当前遍历的dom对象(开发中一般使用this即可)
	//////////////////////////////
	设置或者获取value属性
		jquery对象.val():获取
		jquery对象.val("...."):设置
	/////////////////////////////////////////
	设置获取获取标签体的内容 
		html()
		text()
		
		xxxxx():获取标签体的内容
		xxxxx("....."):设置标签体的内容
			
			设置的区别:
				html:会把字符串解析
				text:只做为普通的字符串
			获取的区别:
				html:获取的html源码
				text:获取只是页面展示的内容
	//////////////////////////////////////////////
创建一个元素: $("<标签></标签>")
///////////////////////
文档操作:
	内部插入
		a.append(c):将c插入到a的内部(标签体)后面
		a.prepend(c):将c插入到a的内部的前面
		
		appendTo
		prependTo
	外部插入
		a.after(c):将c放到a的后面
		a.before(c):将c放到a的前面
		
		a.insertAfter(c)
		a.insertBefore(c)
	删除
		empty() 清空元素
		remove() 删除元素
/////////////////////////////////
/////////////////////////////////
/////////////////////////////////
案例5-左右移动
步骤分析:
	1.确定事件 单击事件
	2.编写函数:
		移动一个:
			右边的下拉选追加一个 左边的选中的第一个
		移动多个:
			左边选中的 追加到右边的下拉选中
		移动全部:
			将左边的所有option追加到右边的下拉选中
		
技术分析:
	表单对象属性过滤选择器
		:enabled   可用的
		:disabled  不可用
		:checked 	选中的(针对于单选框和复选框的)
		:selected 	选中的(针对于下拉选)














///////////////////////////////////////////////////

///////////////////////////////////////////////////
///////////////////////////////////////////////////
上午回顾:
js类库:
	对常见的方法和对象进行了封装,方便开发.
jquery和html的整合
	script标签的src属性导入即可
获取jquery对象
	$("选择器")  jQuery("选择器")
dom对象和jquery对象之间的转换
	dom>>>jquery	
		$(dom对象)
	jquery>>>dom
		方式1:
			jquery对象[index]
		方式2:
			jquery对象.get(index)
jquery中的选择器:
	基本选择器★
		$("#id值") $(".class值") $("标签名")  $("#one,#two,.mini")
	层次选择器★
		a b:后代
		a>b:孩子
		a+b:大弟弟
		a~b:弟弟们
		
	基本过滤选择器
		:frist :last
		:odd :even
		:eq(index) :gt|lt..
	内容过滤
		:has(选择器)
	可见性过滤
		:visible
		:hidden 指代是 input type=hidden  和 display:none
	表单的过滤
		:input
	属性选择器:
		[属性]
		[属性=值]
	表单对象属性过滤选择器
		:enabled   可用的
		:disabled  不可用
		:checked 	选中的(针对于单选框和复选框的)
		★:selected 	选中的(针对于下拉选)
	
///////////////////////////
派发事件:
		jquery对象.事件(function(){.....});
		例如:
			$("#btn1").click(function(){.....});
/////////////////////////
页面加载成功
	$(function(){
		......
	})
	
	$(document).ready(function(){
		////
	});
///////////////////////////
属性和css
	attr():设置或者获取属性(1.6版本之前)
		attr("属性名"):获取
		attr("属性名","值"):设置一个		
		attr({
			"属性名":"值",
			"属性名":"值" 
		})
		
	prop():和attr用法一致(1.6版本之后)
	
	(了解)addClass("存在的样式")
	
	removeAttr()
	(了解)removeClass()
	
	css():设置获取获取元素的样式
		css("属性"):获取
		css("属性","值"):设置
		css({
			"":"",
			"":"",
			"":""
		}):设置多个
	
	width()
	height()
/////////////////////////////////////
	文档处理:
		内部插入(2组方法 任意掌握一组)
		外部插入(2组方法 任意掌握一组)
		删除(empty remove)
//////////////
val html text
		val :设置或者获取values属性
		html:获取或者设置标签体内容
////////////////////
遍历数组
	方式1:
		jquery对象.each(function(){});
	方式1:
		$.each(jquery对象,function(){});
/////////////////////////
在jquery中创建元素
	$("<标签名>").prop(属性).html(内容)
////////////////////////////
	
	
		














		