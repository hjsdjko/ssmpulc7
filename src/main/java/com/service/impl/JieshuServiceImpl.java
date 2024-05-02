package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JieshuDao;
import com.entity.JieshuEntity;
import com.service.JieshuService;
import com.entity.vo.JieshuVO;
import com.entity.view.JieshuView;

@Service("jieshuService")
public class JieshuServiceImpl extends ServiceImpl<JieshuDao, JieshuEntity> implements JieshuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JieshuEntity> page = this.selectPage(
                new Query<JieshuEntity>(params).getPage(),
                new EntityWrapper<JieshuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JieshuEntity> wrapper) {
		  Page<JieshuView> page =new Query<JieshuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JieshuVO> selectListVO(Wrapper<JieshuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JieshuVO selectVO(Wrapper<JieshuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JieshuView> selectListView(Wrapper<JieshuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JieshuView selectView(Wrapper<JieshuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
