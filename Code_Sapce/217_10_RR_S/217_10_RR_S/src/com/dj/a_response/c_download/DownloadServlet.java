package com.dj.a_response.c_download;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import com.dj.Utils.DownLoadUtils;

import sun.nio.ch.IOUtil;

/**
 * Servlet implementation class DownloadServlet
 */
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取下载文件的名称
		String filename = request.getParameter("name");
		System.out.println(filename);
		ServletContext context = this.getServletContext();
		//注意中文乱码
		filename = new String(filename.getBytes("iso-8859-1"),"utf-8");
		//文件下载
		//1.设置文件的mineTpye
		String mimeType = context.getMimeType(filename);
		System.out.println(mimeType);
		response.setContentType(mimeType);
		//2.设置下载头信息
		//上午
		//response.setHeader("content-disposition", "attachment;filename="+filename);
		//常见的浏览器
		//response.setHeader("content-disposition", "attachment;filename="+URLEncoder.encode(filename, "utf-8"));
		
		//通过工具类编码
		String _filename =  DownLoadUtils.getName(request.getHeader("user-agent"), filename);
		response.setHeader("content-disposition", "attachment;filename="+_filename);
		
		//3.对拷流
		InputStream is = context.getResourceAsStream("/download/"+filename);
		//获取输出流
		ServletOutputStream os = response.getOutputStream();
//		int len = -1;
//		byte[] b = new byte[1024];
//		while ((len=is.read(b))!=-1) {
//			os.write(b,0,len);
//		}
		IOUtils.copy(is, os);
		os.close();
		is.close();
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}