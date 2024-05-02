package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SuozaichengshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SuozaichengshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SuozaichengshiView;


/**
 * 所在城市
 *
 * @author 
 * @email 
 * @date 2021-04-21 17:40:48
 */
public interface SuozaichengshiService extends IService<SuozaichengshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SuozaichengshiVO> selectListVO(Wrapper<SuozaichengshiEntity> wrapper);
   	
   	SuozaichengshiVO selectVO(@Param("ew") Wrapper<SuozaichengshiEntity> wrapper);
   	
   	List<SuozaichengshiView> selectListView(Wrapper<SuozaichengshiEntity> wrapper);
   	
   	SuozaichengshiView selectView(@Param("ew") Wrapper<SuozaichengshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SuozaichengshiEntity> wrapper);
   	
}

