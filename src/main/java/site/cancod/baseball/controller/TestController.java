package site.cancod.baseball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.google.gson.Gson;

import site.cancod.baseball.service.TestService;
import site.cancod.baseball.vo.Article;

@Controller // @RestController 어노테이션을 입력하면 jsp 파일을 출력하지 않는다.
public class TestController {
	
	@Autowired
	private TestService testService;

	@GetMapping(value="/")
	public String test() {	
		
		Article article = testService.getData();
		
		Gson gson = new Gson();
		
		// return gson.toJson(article);
		return "hello";
	}
}
