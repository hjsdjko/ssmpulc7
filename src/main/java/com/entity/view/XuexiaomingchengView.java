package com.entity.view;

import com.entity.XuexiaomingchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学校名称
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 17:40:48
 */
@TableName("xuexiaomingcheng")
public class XuexiaomingchengView  extends XuexiaomingchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexiaomingchengView(){
	}
 
 	public XuexiaomingchengView(XuexiaomingchengEntity xuexiaomingchengEntity){
 	try {
			BeanUtils.copyProperties(this, xuexiaomingchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
