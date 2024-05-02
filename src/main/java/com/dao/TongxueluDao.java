package com.dao;

import com.entity.TongxueluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongxueluVO;
import com.entity.view.TongxueluView;


/**
 * 同学录
 * 
 * @author 
 * @email 
 * @date 2021-04-21 17:40:48
 */
public interface TongxueluDao extends BaseMapper<TongxueluEntity> {
	
	List<TongxueluVO> selectListVO(@Param("ew") Wrapper<TongxueluEntity> wrapper);
	
	TongxueluVO selectVO(@Param("ew") Wrapper<TongxueluEntity> wrapper);
	
	List<TongxueluView> selectListView(@Param("ew") Wrapper<TongxueluEntity> wrapper);

	List<TongxueluView> selectListView(Pagination page,@Param("ew") Wrapper<TongxueluEntity> wrapper);
	
	TongxueluView selectView(@Param("ew") Wrapper<TongxueluEntity> wrapper);
	
}
