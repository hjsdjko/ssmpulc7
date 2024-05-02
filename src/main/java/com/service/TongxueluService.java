package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongxueluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongxueluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongxueluView;


/**
 * 同学录
 *
 * @author 
 * @email 
 * @date 2021-04-21 17:40:48
 */
public interface TongxueluService extends IService<TongxueluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongxueluVO> selectListVO(Wrapper<TongxueluEntity> wrapper);
   	
   	TongxueluVO selectVO(@Param("ew") Wrapper<TongxueluEntity> wrapper);
   	
   	List<TongxueluView> selectListView(Wrapper<TongxueluEntity> wrapper);
   	
   	TongxueluView selectView(@Param("ew") Wrapper<TongxueluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongxueluEntity> wrapper);
   	
}

