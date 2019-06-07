package egovframework.example.area;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.area.service.AreaService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Controller
public class AreaController {
	
	@Resource
	private AreaService areaService;
	
	@RequestMapping(value="area.do")
	public String initArea(HttpServletRequest req, ModelMap model) throws Exception {
		
		List<EgovMap> areaResult = areaService.selectAreaServiceList();
		
		System.out.println("---------지역데이터 확인---------: " + areaResult);
		
		model.addAttribute("cityName", areaResult);
		return "area/area.menu";
	}
}
