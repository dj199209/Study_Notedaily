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