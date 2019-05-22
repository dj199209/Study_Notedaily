### css&js
#### css块标签
##### div&span块标签
* div块标签
```html
<div></div>
```
* span行内的块标签
```html
<span></span>
```
#### css渲染
* 层叠样式表
* 作用
  * 渲染页面
  * 提高工作效率
* 格式:
```html
选择器{属性:值;属性1:值1}
```
后缀名:
```html
.css独立的css样式文件
```
#### 和html元素的整合
* 方式1:内联样式 通过标签的style属性设置样式
* 方式2:内部样式表 在当前页面中使用的样式
    * 通过head标签的样式导入
```html
例如:
<style>
    #divId2{
        background-color :#0f0;
    }
</style>
```
* 方式3:外部样式表 有独立的css文件
  * 通过head标签的link子标签导入
  ```html
  例如
  <link rel="stylesheet" href="css/1.css" type="text/css"/>
  ```
  #### 选择器
  * id选择器
    * 要求
      * html元素必须有id属性且有值<xxx id="id1"></xxx>
      * css中通过"#"引入,后面加上id的值 #id1{...}
* class选择器
    * 要求
      * html元素必要要有clas属性且有值<xxx class="cls1"/>
      * css中通过"."引入,后面加上class的值 .cls1{...} 
* 元素选择器
  * 直接用元素(标签名即可)  xxx{...}
*派生的选择器
    * 属性选择器
      * 要求:
        * html元素必须有一个属性不论属性有且有值<xxx nihao = "wohenhao">
        ```html
        元素名[属性="属性值"]{...}
        例如:
        xxx[nihao="wohenhao"]{...}
        ```
* 后代选择器
  ```html
选择器 后代选择器{....}
在满足第一个选择器的条件下找后代的选择器给满足条件的元素添加样式
 ```
 * 锚伪类选择器
```html
a:link {color: #FF0000}	/* 未访问的链接 */
			a:visited {color: #00FF00}	/* 已访问的链接 */
			a:hover {color: #FF00FF}	/* 鼠标移动到链接上 */
			a:active {color: #0000FF}	/* 选定的链接 */
```
* 选择器使用小结
  * id选择器:一个元素(标签)
  * class选择器:一类元素
  * 元素选择器:一种元素
  * 属性选择器:元素选择器的特殊用法
* 使用的时候注意(了解)
  * 若多个样式作用于一个元素的时候,不同的样式会叠相同的样式,最近原则
  * 若多个选择器作用于一个元素的时候越特殊优先级越高id优先级最高
  ### 总结
  #### css
    * 叠层样式表
    * 作用:
      * 渲染页面
      * 提供工作效率,将html和样式分离
    * 和html的整合
      * 方式1:内联样式表
        * 通过标签的style属性<xxx style="..."/>
      * 方式2:内部样式表
        * 通过head的子标签style子标签
          * <sysle type="text/css">
            ```html
             选择器{
            属性:值;
            属性1:值1;
             }
             </style>
             ```
      * 方式3:外部样式表
        * 有一个独立css文件.后缀:.css
        * 在html中通过link标签导入
  #### 选择器
    * id 选择器
      * html元素有id属性且有值 <xx id="d1">
      * css中通过 # 导入 #ad{...}
    * 类选择器(class)
      * html元素有class属性且有值<xx class="cl">
      * css中通过.导入 #dl{....}
    * 元素选择器
      * css中通过签名即可  xx{...}
    * 属性选择器
      * html元素有一个属性且有值<xx att="val">
      * css中通过元素名[属性="值"]使用 xx[att="val"]{...}
    * 后代选择器
      * 选择器 后代选择器
    * 锚伪类
  #### js
    *javascript :
        * 脚本语言
        * 解释性语言
        * 基础对象
        * 事件驱动函数
    * js的组成
      * ECMAScript(语言)
      * BOM_浏览器对象模型
      * DOM_文档对象模型
    * html和js的整合
      * 方式1:内部编写js
        * <script type="text/JavaScript">js代码</script>
      * 方式2:
        * 外部有一个独立的js文件 后缀名:.js
        * 在html中通过script的src属性导入
        * <script sc="js的路径"></script> 
        * 注意:
          * **一旦使用了src属性,那么script标签中的js代码将不再执行**
    * 变量
      * var 变量名=初始化值;
    * 数据类型:
      * 原始类型(5种)
        * undefined
        * NUll
        * String
        * Number
        * Boolean
      * 通过typeof可以判断一个值或者变量是否是原始类,若是原始类还可以判断那种引用数据类型
      * typeof 变量|值
      * 引用类型
    * 运算符:
      * 关系运算符:
        * 两边值都是字符串,比较ascii码
        * 两边都是数字,和java一样
        * 一边是数字,一边是字符串形式的数字,可以比较
        * 一边是数字,一边是普通字符串,可以比较,永远是false
      * 等性运算符
        * "66"==66 true
        * "666"===666 false
  #### js的语句
      * if while for 和java一样
      * 获取元素:
        *  var obj=document.getElementById("id值");
      * 获取元素的value属性
        * var val=docment.getElementById("id值").value;
      * 设置元素的value属性:
        * document.getElementById.value="sfdsfs";
      * 获取元素的标签体
        * var ht= document.getElementById("id"值).innnerHTML;
      * 设置元素的标签体
        * document.getElementById("id值").innerHTML="ssss";
#### 定义函数:
    方式1:function 函数名(参数列表){函数体}
    方式2;
        var 函数名=function(参数列表){函数体}
    注意:
        函数声明的时候不用声明放回值类型
        参数列表上不要写参数类型
        通过return结束方法和将值返回
#### 事件
    * onclick 单击
    * onsubmit 表单提交
    * onload 页面加载成功或者元素加载成功
  * 事件和函数绑定
    * 方式1:通过元素的事件属性
      * <xxx onxx="函数名(参数列表)">
    * 方式2:派发事件
      * document.getElementById("id值").onxxx=function(){...};
      * document.getElementById("id值").onxxx=函数名;