package com.xuguiping.common.utils;

public class StringUtil {
	
	public static void toHtml(String text){
		System.out.println(text);
	}
	public static boolean isPhone(String phone){
		//ʵ�ִ���
		String reg="";
		return false;
	}
	public static boolean isEmail(String email){
		//ʵ�ִ���
		String reg="";
		return false;
	}
	
	public static boolean hasText(String text){
		if(text!=null&&!"".equals(text)){
			return true;
		}else{
			return false;
		}
	}
	
	
}
