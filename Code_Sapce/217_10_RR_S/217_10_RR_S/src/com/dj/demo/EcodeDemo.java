package com.dj.demo;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EcodeDemo {
public static void main(String[] args) throws UnsupportedEncodingException {
	String s = "黑马";
	String s8 = URLEncoder.encode(s,"utf-8");
	System.out.println(s8);
	URLDecoder.decode(s8);
}
}
