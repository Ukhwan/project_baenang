package com.bn.mapper;

import java.util.List;

import com.bn.model.ContentVo;

public interface TourInfoMapper {
	
	public List<ContentVo> getCityData(String title);
	
	public int insertoverview(String title);
	
	public List<ContentVo> existOverview(String title);
	
}
