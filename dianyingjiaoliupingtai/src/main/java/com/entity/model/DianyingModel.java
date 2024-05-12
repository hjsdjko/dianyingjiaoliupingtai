package com.entity.model;

import com.entity.DianyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 电影信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DianyingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 电影名称
     */
    private String dianyingName;


    /**
     * 电影类型
     */
    private Integer dianyingTypes;


    /**
     * 封    面
     */
    private String dianyingPhoto;


    /**
     * 视    频
     */
    private String dianyingVideo;


    /**
     * 更新时间
     */
    private String dianyingShijian;


    /**
     * 出品公司
     */
    private String dianyingFaxing;


    /**
     * 地    区
     */
    private String dianyingAdd;


    /**
     * 发行公司
     */
    private String dianyingGs;


    /**
     * 发行日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date chuchangTime;


    /**
     * 时    长
     */
    private String dianyingSc;


    /**
     * 导    演
     */
    private String dianyingDaoyan;


    /**
     * 价    格
     */
    private Double dianyingNewMoney;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 电影详情
     */
    private String dianyingContent;


    /**
     * 逻辑删除
     */
    private Integer dianyingDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow homeMain
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show1 show2 photoShow homeMain
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow homeMain
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
