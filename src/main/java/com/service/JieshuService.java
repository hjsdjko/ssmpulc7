package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JieshuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JieshuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JieshuView;


/**
 * 届数
 *
 * @author 
 * @email 
 * @date 2021-04-21 17:40:48
 */
public interface JieshuService extends IService<JieshuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JieshuVO> selectListVO(Wrapper<JieshuEntity> wrapper);
   	
   	JieshuVO selectVO(@Param("ew") Wrapper<JieshuEntity> wrapper);
   	
   	List<JieshuView> selectListView(Wrapper<JieshuEntity> wrapper);
   	
   	JieshuView selectView(@Param("ew") Wrapper<JieshuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JieshuEntity> wrapper);
   	
}

