回顾:
response:响应
	往浏览器写东西
	响应行
		操作状态码
		常用方法:
			setStatus(int code): 1 2 3
	响应头
		格式: 
			key:value(value可以是多个)
		常用方法:
			setHeader(String key,String value):设置字符串形式的响应头
			addHeader(String key,String value):添加字符串形式的响应头 若没有设置则设置,若设置过则追加
	响应体
		浏览器展示的内容
		常用方法:
			getWriter()
			getOutputStream()
		注意:
			俩流互斥,服务器会把我们关闭
	//////////////////////////////////////////
	常见的响应头
		location:重定向 配合302
			开发中:response.sendRedirect("路径");
		refresh:定时刷新 
			response.setHeader("refresh","秒数;url=路径");//java
			meta//html
		content-type:设置文件的mimetype,设置响应流的编码且告诉浏览器用什么编码打开
			开发中:response.setContentType("text/html;charset=utf-8");
		content-disposition:设置文件下载
			response.setHeader("content-disposition","attachment;filename="+文件名称);
	文件下载:
		设置两个头一个流
			content-type
			content-disposition
			
			getOutputStream()
	//////////////////////////////////////
request:请求
	获取从浏览器发送过来数据
	请求行
		常用方法:
			获取项目名:getContextPath()
	请求头
		格式:
			key:value(value可以是多个)
		常用方法:
			getHeader(String key)
	请求参数
		String getParameter(String key)
		String[] getParameterValues(String key)
		Map<String,String[]> getParameterMap()
		获取参数中文乱码:
			通用方式:
				new String(参数.getBytes("iso-8859-1"),"utf-8");
			针对于post:
				request.setCharacterEncoding("utf-8");
	////////////////////
	常用的头信息:
		user-agent:获取浏览器内核
		referer:页面从那里跳转过来
///////////////////////////
request域对象:
	xxxAttribute()
	请求转发:
		request.getRequestDispatcher("/内部路径").forward(request,response);
		
////////////////////////////////////////////////////////////////////////		
////////////////////////////////////////////////////////////////////////		
////////////////////////////////////////////////////////////////////////		
jsp cookie session
////////////////////
案例1-记录用户上次访问时间
需求:
	当用户第一次登录的时候,提示:你是第一次访问,且记录该次访问时间,
	下一次访问的时候,获取上一次访问时间且展示出来
技术分析:
	会话技术
	cookie
	jsp
//////////////////////////////////
jsp:
	java server pages(java服务器页面)
	本质上jsp就是一个servlet,在html代码中嵌套java代码,
	运行在服务器端,处理请求,生成动态的内容.
	对应的java和class文件在tomcat目录下的work目录
	后缀名 .jsp
	
	执行流程:
		1.浏览器发送请求,访问jsp页面
		2.服务器接受请求,jspSerlvet会帮我们查找对应的jsp文件
		3.服务器将jsp页面翻译成java文件.
		4.jvm会将java编译成.class文件
		5.服务器运行class文件,生成动态的内容.
		6.将内容发送给服务器,
		7.服务器组成响应信息,发送给浏览器
		8.浏览器接受数据,解析展示
	
	jsp的脚本:	
		<%...%> java程序片段
			生成成jsp的service方法中
		<%=...%> 输出表达式
			生成成jsp的service方法中,相当于在java中调用out.print(..)
		<%!...%> 声明成员
			成员位置.
/////////////////////////////////////////////////		
会话技术
	当用户打开浏览器的时候,访问不同的资源,知道用户将浏览器关闭,可以认为这是一次会话.		
	作用:
		因为http协议是一个无状态的协议,它记录不论上次访问的内容.用户在访问过程中难免会产生一些数据,
		通过会话技术就可以将起保存起来.
	例如:
		用户登录
		验证码
		购物车
		访问记录
		.....
分类:
	cookie:浏览器端会话技术
	session:服务器端会话技术
//////////////////////////
cookie:
	小饼干 小甜点
	cookie是由服务器生成,通过response将cookie写回浏览器(set-cookie),保留在浏览器上,
	下一次访问,浏览器根据一定的规则携带不同的cookie(通过request的头 cookie),我们服务器就可以接受cookie
	cookie的api:
		new Cookie(String key,String value)
	写回浏览器:
		response.addCookie(Cookie c)
	获取cookie:
		Cookie[] request.getCookies()
	cookie的常用方法:
		getName():获取cookie的key(名称)
		getValue:获取指定cookie的值
/////////////////////////
案例1-步骤分析:
	1.创建一个serlvet RemServlet 路径:/rem
	2.在servlet中:
		获取指定cookie 例如:名称为 lastTime
			request.getCookies()
		判断cookie是否为空
			若为空:提示信息 第一次访问
			若不为空:
				获取此cookie的value
				展示信息:你上次访问时间是....
		
		将这次访问时间记录,写会浏览器
////////////////////////
cookie-总结:
	常用方法:
		setMaxAge(int 秒):设置cookie在浏览器端存活时间  以秒为单位
			若设置成 0:删除该cookie(前提必须路径一致)
		setPath(String path):设置cookie的路径.
			当我们访问的路径中包含此cookie的path,则携带
			默认路径: 
				访问serlvet的路径,从"/项目名称"开始,到最后一个"/"结束
				例如:
					访问的serlvet路径:
						/day11/a/b/hello
					默认路径为:
						/day11/a/b
			手动设置路径:以"/项目名"开始,以"/"结尾;
/////////////////////////////
案例2:记录用户浏览历史
需求:
	当用户访问一个商品的时候,需要将该商品保留在浏览记录中
技术分析:
	cookie
步骤分析:
	1.先将product_list.htm转成jsp
	2.点击一个商品,展示该商品的信息,将该商品id记录到cookie  (GetProductById)
		获取之前的浏览记录 例如名称:ids
		判断cookie是否为空
			若为空 将当前商品的id起个名称 ids 放入cookie中  ids=1
			若不为空,获取值 例如:ids=2-1  当前访问的id=1  使用"-"分割商品id
				判断之前记录中有无该商品
					若有:
						将当前的id放入前面  结果 ids=1-2
					若没有:
						继续判断长度是否>=3
							若>=3,移除最后一个,将当前的id放入最前面
							若<3,直接将当前的id放入最前面.
			
			若 ids=3-2-1 现在访问1 结果 ids=1-3-2
			若 ids=4-3-2 现在访问1 结果 ids=1-4-3

	3.再次回到product_list.jsp页面,需要将之前访问商品展示在浏览记录中
		获取ids  例如:ids=2-3-1
		切割
/////////////////
扩展:删除浏览记录
技术分析:
	cookie.setMaxAge(0)
步骤分析:
	1.在浏览器记录中添加一个超链接 
		<a href="/day1101/clearHistroy">清空</a>
	2.创建servlet clearHistroy
		创建一个cookie 
			名称路径保持一致
			setMaxAge(0)
		写回浏览器
	3.页面跳转
		重定向 product_list.jsp
		
/////////////
注意:
	cookie不能跨浏览器
	cookie中不支持中文
/////////////////////
案例3-添加到购物车
需求:
	在商品详情页面有一个添加到购物车,点击则将该商品添加到购物车,点击购物车连接将里面的所有商品展示出来
技术分析:
	session
//////////////
session:
	服务器端会话技术.
	当我们第一次访问的服务器的时候,服务器获取id,
		能获取id
			要拿着这个id去服务器中查找有无此session
				若查找到了:直接拿过来时候,将数据保存,需要将当前sessin的id返回给浏览器
				若查找不到:创建一个session,将你的数据保存到这个session中,将当前session的id返回给浏览器
		不能获取id
			创建一个session,将你的数据保存到这个session中,将当前session的id返回给浏览器
	
	获取一个session:
		HttpSession  request.getSession()
	
	域对象:
		xxxAttribute
		生命周期:
			创建:第一次调用request.getsession()创建
			销毁:
				服务器非正常关闭
				session超时
					默认时间超时:30分钟  web.xml有配置 
					手动设置超时:setMaxInactiveInterval(int 秒) 了解
				手动干掉session
					★session.invalidate()
		存放的私有的数据.
////////////////////////////////
步骤分析:
	1.点击添加到购物车的时候,提交到一个servlet add2CartServlet
		需要将商品名称携带过去
	2.add2CartServlet中的操作
		获取商品的名称
		将商品添加到购物车 购物车的结构 Map<String 名称,Integer 购买数量>
			将购物车放入session中就可以了
		
		将商品添加到购物车分析:
			获取购物车
			判断购物车是否为空
				若为空:
					第一次添加
					创建一个购物车
					将当前商品put进去.数量:1
					将购物车放入session中
				若不为空:继续判断购物车中是否有该商品
					若有:
						取出count 将数量+1 
						将商品再次放入购物车中
					若没有:
						将当前商品put进去 数量:1
					
		提示信息:你的xx已添加到购物车中
	
	
	3.点击购物车连接的时候 cart.jsp
		从session获取购物车
			判断购物车是否为空
				若为空:提示信息
				若不为空:遍历购物车即可
			
//////////////////
案例2-扩展清空购物车:
	思路1:将购物车移除
	思路2:将session干掉
步骤分析:
	在cart.jsp上添加一个超链接 清空购物车
		<a href="/day1101/clearCart">清空购物车</a>
	在clearCart中需要调用session.invalidate()
	重定向到购物车页面
	


















	
		
		
		
		
		
////////////////////////////////////////////////////////////////////		
////////////////////////////////////////////////////////////////////		
////////////////////////////////////////////////////////////////////	
上午回顾:
jsp:
	java 服务器页面
	就是在html代码嵌套java代码,
	本质上就是一个servlet,运行在服务器,接受请求,处理业务逻辑,生成动态内容
	jsp三个脚本:
		<%...%> java片段 
			生成在jsp的service方法中
		<%=...%> 输出表达式
			生成service方法中
			不能";"结尾
		<%!...%> 声明成员
cookie:浏览器端会话技术
	由服务器生成,key=value格式,通过响应头(set-cookie)写回浏览器
	保存在浏览器端,当浏览器下一次访问的时候,根据一定的规则携带不同的cookie,通过请求头(cookie)携带
常用方法:
	构造:
		new Cookie(String key,String value);
	写回浏览器:
		response.addCookie(Cookie c)
	获取:
		Cookie[] request.getCookies();
	cookie的api:
		getName():获取cookie的名称
		getValue():获取cookie的值
		
		setMaxAge(int 秒):设置cookie在浏览器的存活时间
			若设置为0:删除cookie(前提必须路径保持一致)
		setPath(String path):设置cookie的路径  /day1101/
			若访问的路径中包含cookie的path,则携带过去
	注意:
		cookie不能跨浏览器
		cookie中不支持中文
///////////////////////
session:
	服务器端会话技术:
	依赖于cookie
		浏览器访问服务器,服务器获取jsessionid
			若获取不到
				创建一个sesion,将数据保存,将当前session的jsessionid通过cookie返回浏览器
			若获取到
				拿着该jsessionid去session池中查找有无该session
					若查找到:
						直接拿过来使用,将jsessionid写回浏览器
					若查找不到
						创建一个sesion,将数据保存,将当前session的jsessionid通过cookie返回浏览器
	
	常用方法:
		获取session:
			HttpSession request.getSession():
			
	域对象:
		session
		生命周期
			创建:java代码中可以认为 第一次使用request.getSession创建
			销毁:
				服务器关闭
				session超时
					默认超时
					手动设置超时
				★手动干掉session 
					session.invalidate()
	/////////////////////////////////
