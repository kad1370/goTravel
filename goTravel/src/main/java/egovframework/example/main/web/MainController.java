package egovframework.example.main.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
	
	@RequestMapping(value="main.do") 
	public String initMain(HttpServletRequest req, @RequestParam Map<String, Object> map) throws Exception {
		
		return "main/main.tiles";
	}
}
