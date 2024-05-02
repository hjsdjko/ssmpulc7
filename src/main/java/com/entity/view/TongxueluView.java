package com.entity.view;

import com.entity.TongxueluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 同学录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 17:40:48
 */
@TableName("tongxuelu")
public class TongxueluView  extends TongxueluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TongxueluView(){
	}
 
 	public TongxueluView(TongxueluEntity tongxueluEntity){
 	try {
			BeanUtils.copyProperties(this, tongxueluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
