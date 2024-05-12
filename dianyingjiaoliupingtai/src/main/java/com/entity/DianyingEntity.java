package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 电影信息
 *
 * @author 
 * @email
 */
@TableName("dianying")
public class DianyingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DianyingEntity() {

	}

	public DianyingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 电影名称
     */
    @ColumnInfo(comment="电影名称",type="varchar(200)")
    @TableField(value = "dianying_name")

    private String dianyingName;


    /**
     * 电影类型
     */
    @ColumnInfo(comment="电影类型",type="int(11)")
    @TableField(value = "dianying_types")

    private Integer dianyingTypes;


    /**
     * 封    面
     */
    @ColumnInfo(comment="封    面",type="varchar(200)")
    @TableField(value = "dianying_photo")

    private String dianyingPhoto;


    /**
     * 视    频
     */
    @ColumnInfo(comment="视    频",type="varchar(200)")
    @TableField(value = "dianying_video")

    private String dianyingVideo;


    /**
     * 更新时间
     */
    @ColumnInfo(comment="更新时间",type="varchar(200)")
    @TableField(value = "dianying_shijian")

    private String dianyingShijian;


    /**
     * 出品公司
     */
    @ColumnInfo(comment="出品公司",type="varchar(200)")
    @TableField(value = "dianying_faxing")

    private String dianyingFaxing;


    /**
     * 地    区
     */
    @ColumnInfo(comment="地    区",type="varchar(200)")
    @TableField(value = "dianying_add")

    private String dianyingAdd;


    /**
     * 发行公司
     */
    @ColumnInfo(comment="发行公司",type="varchar(200)")
    @TableField(value = "dianying_gs")

    private String dianyingGs;


    /**
     * 发行日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="发行日期",type="date")
    @TableField(value = "chuchang_time")

    private Date chuchangTime;


    /**
     * 时    长
     */
    @ColumnInfo(comment="时    长",type="varchar(200)")
    @TableField(value = "dianying_sc")

    private String dianyingSc;


    /**
     * 导    演
     */
    @ColumnInfo(comment="导    演",type="varchar(200)")
    @TableField(value = "dianying_daoyan")

    private String dianyingDaoyan;


    /**
     * 价    格
     */
    @ColumnInfo(comment="价    格",type="decimal(10,2)")
    @TableField(value = "dianying_new_money")

    private Double dianyingNewMoney;


    /**
     * 赞
     */
    @ColumnInfo(comment="赞",type="int(11)")
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @ColumnInfo(comment="踩",type="int(11)")
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 电影详情
     */
    @ColumnInfo(comment="电影详情",type="text")
    @TableField(value = "dianying_content")

    private String dianyingContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "dianying_delete")

    private Integer dianyingDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间     homeMain
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：电影名称
	 */
    public String getDianyingName() {
        return dianyingName;
    }
    /**
	 * 设置：电影名称
	 */

    public void setDianyingName(String dianyingName) {
        this.dianyingName = dianyingName;
    }
    /**
	 * 获取：电影类型
	 */
    public Integer getDianyingTypes() {
        return dianyingTypes;
    }
    /**
	 * 设置：电影类型
	 */

    public void setDianyingTypes(Integer dianyingTypes) {
        this.dianyingTypes = dianyingTypes;
    }
    /**
	 * 获取：封    面
	 */
    public String getDianyingPhoto() {
        return dianyingPhoto;
    }
    /**
	 * 设置：封    面
	 */

    public void setDianyingPhoto(String dianyingPhoto) {
        this.dianyingPhoto = dianyingPhoto;
    }
    /**
	 * 获取：视    频
	 */
    public String getDianyingVideo() {
        return dianyingVideo;
    }
    /**
	 * 设置：视    频
	 */

    public void setDianyingVideo(String dianyingVideo) {
        this.dianyingVideo = dianyingVideo;
    }
    /**
	 * 获取：更新时间
	 */
    public String getDianyingShijian() {
        return dianyingShijian;
    }
    /**
	 * 设置：更新时间
	 */

    public void setDianyingShijian(String dianyingShijian) {
        this.dianyingShijian = dianyingShijian;
    }
    /**
	 * 获取：出品公司
	 */
    public String getDianyingFaxing() {
        return dianyingFaxing;
    }
    /**
	 * 设置：出品公司
	 */

    public void setDianyingFaxing(String dianyingFaxing) {
        this.dianyingFaxing = dianyingFaxing;
    }
    /**
	 * 获取：地    区
	 */
    public String getDianyingAdd() {
        return dianyingAdd;
    }
    /**
	 * 设置：地    区
	 */

    public void setDianyingAdd(String dianyingAdd) {
        this.dianyingAdd = dianyingAdd;
    }
    /**
	 * 获取：发行公司
	 */
    public String getDianyingGs() {
        return dianyingGs;
    }
    /**
	 * 设置：发行公司
	 */

    public void setDianyingGs(String dianyingGs) {
        this.dianyingGs = dianyingGs;
    }
    /**
	 * 获取：发行日期
	 */
    public Date getChuchangTime() {
        return chuchangTime;
    }
    /**
	 * 设置：发行日期
	 */

    public void setChuchangTime(Date chuchangTime) {
        this.chuchangTime = chuchangTime;
    }
    /**
	 * 获取：时    长
	 */
    public String getDianyingSc() {
        return dianyingSc;
    }
    /**
	 * 设置：时    长
	 */

    public void setDianyingSc(String dianyingSc) {
        this.dianyingSc = dianyingSc;
    }
    /**
	 * 获取：导    演
	 */
    public String getDianyingDaoyan() {
        return dianyingDaoyan;
    }
    /**
	 * 设置：导    演
	 */

    public void setDianyingDaoyan(String dianyingDaoyan) {
        this.dianyingDaoyan = dianyingDaoyan;
    }
    /**
	 * 获取：价    格
	 */
    public Double getDianyingNewMoney() {
        return dianyingNewMoney;
    }
    /**
	 * 设置：价    格
	 */

    public void setDianyingNewMoney(Double dianyingNewMoney) {
        this.dianyingNewMoney = dianyingNewMoney;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 设置：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 设置：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：电影详情
	 */
    public String getDianyingContent() {
        return dianyingContent;
    }
    /**
	 * 设置：电影详情
	 */

    public void setDianyingContent(String dianyingContent) {
        this.dianyingContent = dianyingContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getDianyingDelete() {
        return dianyingDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setDianyingDelete(Integer dianyingDelete) {
        this.dianyingDelete = dianyingDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间     homeMain
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间     homeMain
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Dianying{" +
            ", id=" + id +
            ", dianyingName=" + dianyingName +
            ", dianyingTypes=" + dianyingTypes +
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
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
