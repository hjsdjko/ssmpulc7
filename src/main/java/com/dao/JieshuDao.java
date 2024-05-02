package com.dao;

import com.entity.JieshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JieshuVO;
import com.entity.view.JieshuView;


/**
 * 届数
 * 
 * @author 
 * @email 
 * @date 2021-04-21 17:40:48
 */
public interface JieshuDao extends BaseMapper<JieshuEntity> {
	
	List<JieshuVO> selectListVO(@Param("ew") Wrapper<JieshuEntity> wrapper);
	
	JieshuVO selectVO(@Param("ew") Wrapper<JieshuEntity> wrapper);
	
	List<JieshuView> selectListView(@Param("ew") Wrapper<JieshuEntity> wrapper);

	List<JieshuView> selectListView(Pagination page,@Param("ew") Wrapper<JieshuEntity> wrapper);
	
	JieshuView selectView(@Param("ew") Wrapper<JieshuEntity> wrapper);
	
}
