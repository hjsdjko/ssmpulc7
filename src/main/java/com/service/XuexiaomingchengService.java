package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexiaomingchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexiaomingchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiaomingchengView;


/**
 * 学校名称
 *
 * @author 
 * @email 
 * @date 2021-04-21 17:40:48
 */
public interface XuexiaomingchengService extends IService<XuexiaomingchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiaomingchengVO> selectListVO(Wrapper<XuexiaomingchengEntity> wrapper);
   	
   	XuexiaomingchengVO selectVO(@Param("ew") Wrapper<XuexiaomingchengEntity> wrapper);
   	
   	List<XuexiaomingchengView> selectListView(Wrapper<XuexiaomingchengEntity> wrapper);
   	
   	XuexiaomingchengView selectView(@Param("ew") Wrapper<XuexiaomingchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiaomingchengEntity> wrapper);
   	
}

