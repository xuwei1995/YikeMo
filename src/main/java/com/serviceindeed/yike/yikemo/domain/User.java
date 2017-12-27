package com.serviceindeed.yike.yikemo.domain;

import com.serviceindeed.yike.yikemo.domain.helper.Columns;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;

public class User extends Columns  implements Serializable{

    private static final long serialVersionUID = -7810168718373868640L;

    public User() {
    }

    public User(User user) {
        super();
        this.userId = user.getUserId();
        this.userName = user.getIfkCode();
        this.mobile = user.getMobile();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.ifkCode = user.getIfkCode();
        this.gender = user.getGender();
        this.birthday =user.getBirthday() ;
        this.remark = user.getRemark();
        this.isEnable = user.getIsEnable();
        this.userType = user.getUserType();
        this.photo = user.getPhoto();
        this.signature = user.getSignature();
        this.createBy = user.getCreateBy();
        this.createDate = user.getCreateDate();
        this.createPlatform = user.getCreatePlatform();
        this.createVersion = user.getCreateVersion();
        this.updateBy = user.getUpdateBy();
        this.updateDate = user.getUpdateDate();
        this.updatePlatform = user.getUpdatePlatform();
        this.updateVersion = user.getUpdateVersion();
        this.idCard = user.getIdCard();
    }


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_ID
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.IFK_CODE
     *
     * @mbg.generated
     */
    private String ifkCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.PASSWORD
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_NAME
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.MOBILE
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.EMAIL
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.GENDER
     *
     * @mbg.generated
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.BIRTHDAY
     *
     * @mbg.generated
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.REMARK
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.IS_ENABLE
     *
     * @mbg.generated
     */
    private String isEnable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_TYPE
     *
     * @mbg.generated
     */
    private String userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.PHOTO
     *
     * @mbg.generated
     */
    private String photo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.SIGNATURE
     *
     * @mbg.generated
     */
    private String signature;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.CREATE_BY
     *
     * @mbg.generated
     */
    private Long createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.CREATE_DATE
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.CREATE_PLATFORM
     *
     * @mbg.generated
     */
    private String createPlatform;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.CREATE_VERSION
     *
     * @mbg.generated
     */
    private String createVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.UPDATE_BY
     *
     * @mbg.generated
     */
    private Long updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.UPDATE_DATE
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.UPDATE_PLATFORM
     *
     * @mbg.generated
     */
    private String updatePlatform;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.UPDATE_VERSION
     *
     * @mbg.generated
     */
    private String updateVersion;
    private String idCard;
    private Long roleId;
    private String createName;
    private String roleName;
    private String isEnableLabel;
    private MultipartFile photoImg;
    private String userTypeLabel;

    public String getUserTypeLabel() {
        return userTypeLabel;
    }

    public void setUserTypeLabel(String userTypeLabel) {
        this.userTypeLabel = userTypeLabel;
    }

    public MultipartFile getPhotoImg() {
        return photoImg;
    }

    public void setPhotoImg(MultipartFile photoImg) {
        this.photoImg = photoImg;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getIsEnableLabel() {
        return isEnableLabel;
    }

    public void setIsEnableLabel(String isEnableLabel) {
        this.isEnableLabel = isEnableLabel;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getIdCard() {
        return idCard;
    }


    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_ID
     *
     * @return the value of t_user.USER_ID
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_ID
     *
     * @param userId the value for t_user.USER_ID
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.IFK_CODE
     *
     * @return the value of t_user.IFK_CODE
     *
     * @mbg.generated
     */
    public String getIfkCode() {
        return ifkCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.IFK_CODE
     *
     * @param ifkCode the value for t_user.IFK_CODE
     *
     * @mbg.generated
     */
    public void setIfkCode(String ifkCode) {
        this.ifkCode = ifkCode == null ? null : ifkCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.PASSWORD
     *
     * @return the value of t_user.PASSWORD
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.PASSWORD
     *
     * @param password the value for t_user.PASSWORD
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_NAME
     *
     * @return the value of t_user.USER_NAME
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_NAME
     *
     * @param userName the value for t_user.USER_NAME
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.MOBILE
     *
     * @return the value of t_user.MOBILE
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.MOBILE
     *
     * @param mobile the value for t_user.MOBILE
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.EMAIL
     *
     * @return the value of t_user.EMAIL
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.EMAIL
     *
     * @param email the value for t_user.EMAIL
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.GENDER
     *
     * @return the value of t_user.GENDER
     *
     * @mbg.generated
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.GENDER
     *
     * @param gender the value for t_user.GENDER
     *
     * @mbg.generated
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.BIRTHDAY
     *
     * @return the value of t_user.BIRTHDAY
     *
     * @mbg.generated
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.BIRTHDAY
     *
     * @param birthday the value for t_user.BIRTHDAY
     *
     * @mbg.generated
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.REMARK
     *
     * @return the value of t_user.REMARK
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.REMARK
     *
     * @param remark the value for t_user.REMARK
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.IS_ENABLE
     *
     * @return the value of t_user.IS_ENABLE
     *
     * @mbg.generated
     */
    public String getIsEnable() {
        return isEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.IS_ENABLE
     *
     * @param isEnable the value for t_user.IS_ENABLE
     *
     * @mbg.generated
     */
    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_TYPE
     *
     * @return the value of t_user.USER_TYPE
     *
     * @mbg.generated
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_TYPE
     *
     * @param userType the value for t_user.USER_TYPE
     *
     * @mbg.generated
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.PHOTO
     *
     * @return the value of t_user.PHOTO
     *
     * @mbg.generated
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.PHOTO
     *
     * @param photo the value for t_user.PHOTO
     *
     * @mbg.generated
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.SIGNATURE
     *
     * @return the value of t_user.SIGNATURE
     *
     * @mbg.generated
     */
    public String getSignature() {
        return signature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.SIGNATURE
     *
     * @param signature the value for t_user.SIGNATURE
     *
     * @mbg.generated
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.CREATE_BY
     *
     * @return the value of t_user.CREATE_BY
     *
     * @mbg.generated
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.CREATE_BY
     *
     * @param createBy the value for t_user.CREATE_BY
     *
     * @mbg.generated
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.CREATE_DATE
     *
     * @return the value of t_user.CREATE_DATE
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.CREATE_DATE
     *
     * @param createDate the value for t_user.CREATE_DATE
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.CREATE_PLATFORM
     *
     * @return the value of t_user.CREATE_PLATFORM
     *
     * @mbg.generated
     */
    public String getCreatePlatform() {
        return createPlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.CREATE_PLATFORM
     *
     * @param createPlatform the value for t_user.CREATE_PLATFORM
     *
     * @mbg.generated
     */
    public void setCreatePlatform(String createPlatform) {
        this.createPlatform = createPlatform == null ? null : createPlatform.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.CREATE_VERSION
     *
     * @return the value of t_user.CREATE_VERSION
     *
     * @mbg.generated
     */
    public String getCreateVersion() {
        return createVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.CREATE_VERSION
     *
     * @param createVersion the value for t_user.CREATE_VERSION
     *
     * @mbg.generated
     */
    public void setCreateVersion(String createVersion) {
        this.createVersion = createVersion == null ? null : createVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.UPDATE_BY
     *
     * @return the value of t_user.UPDATE_BY
     *
     * @mbg.generated
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.UPDATE_BY
     *
     * @param updateBy the value for t_user.UPDATE_BY
     *
     * @mbg.generated
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.UPDATE_DATE
     *
     * @return the value of t_user.UPDATE_DATE
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.UPDATE_DATE
     *
     * @param updateDate the value for t_user.UPDATE_DATE
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.UPDATE_PLATFORM
     *
     * @return the value of t_user.UPDATE_PLATFORM
     *
     * @mbg.generated
     */
    public String getUpdatePlatform() {
        return updatePlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.UPDATE_PLATFORM
     *
     * @param updatePlatform the value for t_user.UPDATE_PLATFORM
     *
     * @mbg.generated
     */
    public void setUpdatePlatform(String updatePlatform) {
        this.updatePlatform = updatePlatform == null ? null : updatePlatform.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.UPDATE_VERSION
     *
     * @return the value of t_user.UPDATE_VERSION
     *
     * @mbg.generated
     */
    public String getUpdateVersion() {
        return updateVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.UPDATE_VERSION
     *
     * @param updateVersion the value for t_user.UPDATE_VERSION
     *
     * @mbg.generated
     */
    public void setUpdateVersion(String updateVersion) {
        this.updateVersion = updateVersion == null ? null : updateVersion.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", ifkCode='" + ifkCode + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", remark='" + remark + '\'' +
                ", isEnable='" + isEnable + '\'' +
                ", userType='" + userType + '\'' +
                ", photo='" + photo + '\'' +
                ", signature='" + signature + '\'' +
                ", createBy=" + createBy +
                ", createDate=" + createDate +
                ", createPlatform='" + createPlatform + '\'' +
                ", createVersion='" + createVersion + '\'' +
                ", updateBy=" + updateBy +
                ", updateDate=" + updateDate +
                ", updatePlatform='" + updatePlatform + '\'' +
                ", updateVersion='" + updateVersion + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}