package com.dao;

import com.entity.XuexiaomingchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexiaomingchengVO;
import com.entity.view.XuexiaomingchengView;


/**
 * 学校名称
 * 
 * @author 
 * @email 
 * @date 2021-04-21 17:40:48
 */
public interface XuexiaomingchengDao extends BaseMapper<XuexiaomingchengEntity> {
	
	List<XuexiaomingchengVO> selectListVO(@Param("ew") Wrapper<XuexiaomingchengEntity> wrapper);
	
	XuexiaomingchengVO selectVO(@Param("ew") Wrapper<XuexiaomingchengEntity> wrapper);
	
	List<XuexiaomingchengView> selectListView(@Param("ew") Wrapper<XuexiaomingchengEntity> wrapper);

	List<XuexiaomingchengView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiaomingchengEntity> wrapper);
	
	XuexiaomingchengView selectView(@Param("ew") Wrapper<XuexiaomingchengEntity> wrapper);
	
}
