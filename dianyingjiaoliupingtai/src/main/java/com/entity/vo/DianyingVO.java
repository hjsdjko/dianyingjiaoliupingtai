package com.entity.vo;

import com.entity.DianyingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 电影信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dianying")
public class DianyingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 电影名称
     */

    @TableField(value = "dianying_name")
    private String dianyingName;


    /**
     * 电影类型
     */

    @TableField(value = "dianying_types")
    private Integer dianyingTypes;


    /**
     * 封    面
     */

    @TableField(value = "dianying_photo")
    private String dianyingPhoto;


    /**
     * 视    频
     */

    @TableField(value = "dianying_video")
    private String dianyingVideo;


    /**
     * 更新时间
     */

    @TableField(value = "dianying_shijian")
    private String dianyingShijian;


    /**
     * 出品公司
     */

    @TableField(value = "dianying_faxing")
    private String dianyingFaxing;


    /**
     * 地    区
     */

    @TableField(value = "dianying_add")
    private String dianyingAdd;


    /**
     * 发行公司
     */

    @TableField(value = "dianying_gs")
    private String dianyingGs;


    /**
     * 发行日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "chuchang_time")
    private Date chuchangTime;


    /**
     * 时    长
     */

    @TableField(value = "dianying_sc")
    private String dianyingSc;


    /**
     * 导    演
     */

    @TableField(value = "dianying_daoyan")
    private String dianyingDaoyan;


    /**
     * 价    格
     */

    @TableField(value = "dianying_new_money")
    private Double dianyingNewMoney;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 电影详情
     */

    @TableField(value = "dianying_content")
    private String dianyingContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "dianying_delete")
    private Integer dianyingDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow homeMain
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：电影名称
	 */
    public String getDianyingName() {
        return dianyingName;
    }


    /**
	 * 获取：电影名称
	 */

    public void setDianyingName(String dianyingName) {
        this.dianyingName = dianyingName;
    }
    /**
	 * 设置：电影类型
	 */
    public Integer getDianyingTypes() {
        return dianyingTypes;
    }


    /**
	 * 获取：电影类型
	 */

    public void setDianyingTypes(Integer dianyingTypes) {
        this.dianyingTypes = dianyingTypes;
    }
    /**
	 * 设置：封    面
	 */
    public String getDianyingPhoto() {
        return dianyingPhoto;
    }


    /**
	 * 获取：封    面
	 */

    public void setDianyingPhoto(String dianyingPhoto) {
        this.dianyingPhoto = dianyingPhoto;
    }
    /**
	 * 设置：视    频
	 */
    public String getDianyingVideo() {
        return dianyingVideo;
    }


    /**
	 * 获取：视    频
	 */

    public void setDianyingVideo(String dianyingVideo) {
        this.dianyingVideo = dianyingVideo;
    }
    /**
	 * 设置：更新时间
	 */
    public String getDianyingShijian() {
        return dianyingShijian;
    }


    /**
	 * 获取：更新时间
	 */

    public void setDianyingShijian(String dianyingShijian) {
        this.dianyingShijian = dianyingShijian;
    }
    /**
	 * 设置：出品公司
	 */
    public String getDianyingFaxing() {
        return dianyingFaxing;
    }


    /**
	 * 获取：出品公司
	 */

    public void setDianyingFaxing(String dianyingFaxing) {
        this.dianyingFaxing = dianyingFaxing;
    }
    /**
	 * 设置：地    区
	 */
    public String getDianyingAdd() {
        return dianyingAdd;
    }


    /**
	 * 获取：地    区
	 */

    public void setDianyingAdd(String dianyingAdd) {
        this.dianyingAdd = dianyingAdd;
    }
    /**
	 * 设置：发行公司
	 */
    public String getDianyingGs() {
        return dianyingGs;
    }


    /**
	 * 获取：发行公司
	 */

    public void setDianyingGs(String dianyingGs) {
        this.dianyingGs = dianyingGs;
    }
    /**
	 * 设置：发行日期
	 */
    public Date getChuchangTime() {
        return chuchangTime;
    }


    /**
	 * 获取：发行日期
	 */

    public void setChuchangTime(Date chuchangTime) {
        this.chuchangTime = chuchangTime;
    }
    /**
	 * 设置：时    长
	 */
    public String getDianyingSc() {
        return dianyingSc;
    }


    /**
	 * 获取：时    长
	 */

    public void setDianyingSc(String dianyingSc) {
        this.dianyingSc = dianyingSc;
    }
    /**
	 * 设置：导    演
	 */
    public String getDianyingDaoyan() {
        return dianyingDaoyan;
    }


    /**
	 * 获取：导    演
	 */

    public void setDianyingDaoyan(String dianyingDaoyan) {
        this.dianyingDaoyan = dianyingDaoyan;
    }
    /**
	 * 设置：价    格
	 */
    public Double getDianyingNewMoney() {
        return dianyingNewMoney;
    }


    /**
	 * 获取：价    格
	 */

    public void setDianyingNewMoney(Double dianyingNewMoney) {
        this.dianyingNewMoney = dianyingNewMoney;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：电影详情
	 */
    public String getDianyingContent() {
        return dianyingContent;
    }


    /**
	 * 获取：电影详情
	 */

    public void setDianyingContent(String dianyingContent) {
        this.dianyingContent = dianyingContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getDianyingDelete() {
        return dianyingDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setDianyingDelete(Integer dianyingDelete) {
        this.dianyingDelete = dianyingDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow homeMain
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow homeMain
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
