package com.serviceindeed.yike.yikemo.domain;

import com.serviceindeed.yike.yikemo.domain.helper.Columns;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RechargeType extends Columns implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.RECHARGE_TYPE_ID
     *
     * @mbg.generated
     */
    private Long rechargeTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.RECHARGE_TYPE_NAME
     *
     * @mbg.generated
     */
    private String rechargeTypeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.VALID_MONTH
     *
     * @mbg.generated
     */
    private Integer validMonth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.STANDARD_PRICE
     *
     * @mbg.generated
     */
    private BigDecimal standardPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.MIN_PRICE
     *
     * @mbg.generated
     */
    private BigDecimal minPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.IS_ENABLE
     *
     * @mbg.generated
     */
    private String isEnable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.CREATE_BY
     *
     * @mbg.generated
     */
    private Long createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.CREATE_DATE
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.CREATE_PLATFORM
     *
     * @mbg.generated
     */
    private String createPlatform;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.CREATE_VERSION
     *
     * @mbg.generated
     */
    private String createVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.UPDATE_BY
     *
     * @mbg.generated
     */
    private Long updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.UPDATE_DATE
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.UPDATE_PLATFORM
     *
     * @mbg.generated
     */
    private String updatePlatform;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_type.UPDATE_VERSION
     *
     * @mbg.generated
     */
    private String updateVersion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.RECHARGE_TYPE_ID
     *
     * @return the value of t_recharge_type.RECHARGE_TYPE_ID
     *
     * @mbg.generated
     */
    public Long getRechargeTypeId() {
        return rechargeTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.RECHARGE_TYPE_ID
     *
     * @param rechargeTypeId the value for t_recharge_type.RECHARGE_TYPE_ID
     *
     * @mbg.generated
     */
    public void setRechargeTypeId(Long rechargeTypeId) {
        this.rechargeTypeId = rechargeTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.RECHARGE_TYPE_NAME
     *
     * @return the value of t_recharge_type.RECHARGE_TYPE_NAME
     *
     * @mbg.generated
     */
    public String getRechargeTypeName() {
        return rechargeTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.RECHARGE_TYPE_NAME
     *
     * @param rechargeTypeName the value for t_recharge_type.RECHARGE_TYPE_NAME
     *
     * @mbg.generated
     */
    public void setRechargeTypeName(String rechargeTypeName) {
        this.rechargeTypeName = rechargeTypeName == null ? null : rechargeTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.VALID_MONTH
     *
     * @return the value of t_recharge_type.VALID_MONTH
     *
     * @mbg.generated
     */
    public Integer getValidMonth() {
        return validMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.VALID_MONTH
     *
     * @param validMonth the value for t_recharge_type.VALID_MONTH
     *
     * @mbg.generated
     */
    public void setValidMonth(Integer validMonth) {
        this.validMonth = validMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.STANDARD_PRICE
     *
     * @return the value of t_recharge_type.STANDARD_PRICE
     *
     * @mbg.generated
     */
    public BigDecimal getStandardPrice() {
        return standardPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.STANDARD_PRICE
     *
     * @param standardPrice the value for t_recharge_type.STANDARD_PRICE
     *
     * @mbg.generated
     */
    public void setStandardPrice(BigDecimal standardPrice) {
        this.standardPrice = standardPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.MIN_PRICE
     *
     * @return the value of t_recharge_type.MIN_PRICE
     *
     * @mbg.generated
     */
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.MIN_PRICE
     *
     * @param minPrice the value for t_recharge_type.MIN_PRICE
     *
     * @mbg.generated
     */
    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.IS_ENABLE
     *
     * @return the value of t_recharge_type.IS_ENABLE
     *
     * @mbg.generated
     */
    public String getIsEnable() {
        return isEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.IS_ENABLE
     *
     * @param isEnable the value for t_recharge_type.IS_ENABLE
     *
     * @mbg.generated
     */
    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.CREATE_BY
     *
     * @return the value of t_recharge_type.CREATE_BY
     *
     * @mbg.generated
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.CREATE_BY
     *
     * @param createBy the value for t_recharge_type.CREATE_BY
     *
     * @mbg.generated
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.CREATE_DATE
     *
     * @return the value of t_recharge_type.CREATE_DATE
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.CREATE_DATE
     *
     * @param createDate the value for t_recharge_type.CREATE_DATE
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.CREATE_PLATFORM
     *
     * @return the value of t_recharge_type.CREATE_PLATFORM
     *
     * @mbg.generated
     */
    public String getCreatePlatform() {
        return createPlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.CREATE_PLATFORM
     *
     * @param createPlatform the value for t_recharge_type.CREATE_PLATFORM
     *
     * @mbg.generated
     */
    public void setCreatePlatform(String createPlatform) {
        this.createPlatform = createPlatform == null ? null : createPlatform.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.CREATE_VERSION
     *
     * @return the value of t_recharge_type.CREATE_VERSION
     *
     * @mbg.generated
     */
    public String getCreateVersion() {
        return createVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.CREATE_VERSION
     *
     * @param createVersion the value for t_recharge_type.CREATE_VERSION
     *
     * @mbg.generated
     */
    public void setCreateVersion(String createVersion) {
        this.createVersion = createVersion == null ? null : createVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.UPDATE_BY
     *
     * @return the value of t_recharge_type.UPDATE_BY
     *
     * @mbg.generated
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.UPDATE_BY
     *
     * @param updateBy the value for t_recharge_type.UPDATE_BY
     *
     * @mbg.generated
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.UPDATE_DATE
     *
     * @return the value of t_recharge_type.UPDATE_DATE
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.UPDATE_DATE
     *
     * @param updateDate the value for t_recharge_type.UPDATE_DATE
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.UPDATE_PLATFORM
     *
     * @return the value of t_recharge_type.UPDATE_PLATFORM
     *
     * @mbg.generated
     */
    public String getUpdatePlatform() {
        return updatePlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.UPDATE_PLATFORM
     *
     * @param updatePlatform the value for t_recharge_type.UPDATE_PLATFORM
     *
     * @mbg.generated
     */
    public void setUpdatePlatform(String updatePlatform) {
        this.updatePlatform = updatePlatform == null ? null : updatePlatform.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_type.UPDATE_VERSION
     *
     * @return the value of t_recharge_type.UPDATE_VERSION
     *
     * @mbg.generated
     */
    public String getUpdateVersion() {
        return updateVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_type.UPDATE_VERSION
     *
     * @param updateVersion the value for t_recharge_type.UPDATE_VERSION
     *
     * @mbg.generated
     */
    public void setUpdateVersion(String updateVersion) {
        this.updateVersion = updateVersion == null ? null : updateVersion.trim();
    }
}