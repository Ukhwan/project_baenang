package com.bn.mapper;

import java.util.List;

import com.bn.model.CityVo;
import com.bn.model.ContentVo;

public interface InfoMapper {
	
	public ContentVo getTourData(String contentid);
	
	public int insertOverview(ContentVo vo);
	
	public String existOverview(String title);
	
	public CityVo getCityData(String cityname);

	public List<CityVo> getAllCityData();
}
