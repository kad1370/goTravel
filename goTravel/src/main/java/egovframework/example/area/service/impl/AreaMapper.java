package egovframework.example.area.service.impl;

import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper
public interface AreaMapper {

	List<EgovMap> selectAreaServiceList() throws Exception;

}
