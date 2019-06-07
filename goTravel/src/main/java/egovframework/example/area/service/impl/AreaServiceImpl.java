package egovframework.example.area.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.area.service.AreaService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service
public class AreaServiceImpl implements AreaService {

	@Resource
	private AreaMapper areaMapper;

	@Override
	public List<EgovMap> selectAreaServiceList() throws Exception {
		List<EgovMap> areaResult = areaMapper.selectAreaServiceList();
		return areaResult;
	}
}
