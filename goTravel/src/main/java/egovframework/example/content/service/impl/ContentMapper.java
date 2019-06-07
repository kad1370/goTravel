package egovframework.example.content.service.impl;

import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper
public interface ContentMapper {

	List<EgovMap> selectContentServiceList(String keyword) throws Exception;

}
