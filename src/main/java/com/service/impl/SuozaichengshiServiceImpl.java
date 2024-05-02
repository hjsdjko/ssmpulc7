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


import com.dao.SuozaichengshiDao;
import com.entity.SuozaichengshiEntity;
import com.service.SuozaichengshiService;
import com.entity.vo.SuozaichengshiVO;
import com.entity.view.SuozaichengshiView;

@Service("suozaichengshiService")
public class SuozaichengshiServiceImpl extends ServiceImpl<SuozaichengshiDao, SuozaichengshiEntity> implements SuozaichengshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SuozaichengshiEntity> page = this.selectPage(
                new Query<SuozaichengshiEntity>(params).getPage(),
                new EntityWrapper<SuozaichengshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SuozaichengshiEntity> wrapper) {
		  Page<SuozaichengshiView> page =new Query<SuozaichengshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SuozaichengshiVO> selectListVO(Wrapper<SuozaichengshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SuozaichengshiVO selectVO(Wrapper<SuozaichengshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SuozaichengshiView> selectListView(Wrapper<SuozaichengshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SuozaichengshiView selectView(Wrapper<SuozaichengshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
