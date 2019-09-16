package com.itheima.demo;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodeDemo {

	public static void main(String[] args) throws Exception {
		String s="黑马";
		String s8=URLEncoder.encode(s, "utf-8");
		
		//System.out.println(s8);
		String so = URLDecoder.decode(s8, "iso8859-1");
		System.out.println(so);
		
		byte[] b = so.getBytes("iso-8859-1");
		String _s = new String(b, "utf-8");
		System.out.println(_s);
	}

}
