package com.xuguiping.common.Javacontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xuguiping.common.utils.StringUtil;
@Controller
public class JavaController {
	@RequestMapping("hasText.do")
	public String hasText(String text){
		StringUtil.toHtml(text);
		return "redirect:text.jsp";
	}
	

}
