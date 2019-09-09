package test;

import org.junit.Test;

import com.xuguiping.common.utils.StringUtil;

public class JavaTest {
	@Test
	public void toHtml(){
		//测试StringUtil工具类中toHtml()方法，传一段文本进去
		StringUtil.toHtml("asdqwr");
	}
	@Test
	public void isPhone(){
		//试StringUtil工具类中的是否为中国地区手机号码isPhone()工具方法
		boolean phone = StringUtil.isPhone("1651351");
		System.out.println(phone);
	}
	@Test
	public void isEmail(){
		//试测试StringUtil工具类中的是否为邮箱isEmail()工具方法
		boolean email = StringUtil.isEmail("asd@asd.com");
		System.out.println(email);
	}
}
