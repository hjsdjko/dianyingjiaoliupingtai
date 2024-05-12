package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.DianyingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 电影信息
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("dianying")
public class DianyingView extends DianyingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 电影类型的值
	*/
	@ColumnInfo(comment="电影类型的字典表值",type="varchar(200)")
	private String dianyingValue;




	public DianyingView() {

	}

	public DianyingView(DianyingEntity dianyingEntity) {
		try {
			BeanUtils.copyProperties(this, dianyingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 电影类型的值
	*/
	public String getDianyingValue() {
		return dianyingValue;
	}
	/**
	* 设置： 电影类型的值
	*/
	public void setDianyingValue(String dianyingValue) {
		this.dianyingValue = dianyingValue;
	}




	@Override
	public String toString() {
		return "DianyingView{" +
			", dianyingValue=" + dianyingValue +
			"} " + super.toString();
	}
}
