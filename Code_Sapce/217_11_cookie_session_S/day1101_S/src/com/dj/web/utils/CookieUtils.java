package com.dj.web.utils;

import javax.servlet.http.Cookie;

public class CookieUtils {
	public static Cookie getCookieByName(String name, Cookie[] cookies) {
		if (cookies!=null) {
			//通过名称获取

			for (Cookie c : cookies) {
				if (name.equals(c.getName())) {
					return c;
				}
			}
			
		}
		return null;
	}
}
