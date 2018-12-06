package com.lee.android;




import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//html 대신에 csv 나 json을 리턴하는 Controller를 만들어주는 어노테이션 
@RestController
public class DataController {
	
	
	@RequestMapping(value="data.csv",method=RequestMethod.GET)
	public String csv(HttpServletResponse response){
		response.setCharacterEncoding("utf-8");
	
		
		return "AOA,EXO,수지,아이린";
	}

}
