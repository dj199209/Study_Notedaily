## js学习笔记
### 案例1_定时弹出广告
* 需求:
  * 打开页面后4s,展示广告,2s之后,该广告隐藏,在停2s,继续展示.
* 技术分析:
  * 定时器
* 定时器(BOM_window对象)
  * 执行定时器
    * setInterval(code,毫秒数):周期执行
    * setTimeout(code,毫秒数):延迟多长事件后 执行一次.
  * 清楚定时器
    * clearInterval(id):
    * clearTimeout(id):
* 步骤分析:
  * 确定事件
  * 编写函数    
    * 获取元素
    * 操作元素
    *  