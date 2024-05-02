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


import com.dao.XuexiaomingchengDao;
import com.entity.XuexiaomingchengEntity;
import com.service.XuexiaomingchengService;
import com.entity.vo.XuexiaomingchengVO;
import com.entity.view.XuexiaomingchengView;

@Service("xuexiaomingchengService")
public class XuexiaomingchengServiceImpl extends ServiceImpl<XuexiaomingchengDao, XuexiaomingchengEntity> implements XuexiaomingchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiaomingchengEntity> page = this.selectPage(
                new Query<XuexiaomingchengEntity>(params).getPage(),
                new EntityWrapper<XuexiaomingchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiaomingchengEntity> wrapper) {
		  Page<XuexiaomingchengView> page =new Query<XuexiaomingchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexiaomingchengVO> selectListVO(Wrapper<XuexiaomingchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexiaomingchengVO selectVO(Wrapper<XuexiaomingchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexiaomingchengView> selectListView(Wrapper<XuexiaomingchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexiaomingchengView selectView(Wrapper<XuexiaomingchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
