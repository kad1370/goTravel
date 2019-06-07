package egovframework.example.content.service;

import java.util.List;
import java.util.Map;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface ContentService {

	List<EgovMap> selectContentServiceList(Map map) throws Exception;

}
