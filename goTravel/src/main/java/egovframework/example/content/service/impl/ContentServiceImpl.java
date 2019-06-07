package egovframework.example.content.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.content.service.ContentService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service
public class ContentServiceImpl implements ContentService{
	
	@Resource
	private ContentMapper contentMapper;
	
	@Override
	public List<EgovMap> selectContentServiceList(Map map) throws Exception {
		String keyword = (String) map.get("region");
		System.out.println("확인확인:" + keyword);
		
		List<EgovMap> searchResult = contentMapper.selectContentServiceList(keyword);
		return searchResult;
	}

}
