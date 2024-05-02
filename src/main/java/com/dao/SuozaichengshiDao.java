package com.dao;

import com.entity.SuozaichengshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SuozaichengshiVO;
import com.entity.view.SuozaichengshiView;


/**
 * 所在城市
 * 
 * @author 
 * @email 
 * @date 2021-04-21 17:40:48
 */
public interface SuozaichengshiDao extends BaseMapper<SuozaichengshiEntity> {
	
	List<SuozaichengshiVO> selectListVO(@Param("ew") Wrapper<SuozaichengshiEntity> wrapper);
	
	SuozaichengshiVO selectVO(@Param("ew") Wrapper<SuozaichengshiEntity> wrapper);
	
	List<SuozaichengshiView> selectListView(@Param("ew") Wrapper<SuozaichengshiEntity> wrapper);

	List<SuozaichengshiView> selectListView(Pagination page,@Param("ew") Wrapper<SuozaichengshiEntity> wrapper);
	
	SuozaichengshiView selectView(@Param("ew") Wrapper<SuozaichengshiEntity> wrapper);
	
}
