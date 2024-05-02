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


import com.dao.TongxueluDao;
import com.entity.TongxueluEntity;
import com.service.TongxueluService;
import com.entity.vo.TongxueluVO;
import com.entity.view.TongxueluView;

@Service("tongxueluService")
public class TongxueluServiceImpl extends ServiceImpl<TongxueluDao, TongxueluEntity> implements TongxueluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongxueluEntity> page = this.selectPage(
                new Query<TongxueluEntity>(params).getPage(),
                new EntityWrapper<TongxueluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongxueluEntity> wrapper) {
		  Page<TongxueluView> page =new Query<TongxueluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongxueluVO> selectListVO(Wrapper<TongxueluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongxueluVO selectVO(Wrapper<TongxueluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongxueluView> selectListView(Wrapper<TongxueluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongxueluView selectView(Wrapper<TongxueluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
