package test;

import org.junit.Test;

import com.xuguiping.common.utils.StringUtil;

public class JavaTest {
	@Test
	public void toHtml(){
		//����StringUtil��������toHtml()��������һ���ı���ȥ
		StringUtil.toHtml("asdqwr");
	}
	@Test
	public void isPhone(){
		//��StringUtil�������е��Ƿ�Ϊ�й������ֻ�����isPhone()���߷���
		boolean phone = StringUtil.isPhone("1651351");
		System.out.println(phone);
	}
	@Test
	public void isEmail(){
		//�Բ���StringUtil�������е��Ƿ�Ϊ����isEmail()���߷���
		boolean email = StringUtil.isEmail("asd@asd.com");
		System.out.println(email);
	}
}
