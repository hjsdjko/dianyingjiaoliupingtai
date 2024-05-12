package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.DianyingLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 电影评价
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("dianying_liuyan")
public class DianyingLiuyanView extends DianyingLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 电影信息
		/**
		* 电影名称
		*/

		@ColumnInfo(comment="电影名称",type="varchar(200)")
		private String dianyingName;
		/**
		* 电影类型
		*/
		@ColumnInfo(comment="电影类型",type="int(11)")
		private Integer dianyingTypes;
			/**
			* 电影类型的值
			*/
			@ColumnInfo(comment="电影类型的字典表值",type="varchar(200)")
			private String dianyingValue;
		/**
		* 封    面
		*/

		@ColumnInfo(comment="封    面",type="varchar(200)")
		private String dianyingPhoto;
		/**
		* 视    频
		*/

		@ColumnInfo(comment="视    频",type="varchar(200)")
		private String dianyingVideo;
		/**
		* 更新时间
		*/

		@ColumnInfo(comment="更新时间",type="varchar(200)")
		private String dianyingShijian;
		/**
		* 出品公司
		*/

		@ColumnInfo(comment="出品公司",type="varchar(200)")
		private String dianyingFaxing;
		/**
		* 地    区
		*/

		@ColumnInfo(comment="地    区",type="varchar(200)")
		private String dianyingAdd;
		/**
		* 发行公司
		*/

		@ColumnInfo(comment="发行公司",type="varchar(200)")
		private String dianyingGs;
		/**
		* 发行日期
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
		@DateTimeFormat
		@ColumnInfo(comment="发行日期",type="date")
		private Date chuchangTime;
		/**
		* 时    长
		*/

		@ColumnInfo(comment="时    长",type="varchar(200)")
		private String dianyingSc;
		/**
		* 导    演
		*/

		@ColumnInfo(comment="导    演",type="varchar(200)")
		private String dianyingDaoyan;
		/**
		* 价    格
		*/
		@ColumnInfo(comment="价    格",type="decimal(10,2)")
		private Double dianyingNewMoney;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 电影详情
		*/

		@ColumnInfo(comment="电影详情",type="text")
		private String dianyingContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer dianyingDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 头像
		*/

		@ColumnInfo(comment="头像",type="varchar(255)")
		private String yonghuPhoto;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 假删
		*/

		@ColumnInfo(comment="假删",type="int(11)")
		private Integer yonghuDelete;



	public DianyingLiuyanView() {

	}

	public DianyingLiuyanView(DianyingLiuyanEntity dianyingLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, dianyingLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 电影信息

		/**
		* 获取： 电影名称
		*/
		public String getDianyingName() {
			return dianyingName;
		}
		/**
		* 设置： 电影名称
		*/
		public void setDianyingName(String dianyingName) {
			this.dianyingName = dianyingName;
		}
		/**
		* 获取： 电影类型
		*/
		public Integer getDianyingTypes() {
			return dianyingTypes;
		}
		/**
		* 设置： 电影类型
		*/
		public void setDianyingTypes(Integer dianyingTypes) {
			this.dianyingTypes = dianyingTypes;
		}


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

		/**
		* 获取： 封    面
		*/
		public String getDianyingPhoto() {
			return dianyingPhoto;
		}
		/**
		* 设置： 封    面
		*/
		public void setDianyingPhoto(String dianyingPhoto) {
			this.dianyingPhoto = dianyingPhoto;
		}

		/**
		* 获取： 视    频
		*/
		public String getDianyingVideo() {
			return dianyingVideo;
		}
		/**
		* 设置： 视    频
		*/
		public void setDianyingVideo(String dianyingVideo) {
			this.dianyingVideo = dianyingVideo;
		}

		/**
		* 获取： 更新时间
		*/
		public String getDianyingShijian() {
			return dianyingShijian;
		}
		/**
		* 设置： 更新时间
		*/
		public void setDianyingShijian(String dianyingShijian) {
			this.dianyingShijian = dianyingShijian;
		}

		/**
		* 获取： 出品公司
		*/
		public String getDianyingFaxing() {
			return dianyingFaxing;
		}
		/**
		* 设置： 出品公司
		*/
		public void setDianyingFaxing(String dianyingFaxing) {
			this.dianyingFaxing = dianyingFaxing;
		}

		/**
		* 获取： 地    区
		*/
		public String getDianyingAdd() {
			return dianyingAdd;
		}
		/**
		* 设置： 地    区
		*/
		public void setDianyingAdd(String dianyingAdd) {
			this.dianyingAdd = dianyingAdd;
		}

		/**
		* 获取： 发行公司
		*/
		public String getDianyingGs() {
			return dianyingGs;
		}
		/**
		* 设置： 发行公司
		*/
		public void setDianyingGs(String dianyingGs) {
			this.dianyingGs = dianyingGs;
		}

		/**
		* 获取： 发行日期
		*/
		public Date getChuchangTime() {
			return chuchangTime;
		}
		/**
		* 设置： 发行日期
		*/
		public void setChuchangTime(Date chuchangTime) {
			this.chuchangTime = chuchangTime;
		}

		/**
		* 获取： 时    长
		*/
		public String getDianyingSc() {
			return dianyingSc;
		}
		/**
		* 设置： 时    长
		*/
		public void setDianyingSc(String dianyingSc) {
			this.dianyingSc = dianyingSc;
		}

		/**
		* 获取： 导    演
		*/
		public String getDianyingDaoyan() {
			return dianyingDaoyan;
		}
		/**
		* 设置： 导    演
		*/
		public void setDianyingDaoyan(String dianyingDaoyan) {
			this.dianyingDaoyan = dianyingDaoyan;
		}

		/**
		* 获取： 价    格
		*/
		public Double getDianyingNewMoney() {
			return dianyingNewMoney;
		}
		/**
		* 设置： 价    格
		*/
		public void setDianyingNewMoney(Double dianyingNewMoney) {
			this.dianyingNewMoney = dianyingNewMoney;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}

		/**
		* 获取： 电影详情
		*/
		public String getDianyingContent() {
			return dianyingContent;
		}
		/**
		* 设置： 电影详情
		*/
		public void setDianyingContent(String dianyingContent) {
			this.dianyingContent = dianyingContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getDianyingDelete() {
			return dianyingDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setDianyingDelete(Integer dianyingDelete) {
			this.dianyingDelete = dianyingDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 假删
		*/
		public Integer getYonghuDelete() {
			return yonghuDelete;
		}
		/**
		* 设置： 假删
		*/
		public void setYonghuDelete(Integer yonghuDelete) {
			this.yonghuDelete = yonghuDelete;
		}


	@Override
	public String toString() {
		return "DianyingLiuyanView{" +
			", dianyingName=" + dianyingName +
			", dianyingPhoto=" + dianyingPhoto +
			", dianyingVideo=" + dianyingVideo +
			", dianyingShijian=" + dianyingShijian +
			", dianyingFaxing=" + dianyingFaxing +
			", dianyingAdd=" + dianyingAdd +
			", dianyingGs=" + dianyingGs +
			", chuchangTime=" + DateUtil.convertString(chuchangTime,"yyyy-MM-dd") +
			", dianyingSc=" + dianyingSc +
			", dianyingDaoyan=" + dianyingDaoyan +
			", dianyingNewMoney=" + dianyingNewMoney +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", dianyingContent=" + dianyingContent +
			", dianyingDelete=" + dianyingDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuDelete=" + yonghuDelete +
			"} " + super.toString();
	}
}
