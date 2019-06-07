package egovframework.example.seoul.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SeoulController {
	
	@RequestMapping(value="a-01.do") 
	public String A01Init(@RequestParam Map req) throws Exception {
		
		System.out.println(req);
		
		return "seoul/seoul.tiles2";
	}
}
